package inlcude;

public class Rol {
    private int idrol;
    private String nombre_rol;
    private String descripcion;

    public Rol(int id_rol, String nombre_rol, String descripcion) {
        this.idrol = id_rol;
        this.nombre_rol = nombre_rol;
        this.descripcion = descripcion;
    }

    public int getidrol() {
        return idrol;
    }

    public void setidrol(int idrol) {
        this.idrol = idrol;
    }

    public String getnombre_rol() {
        return nombre_rol;
    }

    public void setnombre_rol(String nombre_rol) {
        this.nombre_rol = nombre_rol;
    }

    public String getdescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
