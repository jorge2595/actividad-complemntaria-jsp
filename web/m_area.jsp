<%@ page import="controller.controladorArea" %>
<%@ page import="inlcude.Area" %>
<%@ page import="java.util.ArrayList" %>
<jsp:include page='views/header.jsp'></jsp:include>
<%
    int id_area = 0;


    try {
        id_area = Integer.parseInt(request.getParameter("id_area"));

    }catch (NumberFormatException e){

    }

    controladorArea cc = new controladorArea();
    ArrayList<Area> areas = new ArrayList<Area>();
    areas = cc.obtenerArea(id_area);
%>

<div class="container">
    <form class="col s12" action="/modificarArea" method="post">
        <div class="row">
            <div class="input-field col s12 center">
                <p class="center login-form-text">Modificar area</p>
            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8 center">
                <input id="area" name="id_area" type="text" readonly="readonly" value="<% out.print(areas.get(0).getId_area()); %>">
                <label for="area" class="center-align">Area</label>
            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input id="nombre_area" name="nombre_area" type="text" value="<% out.print(areas.get(0).getNombre_area()); %>">
                <label for="area" class="center-align">Area</label>
            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>

        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">

            </div>
            <div class="col s2">

            </div>
        </div>


            </div>
            <div class="input-field col s8">
                <input type="submit" value="Actualizar" onclick='return(verif(this.form)); MM_validateForm()' class="btn col s6">
                <a class="btn col s6" href="areas.jsp">Regresar</a>
            </div>
            <div class="col s2">

            </div>

    </form>
</div>


<jsp:include page='views/footer.jsp'></jsp:include>