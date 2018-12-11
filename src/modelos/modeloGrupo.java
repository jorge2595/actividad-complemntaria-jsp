package modelos;
import inlcude.Grupo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class modeloGrupo extends conexion{
    public boolean crearGrupo(Grupo grupo){
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String consulta= "INSERT INTO GRUPO(IDGRUPO,NOMBRE_GRUPO,CAPACIDAD,HORA_INICIAL,HORA_FINAL,INSTRUCTOR_IDINSTRUCUTOR,AREA_IDAREA,ACTIVIDAD_IDACTIVIDAD,PERIODO_IDPERIODO) VALUES (?,?,?,?,?,?,?,?,?)";

            pst = getConection().prepareStatement(consulta);
            pst.setInt(1,grupo.getIdgrupo());
            pst.setString(2,grupo.getNombre_grupo());
            pst.setInt(3,grupo.getCapacidad());
            pst.setInt(4,grupo.getHora_inicial());
            pst.setInt(5,grupo.getHora_final());
            pst.setInt(6,grupo.getInstructor_idinstructor());
            pst.setInt(7,grupo.getArea_idarea());
            pst.setInt(8,grupo.getActividad_idactividad());
            pst.setInt(9,grupo.getPeriodo_idperiodo());

            if (pst.executeUpdate() ==1){
                flag = true;
            }
        }catch (Exception ex){
            System.out.print(ex.getMessage());
        }finally {
            try {
                if (getConection()!= null) getConection().close();
                if (pst !=null) pst.close();
            }catch (Exception e){

            }
        }
        return flag;
    }


}
