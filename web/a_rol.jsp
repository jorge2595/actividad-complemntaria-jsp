
<jsp:include page='views/header.jsp'></jsp:include>

<div class="container">
    <form class="col s12" action="/crearRol" method="post">
        <div class="row">
            <div class="input-field col s12 center">
                <p class="center login-form-text">Insertar una nuevo rol</p>
            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8 center">
                <input id="idrol" name = "idrol" type="text" value="">
                <label for="idrol" class="center-align">Rol</label>
            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input id="nombre_rol" name="nombre_rol" type="text" value="">
                <label for="nombre_rol" class="center-align">Nombre rol</label>
            </div>
            <div class="col s2">

            </div>

            <div class="row margin">
                <div class="col s2">

                </div>
                <div class="input-field col s8">
                    <input id="descripcion" name="descripcion" type="text" value="">
                    <label for="descripcion" class="center-align">Descripcion</label>
                </div>
                <div class="col s2">

                </div>

        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">

            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input type="submit" value="Insertar" onclick='return(verif(this.form)); MM_validateForm()' class="btn col s6">
                <a class="btn col s6" href="rols.jsp">Regresar</a>
            </div>
            <div class="col s2">

            </div>
        </div>
    </form>

</div>


<jsp:include page='views/footer.jsp'></jsp:include>