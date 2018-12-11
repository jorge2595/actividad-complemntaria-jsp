package controller;

import inlcude.Area;
import modelos.modeloArea;
import java.util.ArrayList;

public class controladorArea {

    public boolean agregarArea(Area area){
        modeloArea area1 = new modeloArea();
        return area1.crearArea(area);
    }

    public ArrayList<Area> obtenerAreas(){
        modeloArea area = new modeloArea();
        return area.obtenerAreas();
    }

    public ArrayList<Area> obtenerArea(int idarea){
        modeloArea area = new modeloArea();
        return area.obtenerArea(idarea);
    }
    public boolean actualizarArea(Area area){
        modeloArea area1= new modeloArea();
        return area1.actualizarArea(area);
    }

    public boolean eliminarArea(int idarea){
        modeloArea area1 = new modeloArea();
        return area1.borrarArea(idarea);
    }


    public static void  main(String[] args) {
        controladorArea cc = new controladorArea();
        //agregar una nueva area
        System.out.print(cc.agregarArea(new Area(4, "alan")));

        //YA JALA
        //listar todos los elementos de la tabla
        /*ArrayList<Area> areas = new ArrayList<>();
        areas = cc.obtenerAreas();
        for (int a=0;a<areas.size();a++) {
            System.out.print("idarea : "+ areas.get(a).getId_area());
          System.out.print("nombre_area : "+ areas.get(a).getNombre_area());
          System.out.println();
        }


        //YA JALA
        //listar un elemento por su llave primaria

        /*ArrayList<Area> area =  new ArrayList<>();
        area = cc.obtenerArea(3);

        for (int b=0;b<area.size();b++){
           System.out.print("idarea: "+ area.get(b).getId_area());
           System.out.print("nombre_area: "+area.get(b).getNombre_area());
           System.out.println();
        }*/

        //modificar un elemento
      System.out.print(cc.actualizarArea(new Area(2,"lucas")));


        //YA JALA
        //eliminar un elemento
        //System.out.print(cc.eliminarArea(1));
        }

    }







