<%@ page import="inlcude.Rol" %>
<%@page import="controller.controllerRol" %>
<%@ page import="java.util.ArrayList" %>
<jsp:include page='views/header.jsp'></jsp:include>

<%

    int idrol = 0;


    try {
        idrol = Integer.parseInt(request.getParameter("idrol"));

    }catch (NumberFormatException e){

    }

    controllerRol cc = new controllerRol();
    ArrayList<Rol> rols = new ArrayList<Rol>();
    rols = cc.obtenerRol(idrol);
%>

<div class="container">
    <form class="col s12" action="/modificarRol" method="post">
        <div class="row">
            <div class="input-field col s12 center">
                <p class="center login-form-text">Modificar rol</p>
            </div>
        </div>

        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8 center">
                <input id="rol" name="idrol" type="text" readonly="readonly" value="<% out.print(rols.get(0).getidrol());%>">
                <label for="rol" class="center-align">Rol</label>
            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input id="nombre_rol" name="nombre_rol" type="text"  value="<% out.print(rols.get(0).getnombre_rol()); %>">
                <label for="rol" class="center-align">Rol</label>
            </div>
            <div class="col s2">

            </div>
        </div>


        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input id="descripcion" name="descripcion" type="text" value="<% out.print(rols.get(0).getdescripcion()); %>">
                <label for="descripcion" class="center-align">Rol</label>
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
            <a class="btn col s6" href="rols.jsp">Regresar</a>
        </div>
        <div class="col s2">

        </div>

    </form>
</div>


<jsp:include page='views/footer.jsp'></jsp:include>