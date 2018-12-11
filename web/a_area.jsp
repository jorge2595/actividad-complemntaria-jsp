<jsp:include page='views/header.jsp'></jsp:include>

<div class="container">
    <form class="col s12" action="/crearArea" method="post">
        <div class="row">
            <div class="input-field col s12 center">
                <p class="center login-form-text">Insertar una nueva &aacute;rea</p>
            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8 center">
                <input id="id_area" name = "id_area" type="text" value="">
                <label for="id_area" class="center-align">&aacute;rea</label>
            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input id="nombre_area" name="nombre_area" type="text" value="">
                <label for="nombre_area" class="center-align">Nombre &aacute;rea</label>
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
                <a class="btn col s6" href="areas.jsp">Regresar</a>
            </div>
            <div class="col s2">

            </div>
        </div>
    </form>
</div>


<jsp:include page='views/footer.jsp'></jsp:include>