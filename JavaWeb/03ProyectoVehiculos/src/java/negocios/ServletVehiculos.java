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
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelos.Auto;

/**
 *
 * @author ac.barrios
 */
public class ServletVehiculos extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String tipo = request.getParameter("tipo");
        String menu = request.getParameter("menu");
        if (menu.equals("Insertar")) {
            if (tipo.equals("auto")) {
                response.sendRedirect("AgregarAuto.html");
            } else if (tipo.equals("camioneta")) {
                response.sendRedirect("AgregarCamioneta.html");
            } else if (tipo.equals("moto")) {
                response.sendRedirect("AgregarMoto.html");
            }
        } else if (menu.equals("Consultar")) {
            if (tipo.equals("auto")) {
                response.sendRedirect("AgregarAuto.html");
            } else if (tipo.equals("camioneta")) {
                response.sendRedirect("AgregarCamioneta.html");
            } else if (tipo.equals("moto")) {
                response.sendRedirect("AgregarMoto.html");
            }
        } else if (menu.equals("Eliminar")) {
            if (tipo.equals("auto")) {
                response.sendRedirect("AgregarAuto.html");
            } else if (tipo.equals("camioneta")) {
                response.sendRedirect("AgregarCamioneta.html");
            } else if (tipo.equals("moto")) {
                response.sendRedirect("AgregarMoto.html");
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
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
/*  try {
                List<Object> lista = db.getVehiculos("auto");
                PrintWriter pw = response.getWriter();
                lista.forEach(autos -> pw.print(autos));
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }*/
