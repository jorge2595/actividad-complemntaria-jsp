package servlet;

import controller.controllerRol;
import inlcude.Rol;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletCrearRol", urlPatterns = {"/crearRol"})
public class ServletCrearRol extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nombre_rol = request.getParameter("nombre_rol");;
        String descripcion = request.getParameter("descripcion");

        int idrol = 0;

        try {
            idrol = Integer.parseInt(request.getParameter("idrol"));
        } catch (NumberFormatException e){

        }
        Rol nuevoRol = new Rol(idrol, nombre_rol, descripcion);

        controllerRol cc = new controllerRol();
        if(cc.agregarRol(nuevoRol)) {
            response.sendRedirect("rols.jsp");
        } else {
            response.sendRedirect("a_rol.jsp");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
