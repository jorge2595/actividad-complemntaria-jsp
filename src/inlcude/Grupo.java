package inlcude;

public class Grupo {
    private int idgrupo;
    private String nombre_grupo;
    private int capacidad;
    private int hora_inicial;
    private int hora_final;
    private int instructor_idinstructor;
    private int area_idarea;
    private int actividad_idactividad;
    private int periodo_idperiodo;

    public Grupo(int idgrupo, String nombre_grupo, int capacidad, int hora_inicial, int hora_final, int instructor_idinstructor, int area_idarea, int actividad_idactividad, int periodo_idperiodo) {
        this.idgrupo = idgrupo;
        this.nombre_grupo = nombre_grupo;
        this.capacidad = capacidad;
        this.hora_inicial = hora_inicial;
        this.hora_final = hora_final;
        this.instructor_idinstructor = instructor_idinstructor;
        this.area_idarea = area_idarea;
        this.actividad_idactividad = actividad_idactividad;
        this.periodo_idperiodo = periodo_idperiodo;
    }

    public int getIdgrupo() {
        return idgrupo;
    }

    public void setIdgrupo(int idgrupo) {
        this.idgrupo = idgrupo;
    }

    public String getNombre_grupo() {
        return nombre_grupo;
    }

    public void setNombre_grupo(String nombre_grupo) {
        this.nombre_grupo = nombre_grupo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getHora_inicial() {
        return hora_inicial;
    }

    public void setHora_inicial(int hora_inicial) {
        this.hora_inicial = hora_inicial;
    }

    public int getHora_final() {
        return hora_final;
    }

    public void setHora_final(int hora_final) {
        this.hora_final = hora_final;
    }

    public int getInstructor_idinstructor() {
        return instructor_idinstructor;
    }

    public void setInstructor_idinstructor(int instructor_idinstructor) {
        this.instructor_idinstructor = instructor_idinstructor;
    }

    public int getArea_idarea() {
        return area_idarea;
    }

    public void setArea_idarea(int area_idarea) {
        this.area_idarea = area_idarea;
    }

    public int getActividad_idactividad() {
        return actividad_idactividad;
    }

    public void setActividad_idactividad(int actividad_idactividad) {
        this.actividad_idactividad = actividad_idactividad;
    }

    public int getPeriodo_idperiodo() {
        return periodo_idperiodo;
    }

    public void setPeriodo_idperiodo(int periodo_idperiodo) {
        this.periodo_idperiodo = periodo_idperiodo;
    }
}
