package inlcude;

public class Periodo {
    private int idperido;
    private String nombre_corto;
    private String nombre_largo;
    private String fecha_inicio;
    private String fecha_fin;
    private String estatus;

    public Periodo(int idperido, String nombre_corto, String nombre_largo, String fecha_inicio, String fecha_fin, String estatus) {
        this.idperido = idperido;
        this.nombre_corto = nombre_corto;
        this.nombre_largo = nombre_largo;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.estatus = estatus;
    }

    public int getIdperido() {
        return idperido;
    }

    public void setIdperido(int idperido) {
        this.idperido = idperido;
    }

    public String getNombre_corto() {
        return nombre_corto;
    }

    public void setNombre_corto(String nombre_corto) {
        this.nombre_corto = nombre_corto;
    }

    public String getNombre_largo() {
        return nombre_largo;
    }

    public void setNombre_largo(String nombre_largo) {
        this.nombre_largo = nombre_largo;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
}
