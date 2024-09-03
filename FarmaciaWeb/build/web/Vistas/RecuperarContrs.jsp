<%-- 
    Document   : RecuperarContrs
    Created on : 3/09/2024, 01:27:05 AM
    Author     : HOME
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Recuperar Contraseña</title>
        <link href="/FarmaciaWeb/CSS/RecuperarContrs.jsp.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="icon-container">
            <div class="icon-circle">
                <img src="/FarmaciaWeb/Imagenes/lo-removebg-preview.png" alt="Ícono" class="icon" />
            </div>
        </div>
        <div class="container">
            <h1>¿Olvidó su contraseña?</h1>
            <p>Por favor, escribe tu usuario</p>
            <input type="text" placeholder="Usuario" class="input-usuario" />
            <button type="submit">ENVIAR</button>
        </div>
        <button class="barra-button">
            <span class="barra-text">Volver al login</span>
            <span class="barra-icon">&#9664;</span>
        </button>
    </body>
</html>
