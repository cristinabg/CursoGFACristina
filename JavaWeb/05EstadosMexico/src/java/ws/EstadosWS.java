
package ws;
import bd.estadoBD;
import java.sql.SQLException;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.WebParam;
import javax.jws.WebResult;
import modelos.Estado;

@WebService
public interface EstadosWS {
    @WebMethod
    public String getCapital(String n) throws ClassNotFoundException, SQLException;
    
    @WebMethod
    public int getPoblacion(String n) throws ClassNotFoundException, SQLException;
    
    @WebMethod
    @WebResult (name="nombreEstado")
    public Estado[] getEstados()throws ClassNotFoundException, SQLException;
}
