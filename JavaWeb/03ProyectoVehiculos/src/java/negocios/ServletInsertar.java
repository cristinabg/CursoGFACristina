/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios;

import db.VehiculoDB;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelos.Auto;
import modelos.Camioneta;
import modelos.Moto;
import modelos.Vehiculo;

/**
 *
 * @author ac.barrios
 */
public class ServletInsertar extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String formulario = request.getParameter("formulario");

        if (formulario.equals("auto")) {
            request.setCharacterEncoding("UTF-8");
            Auto auto = new Auto();
            auto.setIdAuto(request.getParameter("idAuto"));
            auto.setMarca(request.getParameter("marca"));
            auto.setModelo(request.getParameter("modelo"));
            auto.setCosto(Double.parseDouble(request.getParameter("costo")));
            auto.setKilometros(Double.parseDouble(request.getParameter("km")));
            auto.setVuela(Boolean.parseBoolean(request.getParameter("vuela")));

            VehiculoDB bd = new VehiculoDB();
            try {
                if (bd.insertarVehiculo(auto)) {
                    response.sendRedirect("/success.html");
                }
            } catch (ClassNotFoundException ex) {
                System.out.println(ex);
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        } else if (formulario.equals("camioneta")) {
            request.setCharacterEncoding("UTF-8");
            Camioneta c = new Camioneta();
            c.setIdCamioneta(request.getParameter("idCamioneta"));
            c.setMarca(request.getParameter("marca"));
            c.setModelo(request.getParameter("modelo"));
            c.setCosto(Double.parseDouble(request.getParameter("costo")));
            c.setNumPuertas(Integer.parseInt(request.getParameter("numPuertas")));
            c.setColor(request.getParameter("color"));

            VehiculoDB bd = new VehiculoDB();
            try {
                if (bd.insertarVehiculo(c)) {
                    response.sendRedirect("/success.html");
                }
            } catch (ClassNotFoundException ex) {
                System.out.println(ex);
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        } else if (formulario.equals("moto")) {
            request.setCharacterEncoding("UTF-8");
            Moto m = new Moto();
            m.setIdMoto(request.getParameter("idMoto"));
            m.setMarca(request.getParameter("marca"));
            m.setModelo(request.getParameter("modelo"));
            m.setCosto(Double.parseDouble(request.getParameter("costo")));
            m.setAnio(Integer.parseInt(request.getParameter("anio")));
            m.setTipo(request.getParameter("tipo"));

            VehiculoDB bd = new VehiculoDB();
            try {
                if (bd.insertarVehiculo(m)) {
                    response.sendRedirect("/success.html");
                }
            } catch (ClassNotFoundException ex) {
                System.out.println(ex);
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
