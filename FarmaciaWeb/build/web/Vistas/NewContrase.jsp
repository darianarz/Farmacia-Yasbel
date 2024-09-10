<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Recuperar Contraseña</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="/FarmaciaWeb/CSS/NewContrase.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="icon-container">
            <div class="icon-circle">
                <img src="/FarmaciaWeb/Imagenes/lo-removebg-preview.png" alt="Ícono" class="icon" /> 
            </div>
        </div>
        <div class="container">
            <h1>Cambie su Contraseña</h1>
            <p>Digite su nueva Contraseña</p>
            <input type="password" placeholder="Contraseña" class="password" />
            <button type="submit">Cambiar</button>
        </div>
        <button class="barra-button">
            <span class="barra-text">Volver al login</span>
            <span class="barra-icon">&#9664;</span>
        </button>
    </body>
</html>