/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios;

import db.AutobusDB;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException; 
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelos.Autobus;

/**
 *
 * @author ac.barrios
 */
public class ServletAutobus extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         AutobusDB db = new AutobusDB();
       try{
       List<Autobus> lista = db.getAutobuses();
       PrintWriter pw = response.getWriter();
       lista.forEach(autobus -> pw.print(autobus));
       }catch(ClassNotFoundException ex){
           ex.printStackTrace();
       }catch(SQLException ex){
           ex.printStackTrace();
       }
        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            request.setCharacterEncoding("UTF-8");
            Autobus autobus = new Autobus();
            autobus.setNum_autobus(Integer.parseInt(request.getParameter("num_autobus")));
            autobus.setSiglas(request.getParameter("siglas"));
            autobus.setModelo(Integer.parseInt(request.getParameter("modelo")));
            autobus.setCapacidad(Integer.parseInt(request.getParameter("capacidad")));
            autobus.setBase(request.getParameter("base"));
            
            AutobusDB db = new AutobusDB();
      
        try {
            if(db.insertarAutobus(autobus)){
                response.sendRedirect("/success.html");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServletAutobus.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ServletAutobus.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
