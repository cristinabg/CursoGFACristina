/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

/**
 * /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
import coleccion.ListadoCorridas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.Corrida;

/**
 *
 * @author ac.barrios
 */
public class BDCorrida extends BDConexion {

    private static final String dbUrl = "jdbc:mysql://localhost:3306/corridas?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static BDCorrida instancia;
    
    private BDCorrida(){}
    
    public static BDCorrida getInstance(){
        if(instancia == null){
            instancia = new BDCorrida();
        }
        return instancia;
    }
    
    public ListadoCorridas obtenerCorridas()throws ClassNotFoundException, SQLException {
        abrirConexion(dbUrl);
        String consulta = String.format("select * from corrida");
        ResultSet rs = getStatement().executeQuery(consulta);
        ArrayList<Corrida> lista = new ArrayList<Corrida>();

        while(rs.next()) {
            Corrida corrida = new Corrida();
            corrida.setOrigen(rs.getString("origen"));
            corrida.setDestino(rs.getString("destino"));
            corrida.setFechaSalida(rs.getString("fechaSalida"));
            corrida.setFechaLlegada(rs.getString("fechaLlegada"));
            corrida.setHoraSalida(rs.getString("horaSalida"));
            corrida.setHoraLlegada(rs.getString("horaLlegada"));
            corrida.setEscalas(rs.getInt("escalas"));
            lista.add(corrida);
        }
        ListadoCorridas listadoCorridas = new ListadoCorridas();
        listadoCorridas.setLista(lista);
        listadoCorridas.setNombre("Todas las corridas");
        
        rs.close();
        getStatement().close();
        cerrarConexion();
        
        return listadoCorridas;
    }
    
    public Corrida BuscarCorrida(int id) throws ClassNotFoundException, SQLException {
        abrirConexion(dbUrl);
        String consulta = String.format("select * from corrida where idCorrida = %d", id);
        ResultSet rs = getStatement().executeQuery(consulta);
        Corrida corrida = new Corrida();

        if (rs.next()) {
            corrida.setOrigen(rs.getString("origen"));
            corrida.setDestino(rs.getString("destino"));
            corrida.setFechaSalida(rs.getString("fechaSalida"));
            corrida.setFechaLlegada(rs.getString("fechaLlegada"));
            corrida.setHoraSalida(rs.getString("horaSalida"));
            corrida.setHoraLlegada(rs.getString("horaLlegada"));
            corrida.setEscalas(rs.getInt("escalas"));
        }

        rs.close();
        getStatement().close();
        cerrarConexion();
        return corrida;
    }

    public Corrida[] getCorridas() throws ClassNotFoundException, SQLException {
        abrirConexion(dbUrl);
        ResultSet resultado = getStatement().executeQuery("SELECT * FROM corrida");
        ArrayList<Corrida> lista = new ArrayList<Corrida>();

        while (resultado.next()) {
            lista.add(new Corrida(
                    resultado.getString("origen"),
                    resultado.getString("destino"),
                    resultado.getString("fechaSalida"),
                    resultado.getString("fechaLlegada"),
                    resultado.getString("horaSalida"),
                    resultado.getString("horaLlegada"),
                    resultado.getInt("escalas")
            ));
        }
        resultado.close();
        getStatement().close();
        cerrarConexion();
        Corrida[] es = new Corrida[lista.size()];

        return lista.toArray(es);
    }
}
