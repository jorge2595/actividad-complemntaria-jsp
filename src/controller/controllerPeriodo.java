package controller;
import inlcude.Periodo;
import modelos.modeloPeriodo;

public class controllerPeriodo {
    public boolean agregarPeriodo(Periodo periodo){
        modeloPeriodo periodo1 = new modeloPeriodo();
        return periodo1.crearPeriodo(periodo);
    }

    public static void main(String[] args){
        controllerPeriodo cc = new controllerPeriodo();
        System.out.print(cc.agregarPeriodo(new Periodo(1,"ing","cursos","2018-07-12","2018-08-15","estrada")));
    }
}
