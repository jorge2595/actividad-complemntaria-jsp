package inlcude;


public class Puesto {
    private int idpuesto;
    private String descripcion;
    private int nivel;
    private String tipo;
    private String funciones;

    public Puesto(int idpuesto, String descripcion, int nivel, String tipo, String funciones) {
        this.idpuesto = idpuesto;
        this.descripcion = descripcion;
        this.nivel = nivel;
        this.tipo = tipo;
        this.funciones = funciones;
    }

    public int getIdpuesto() {
        return idpuesto;
    }

    public void setIdpuesto(int idpuesto) {
        this.idpuesto = idpuesto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFunciones() {
        return funciones;
    }

    public void setFunciones(String funciones) {
        this.funciones = funciones;
    }
}
