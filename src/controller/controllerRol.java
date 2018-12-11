package controller;

import java.util.ArrayList;
import inlcude.Rol;
import modelos.modeloRol;

public class controllerRol {

    public boolean agregarRol(Rol rol){
        modeloRol rol1 = new modeloRol();
        return  rol1.crearRol(rol);
    }

   public ArrayList<Rol> obtenerRols(){
        modeloRol rol = new modeloRol();
        return rol.obtenerRols();
    }

    public ArrayList<Rol> obtenerRol(int idrol){
        modeloRol rol = new modeloRol();
        return rol.obtenerRol(idrol);
    }

    public boolean actualizarRol(Rol rol){
        modeloRol rol1= new modeloRol();
        return rol1.actualizarRol(rol);
    }

    public boolean eliminarRol(int idrol){
        modeloRol rol1 = new modeloRol();
        return rol1.borrarRol(idrol);
    }

    public static void main(String[] args){

        //AGREGAR NUEVO ROL
        controllerRol cc = new controllerRol();
        System.out.print(cc.agregarRol(new Rol(5,"jug","dos ")));

        //YA JALA
        //listar todos los elementos de la tabla
        ArrayList<Rol> rols = new ArrayList<>();
        rols = cc.obtenerRols();
        for (int a=0;a<rols.size();a++) {
            //System.out.println("idrol: "+ rols.get(a).getidrol());
            //System.out.println("nombre_rol: "+ rols.get(a).getnombre_rol());
            //System.out.println("descripcion: "+ rols.get(a).getdescripcion());
            //System.out.println();
        }


        //YA JALA
        //listar un elemento por su llave primaria
        ArrayList<Rol> rol =  new ArrayList<>();
        rol = cc.obtenerRol(2);

        for (int b=0;b<rol.size();b++){
            //System.out.println("idrol: "+ rol.get(b).getidrol());
            //System.out.println("nombre_rol: "+ rol.get(b).getnombre_rol());
            //System.out.println("descripcion: "+ rol.get(b).getdescripcion());
            //System.out.println();
        }

        //modificar un elemento
        //System.out.print(cc.actualizarRol(new Rol(2,"futb","jugando")));


        //YA JALA
        //eliminar un elemento
        //System.out.print(cc.eliminarRol(1));



    }
}
