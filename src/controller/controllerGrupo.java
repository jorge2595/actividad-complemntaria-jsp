package controller;
import inlcude.Grupo;
import modelos.modeloGrupo;

public class controllerGrupo {
    public boolean agregarGrupo(Grupo grupo){
        modeloGrupo grupo1 = new modeloGrupo();
        return grupo1.crearGrupo(grupo);
    }

    public static void main(String[] args){
        controllerGrupo cc = new controllerGrupo();
        System.out.print(cc.agregarGrupo(new Grupo(1,"informatica",12,12,1,2,1,1,1)));
    }
}
