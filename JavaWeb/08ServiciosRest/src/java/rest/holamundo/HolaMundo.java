/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest.holamundo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author ac.barrios
 */
@Path("/HolaMundo")
public class HolaMundo {
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String holaMundo (){
    return "Hola Mundo";    
    }
    
    @GET
    @Produces(MediaType.TEXT_XML)
    public String holaMundoXML(){
        return "<?xml version=\"1.0\">"+
                "<hola>Hola Mundo</hola>";
    }
    
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String holaMundoHTML(){
        return "<html>"+
                "<body>"+
                "<h1>Hola Mundo</h1>"+
                "</body>"+
                "</html>";
    }
}
