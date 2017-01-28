/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import bd.CorridaBD;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import modelos.Corrida;

/**
 *
 * @author ac.barrios
 */
@WebService
public class CorridasWS implements ICorridasWS {

    @WebMethod
    @Override
    public Boolean insertar(
            @WebParam(name = "origen") String origen,
            @WebParam(name = "destino") String destino,
            @WebParam(name = "fechaSalida") String fechaSalida,
            @WebParam(name = "horaSalida") String horaSalida,
            @WebParam(name = "fechaLlegada") String fechaLlegada,
            @WebParam(name = "horaLlegada") String horaLlegada,
            @WebParam(name = "escalas") int escalas) throws ClassNotFoundException, SQLException {
         Corrida corrida = new Corrida(origen, destino, fechaSalida, horaSalida, 
              fechaLlegada, horaLlegada, escalas);
        return CorridaBD.insertar(corrida);
    }

    @Override
    public Boolean eliminar(@WebParam(name = "idCorrida") int id) throws ClassNotFoundException, SQLException {
       return CorridaBD.eliminar(id);
    }
}
