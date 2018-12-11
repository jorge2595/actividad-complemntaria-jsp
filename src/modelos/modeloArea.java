package modelos;

import inlcude.Area;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class modeloArea extends  conexion {

    public boolean crearArea(Area area) {
        PreparedStatement pst = null;
        boolean flag = false;

        try {
            String consulta = "INSERT INTO AREA (IDAREA,NOMBRE_AREA) VALUES(?, ?)";

            pst = getConection().prepareStatement(consulta);
            pst.setInt(1, area.getId_area());
            pst.setString(2, area.getNombre_area());

            if (pst.executeUpdate() == 1) {
                flag = true;
            }
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        } finally {
            try {
                if (getConection() != null) getConection().close();
                if (pst != null) pst.close();
            } catch (Exception e) {
            }
        }
        return flag;
    }

    public ArrayList<Area> obtenerAreas() {
        ArrayList<Area> areas = new ArrayList<Area>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta = "SELECT IDAREA, NOMBRE_AREA FROM AREA";
            pst = getConection().prepareCall(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {
                areas.add(new Area(rs.getInt("IDAREA"),
                        rs.getString("NOMBRE_AREA")));
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
        return areas;
    }

    public ArrayList<Area> obtenerArea(int idarea) {
        ArrayList<Area> area = new ArrayList<>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta = "SELECT IDAREA, NOMBRE_AREA FROM AREA WHERE IDAREA =?";
            pst = getConection().prepareCall(consulta);
            pst.setInt(1, idarea);
            rs = pst.executeQuery();
            while (rs.next()) {
                area.add(new Area(rs.getInt("idarea"),
                        rs.getString("nombre_area")));
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
        return area;
    }

    public boolean actualizarArea(Area area) {
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String consulta = "UPDATE AREA SET IDAREA = ?, NOMBRE_AREA =? WHERE IDAREA =? ";
            pst = getConection().prepareStatement(consulta);
            pst.setInt(1, area.getId_area());
            pst.setString(2, area.getNombre_area());
            pst.setInt(3, area.getId_area());

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

    public boolean borrarArea(int idarea){
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String consulta  = "DELETE FROM AREA WHERE IDAREA = ?";
            pst = getConection().prepareStatement(consulta);
            pst.setInt(1,idarea);

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
