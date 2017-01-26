
package modelos;

public class Estado {
    private int idEstado;
    private String nombre;
    private int municipios;
    private String capital;
    private String comidaTipica;
    private int poblacion;

    public int getIdEstado() {
        return idEstado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getMunicipios() {
        return municipios;
    }

    public String getCapital() {
        return capital;
    }

    public String getComidaTipica() {
        return comidaTipica;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMunicipios(int municipios) {
        this.municipios = municipios;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setComidaTipica(String comidaTipica) {
        this.comidaTipica = comidaTipica;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public Estado(int idEstado, String nombre, int municipios, String capital, String comidaTipica, int poblacion) {
        this.idEstado = idEstado;
        this.nombre = nombre;
        this.municipios = municipios;
        this.capital = capital;
        this.comidaTipica = comidaTipica;
        this.poblacion = poblacion;
    }

    public Estado() {
    }
    
}
