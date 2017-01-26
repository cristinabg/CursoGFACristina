/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import bd.estadoBD;
import java.sql.SQLException;
import javax.jws.WebResult;
import modelos.Estado;
/**
 *
 * @author ac.barrios
 */
@WebService
public class IEstadosWS implements EstadosWS {
     @WebMethod
     @Override
    public String getCapital(@WebParam(name ="nombreEstado")String n) throws ClassNotFoundException, SQLException{
       return estadoBD.getCapital(n);
    }
    
    @WebMethod
    @Override
    public int getPoblacion(@WebParam(name ="nombreEstado")String n) throws ClassNotFoundException, SQLException{
        return estadoBD.getPoblacion(n);
    }
    
    @WebMethod
    @Override
    @WebResult (name="nombreEstado")
    public Estado[] getEstados()throws ClassNotFoundException, SQLException{
        return estadoBD.getEstados();
    }
}
