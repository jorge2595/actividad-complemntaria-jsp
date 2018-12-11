package controller;
import inlcude.Puesto;
import modelos.modeloPuesto;

import java.util.ArrayList;

public class controllerPuesto {

    public boolean agregarPuesto(Puesto puesto){
        modeloPuesto puesto1 = new modeloPuesto();
        return puesto1.crearPuesto(puesto);
    }

    public ArrayList<Puesto> obtenerPuesto(){
        modeloPuesto Puesto = new modeloPuesto();
        return Puesto.obtenerPuesto();
    }

    public static void main(String[] args){
        controllerPuesto cc = new controllerPuesto();
        //System.out.print(cc.agregarPuesto(new Puesto()));


        ArrayList<Puesto> Puesto = new ArrayList<>();
        Puesto = cc.obtenerPuesto();
        System.out.print(Puesto.get(0).getIdpuesto());
    }


}
