<jsp:include page='views/header.jsp'></jsp:include>
<%@ page import="inlcude.Area" %>
<%@ page import="controller.controladorArea" %>
<%@ page import="java.util.ArrayList" %>

<div class="container">
    <div class="row">
        <div class="input-field col s12 center">
            <h3>&Aacute;reas</h3>
        </div>
    </div>
    <div class="row">
        <div class="input-field col s12">
            <a class="btn" href="a_area.jsp">Nuevo</a>
        </div>
    </div>
    <div class="row margin">
        <div class="col s12 center">
            <table class="striped">
                <thead>
                <tr>
                    <th>ID_&Aacute;REA</th>
                    <th>NOMBRE_&Aacute;REA</th>
                    <th></th>
                </tr>
                </thead>
                <%
                    String htmlcode = "<tbody>";
                    controladorArea cc = new controladorArea();
                    int contador = 0;
                    ArrayList<Area> areas = new ArrayList<Area>();
                    areas = cc.obtenerAreas();
                    if(areas.size() > 0){
                        for(int a=0; a<areas.size();a++){
                            htmlcode += "<tr><td>" + areas.get(a).getId_area()
                                    + "</td><td>" + areas.get(a).getNombre_area()
                                    + "<td><a class=\"btn\" href=\"#\"><i class=\"material-icons\">zoom_in</i></a>"
                                    + "<a class=\"btn blue\" href=\"m_area.jsp?id_area="+areas.get(a).getId_area()+"\"><i class=\"material-icons\">create</i></a>"
                                    + "<a class=\"btn red\" onclick=\"delete_area('"+ areas.get(a).getId_area()+"')\"><i class=\"material-icons\">delete</i></a>"
                                    + "</td></tr>";
                        }
                    } else{
                        htmlcode += "<tr><td colspan=\"10\">No existen áreas</td></tr>";
                    }
                    htmlcode += "</tbody>";

                    out.print(htmlcode);
                %>
            </table>
        </div>
    </div>
</div>


<jsp:include page='views/footer.jsp'></jsp:include>