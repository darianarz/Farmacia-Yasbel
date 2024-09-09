<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <link href="FarmaciaWeb/CSS/style.css" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-icons/1.10.5/font/bootstrap-icons.min.css" integrity="sha512-ZnR2wlLbSbr8/c9AgLg3jQPAattCUImNsae6NHYnS9KrIwRdcY9DxFotXhNAKIKbAXlRnujIqUWoXXwqyFOeIQ==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="/FarmaciaWeb/CSS/LoginPage.css" rel="stylesheet" type="text/css"/>
</head>
<%
String Mensaje = "";
if (request.getParameter("fallo") != null) {
    int i = Integer.parseInt(request.getParameter("fallo"));
    if (i == 0) {
        Mensaje = "usuario y/o contraseña incorrecta";
    }
}
%>
<%
String Mensaje1 = "";
if (request.getParameter("mensaje") != null) {
    int i = Integer.parseInt(request.getParameter("mensaje"));
    if (i == 0) {
        Mensaje = "usuario creado , por favor inicie sesión";
    }
}
%>
<body>
    <div class="container">
        <div class="box">
            <div class="form sign_in">
                <img src="/FarmaciaWeb/Imagenes/lo-removebg-preview.png" alt="Logo" class="logo"/>
                <h3>Iniciar sesión</h3>
                <form action="/FarmaciaWeb/CtrValidarInfo" id="form_input" method="post">
                    <div class="type">
                        <input type="text" placeholder="Usuario" id="email" name="txtusu" required>
                    </div>
                    <div class="type">
                        <input type="password" placeholder="Contraseña" id="password" name="txtpass" required>
                    </div>
                    <div class="forgot">
                        <span>¿Olvidó su contraseña?</span>
                    </div>
                    <input type="submit" name="accion" value="Ingresar" class="btn bkg">
                    <p style="Color: green;"><%=Mensaje1%></p>
                </form>
            </div>

            <div class="form sign_up">
                <img src="/FarmaciaWeb/Imagenes/lo-removebg-preview.png" alt="Logo" class="logo"/>
                <h3>Regístrate</h3>
                <form action="/FarmaciaWeb/CtrUsuarioCre?accion=nuevo" id="form_input" class="form_input2" method="get">
                    <div class="grid-container">
                        <div class="type">
                            <input type="text" placeholder="Número de identificación" name="id" id="id" class="id" required pattern="\d+">
                        </div>
                        <div class="type">
                            <input type="text" placeholder="Nombre" id="nombre" class="nombre" name="nombre" required>
                        </div>
                        <div class="type">
                            <input type="text" placeholder="Apellido" name="apellido" id="apellido" class="apellido" required>
                        </div>
                        <div class="type">
                            <input type="text" placeholder="Dirección" id="direccion" class="direccion" name="direccion" required>
                        </div>
                        <div class="type">
                            <input type="tel" placeholder="Teléfono" id="telefono" class="telefono" name="telefono" required pattern="[0-9]{10}">
                        </div>
                        <div class="type">
                            <input type="email" placeholder="Correo" id="email" class="email" name="email" required>
                        </div>
                        <div class="type">
                            <input type="text" placeholder="Usuario" id="usuario" class="usuario" name="usuario" required>
                        </div>
                        <div class="type">
                            <input type="password" placeholder="Contraseña" id="contrasena" class="contrasena" name="contrasena" required>
                        </div>
                        <div class="col formulario_grupo" id="grupo_tipo">
                            <label for="tipo" class="formulario_label">Tipo</label>
                            <div class="formulario_grupo-input">
                                <select class="form-control formulario_input" name="tipo" id="tipo" required>
                                    <option value="Usuario">Cliente Nuevo</option>
                                </select>
                            </div>
                        </div>
                    </div>
                    <button type="submit" class="btn bkg" name="accion" value="nuevo">Guardar <i class="bi bi-floppy"></i></button>
                    <br><br>
                </form>
            </div>
        </div>

        <div class="overlay">
            <div class="page page_signIn">
                <img src="/FarmaciaWeb/Imagenes/lo-removebg-preview.png" alt="Logo" class="logo"/>
                <h3>¡Bienvenido!</h3>
                <p>Para continuar con nosotros, inicie sesión con sus datos personales.</p>
                <button class="btn btnSign-in">Regístrate <i class="bi bi-arrow-right"></i></button>
            </div>

            <div class="page page_signUp">
                <img src="/FarmaciaWeb/Imagenes/lo-removebg-preview.png" alt="Logo" class="logo"/>
                <h3>¡Bienvenido!</h3>
                <p>Ingresa tus datos personales</p>
                <button class="btn btnSign-up"><i class="bi bi-arrow-left"></i> Iniciar sesión</button>
            </div>
        </div>
    </div>
</body>
<script src="/FarmaciaWeb/JS/LoginPage.js" type="text/javascript"></script>

</html>
