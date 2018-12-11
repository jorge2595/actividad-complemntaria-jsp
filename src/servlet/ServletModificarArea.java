package servlet;

import controller.controladorArea;
import inlcude.Area;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletModificarArea", urlPatterns = {"/modificarArea"})
public class ServletModificarArea extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre_area = request.getParameter("nombre_area");;
        int id_area = 0;


        try {
            id_area = Integer.parseInt(request.getParameter("id_area"));
        } catch (NumberFormatException e){

        }


        Area nuevaArea = new Area(id_area, nombre_area);

        controladorArea cc = new controladorArea();
        if(cc.actualizarArea(nuevaArea)) {
            response.sendRedirect("areas.jsp");
        } else {
            response.sendRedirect("m_area.jsp?id_area=" + id_area);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
