/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import java.sql.SQLException;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import modelos.Corrida;

/**
 *
 * @author ac.barrios
 */
public interface ICorridasWS {

    @WebMethod
    public Boolean insertar(String origen, String destino,String fechaSalida, String horaSalida,
           String fechaLlegada, String horaLlegada, int escalas
            ) throws ClassNotFoundException, SQLException;
    @WebMethod
    public Boolean eliminar(int id) throws ClassNotFoundException, SQLException;
}
