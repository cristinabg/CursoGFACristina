
package ws.holamundo;

import java.io.File;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 *
 * @author ac.barrios
 */
@Path("/html")
public class archivoWS {
    @GET
    @Path("/{nombre}")
    public Response obtenerArchivo(@PathParam("nombre") String nombre){
        ClassLoader cl= getClass().getClassLoader();
        try{
        File archivo = new File(cl.getResource("/html/"+nombre+".html").getFile());
        return Response.status(200).entity(archivo).build();
        }catch(NullPointerException ex){
             return Response.status(404).entity(new File(cl.getResource("/html/404.html").getFile())).build();
        }
    }
}
