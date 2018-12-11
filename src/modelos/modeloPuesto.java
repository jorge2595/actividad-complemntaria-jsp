package modelos;
import inlcude.Puesto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class modeloPuesto extends conexion{

    public boolean crearPuesto(Puesto puesto){
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String consulta= "INSERT INTO PUESTO(IDPUESTO,DESCRIPCION,NIVEL,TIPO,FUNCIONES) VALUES(?,?,?,?,?)";

            pst = getConection().prepareStatement(consulta);
            pst.setInt(1,puesto.getIdpuesto());
            pst.setString(2,puesto.getDescripcion());
            pst.setInt(3,puesto.getNivel());
            pst.setString(4,puesto.getTipo());
            pst.setString(5,puesto.getFunciones());

            if (pst.executeUpdate() ==1){
                flag = true;
            }
        }catch (Exception ex){
            System.out.print(ex.getMessage());
        }finally {
            try {
                if (getConection() != null) getConection().close();
                if (pst !=null) pst.close();
            }catch (Exception e){

            }
        }
        return flag;
    }

    public ArrayList<Puesto> obtenerPuesto(){
        ArrayList<Puesto> Puesto = new ArrayList<>();
        PreparedStatement pst =null;
        ResultSet rs = null;

        try {
            String consulta = "SELECT idpuesto, descripcion, nivel, tipo,funciones";
            pst = getConection().prepareCall(consulta);
            rs = pst.executeQuery();
            while (rs.next()){
                Puesto.add(new Puesto(rs.getInt("idpuesto"),
                        rs.getString("descripcion"),
                        rs.getInt("nivel"),
                        rs.getString("tipo"),
                        rs.getString("funciones")));
            }
        }catch (Exception e){

        }finally {
            try {
                if (getConection() !=null) getConection().close();
                if (pst !=null) pst.close();
                if (rs !=null) rs.close();
            }catch (Exception e){
        }
    }
return Puesto;

}

public ArrayList<Puesto> obtenerPuesto(int idpuesto){
        ArrayList<Puesto> puesto = new ArrayList<>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try{
            String consulta = "SELECT IDPUESTO, DESCRIPCION, NIVEL, TIPO, FUNCIONES  FROM PUESTO WHERE IDPUESTO=?";
            pst = getConection().prepareCall(consulta);
            pst.setInt(1, idpuesto);
            rs = pst.executeQuery();
            while (rs.next()){
                puesto.add(new Puesto(rs.getInt("IDPUESTO"),
                        rs.getString("DESCRIPCION"),
                        rs.getInt("NIVEL"),
                        rs.getString("TIPO"),
                        rs.getString("FUNCIONES")));
            }
        }catch (Exception e){
            System.out.print(e.getMessage());
        }finally {
            try {
                if(getConection() != null)getConection().close();
                if(pst != null)pst.close();
                if(rs !=null)rs.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    return puesto;
        }

    public boolean actualizarPuesto(Puesto puesto){
        PreparedStatement pst = null;
        boolean flag = false;
        try{
            String consulta = "UPDATE PUESTO SET IDPUESTO =?, DESCRIPCION =?, NIVEL =?, TIPO =?, FUNCIONES =? WHERE IDPUESTO =?";
            pst = getConection().prepareStatement(consulta);




            if(pst.executeUpdate() == 1){
                flag = true;
            }

        } catch (Exception ex){
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (getConection() != null) getConection().close();
                if (pst != null) pst.close();
            } catch (Exception a) {
                System.out.println(a.getMessage());
            }
        }
        return flag;


}
}





