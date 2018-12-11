package modelos;
import inlcude.Periodo;
import java.sql.PreparedStatement;

public class modeloPeriodo extends conexion {
    public boolean crearPeriodo(Periodo periodo){
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String consulta= "INSERT INTO PERIODO"+"IDPERIDO,NOMBRE_CORTO,NOMBRE_LARGO,FECHA:INICIO,FECHA_FIN,ESTATUS"+"VALUES(?,?,?,?,?,?)";
            pst = getConection().prepareStatement(consulta);
            pst.setInt(1,periodo.getIdperido());
            pst.setString(2,periodo.getNombre_corto());
            pst.setString(3,periodo.getNombre_largo());
            pst.setString(4,periodo.getFecha_inicio());
            pst.setString(5,periodo.getFecha_fin());
            pst.setString(6,periodo.getEstatus());
            if (pst.executeUpdate() ==1){
                flag = true;
            }
        }catch (Exception ex){
            System.out.print(ex.getMessage());
        }finally {
            try {
                if (getConection() !=null) getConection().close();
                if (pst !=null) pst.close();
            }catch (Exception e){

            }
        }
        return flag;
    }
}
