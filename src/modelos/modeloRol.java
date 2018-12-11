package modelos;

import inlcude.Rol;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class modeloRol extends conexion {
    public boolean crearRol(Rol rol){
        PreparedStatement pst = null;
        boolean flag = false;

        try{
            String consulta= "INSERT INTO ROL (IDROL,NOMBRE_ROL,DESCRIPCION) VALUES(?, ?, ?)";

            pst = getConection().prepareStatement(consulta);
            pst.setInt(1,rol.getidrol());
            pst.setString(2,rol.getnombre_rol());
            pst.setString(3,rol.getdescripcion());

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



    public ArrayList<Rol> obtenerRols() {
        ArrayList<Rol> rols = new ArrayList<Rol>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta = "SELECT IDROL, NOMBRE_ROL, DESCRIPCION FROM ROL";
            pst = getConection().prepareCall(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {
                rols.add(new Rol(rs.getInt("IDROL"),
                        rs.getString("NOMBRE_ROL"),
                        rs.getString("DESCRIPCION")));
            }
        } catch (Exception e) {
        } finally {
            try {
                if (getConection() != null) getConection().close();
                if (pst != null) pst.close();
                if (rs != null) rs.close();
            } catch (Exception e) {
            }

        }
        return rols;

    }

    //obtener un rol por id
    public ArrayList<Rol> obtenerRol(int idrol) {
        ArrayList<Rol> rol = new ArrayList<>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta = "SELECT IDROL, NOMBRE_ROL, DESCRIPCION FROM ROL WHERE IDROL =?";
            pst = getConection().prepareCall(consulta);
            pst.setInt(1, idrol);
            rs = pst.executeQuery();
            while (rs.next()) {
                rol.add(new Rol(rs.getInt("idrol"),
                        rs.getString("nombre_rol"),
                        rs.getString("descripcion")));

            }
        } catch (Exception e) {
            System.out.print(e.getMessage());
        } finally {
            try {
                if (getConection() != null) getConection().close();
                if (pst != null) pst.close();
                if (rs != null) rs.close();
            } catch (Exception e) {
                System.out.print(e.getMessage());
            }
        }
        return rol;
    }

    public boolean actualizarRol(Rol rol) {
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String consulta = "UPDATE ROL SET IDROL = ?, NOMBRE_ROL =?, DESCRIPCION =? WHERE IDROL =? ";
            pst = getConection().prepareStatement(consulta);
            pst.setInt(1, rol.getidrol());
            pst.setString(2, rol.getnombre_rol());
            pst.setString(3, rol.getdescripcion());
            pst.setInt(4, rol.getidrol());

            if (pst.executeUpdate() == 1) {
                flag = true;
            }
        } catch (Exception ex) {
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

    public boolean borrarRol(int idrol){
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String consulta  = "DELETE FROM ROL WHERE IDROL = ?";
            pst = getConection().prepareStatement(consulta);
            pst.setInt(1,idrol);

            if (pst.executeUpdate() == 1){
                flag = true;
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }finally {
            try {
                if (getConection() !=null) getConection().close();
                if (pst !=null) pst.close();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return flag;
    }


}
