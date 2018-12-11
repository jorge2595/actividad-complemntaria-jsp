<jsp:include page='views/header.jsp'></jsp:include>
<%@ page import="inlcude.Rol" %>
<%@ page import="controller.controllerRol" %>
<%@ page import="java.util.ArrayList" %>

<div class="container">
    <div class="row">
        <div class="input-field col s12 center">
            <h3>Rols</h3>
        </div>
    </div>
    <div class="row">
        <div class="input-field col s12">
            <a class="btn" href="a_rol.jsp">Nuevo</a>
        </div>
    </div>
    <div class="row margin">
        <div class="col s12 center">
            <table class="striped">
                <thead>
                <tr>
                    <th>IDROL</th>
                    <th>NOMBRE_ROL</th>
                    <th>DESCEIPCION</th>
                    <th></th>
                </tr>
                </thead>
                <%
                    String htmlcode = "<tbody>";
                    controllerRol cc = new controllerRol();
                    int contador = 0;
                    ArrayList<Rol> rols = new ArrayList<Rol>();
                    rols = cc.obtenerRols();
                    if(rols.size() > 0){
                        for(int a=0; a<rols.size();a++){
                            htmlcode += "<tr><td>" + rols.get(a).getidrol()
                                    + "</td><td>" + rols.get(a).getnombre_rol()
                                    + "</td><td>" + rols.get(a).getdescripcion()
                                    + "<td><a class=\"btn\" href=\"#\"><i class=\"material-icons\">zoom_in</i></a>"
                                    + "<a class=\"btn blue\" href=\"m_rol.jsp?idrol="+rols.get(a).getidrol()+"\"><i class=\"material-icons\">create</i></a>"
                                    + "<a class=\"btn red\" onclick=\"deleterol("+rols.get(a).getidrol()+")\"><i class=\"material-icons\">delete</i></a>"
                                    + "</td></tr>";
                        }
                    } else{
                        htmlcode += "<tr><td colspan=\"10\">No existen rols</td></tr>";
                    }
                    htmlcode += "</tbody>";

                    out.print(htmlcode);
                %>
            </table>
        </div>
    </div>
</div>


<jsp:include page='views/footer.jsp'></jsp:include>