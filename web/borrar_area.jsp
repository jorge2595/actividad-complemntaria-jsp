
<%@ page import=" controller.controladorArea" %>

<%
int id_area = 0 ;

try {
    id_area = Integer.parseInt(request.getParameter("id_area"));

}catch (NumberFormatException e){

}

controladorArea cc = new controladorArea();
if (cc.eliminarArea(id_area)){
    response.sendRedirect("areas.jsp");
}else {
    response.sendRedirect("index.jsp");
}
%>