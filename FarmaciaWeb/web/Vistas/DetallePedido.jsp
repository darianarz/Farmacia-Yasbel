<%-- 
    Document   : MetodoPago
    Created on : 20/08/2024, 10:47:32 AM
    Author     : SENA
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <title>Seleccionar Método de Pago</title>
        <link href="/FarmaciaWeb/CSS/style.css" rel="stylesheet" type="text/css"/>
        <link href="/FarmaciaWeb/CSS/IndexAdmin.css" rel="stylesheet" type="text/css"/>
        <link href="/FarmaciaWeb/CSS/carritocliente.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light navbar-custom">
            <a class="navbar-brand" href="/FarmaciaWeb/CtrProductoLi?accion=home">
                <img src="/FarmaciaWeb/Imagenes/lo-removebg-preview.png" class="icon" width="60" height="60" alt="Farmacia Yasbel"/>
                Farmacia Yasbel
            </a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarNav">
                <form class="form-inline my-2 my-lg-0 mr-auto" action="/FarmaciaWeb/CtrProductoLi?accion=buscar" method="post">
                    <input class="form-control mr-sm-2" type="search" placeholder="Buscar productos..." aria-label="Search" name="busqueda">
                    <button class="btn-search my-2 my-sm-0" type="submit">
                        <div class="original">BUSCAR</div>
                    </button>
                </form>

                <ul class="navbar-nav">
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle nav-text-white" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <i class="bi bi-person"></i> Mi Cuenta
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item text-center" href="#"><i class="bi bi-person"></i></a>
                            <a class="dropdown-item " >${usuario.getUsunombre()}</a>
                            <a class="dropdown-item " >${usuario.getUsutipo()}</a>
                            <a class="dropdown-item" href="/FarmaciaWeb/CtrProductoLi?accion=historial">Historial Pedido</a>
                            <a class="dropdown-item"  data-bs-toggle="modal" data-bs-target="#exampleModal">PQR</a>
                            <a class="dropdown-item text-danger" href="/FarmaciaWeb/CtrProductoLi?accion=salir">Cerrar Sesion</a>

                        </div>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link nav-text-white" href="CtrProductoLi?accion=carro">
                            <i class="bi bi-cart-check-fill"></i> Carrito
                            (<label style="color: darkorange">${contador}</label>)
                        </a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle nav-text-white" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <i class="bi bi-bookmark"></i> Comprar por categorías
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <c:forEach var="c" items="${categorias}">
                                <a class="dropdown-item" href="/FarmaciaWeb/CtrProductoLi?accion=buscarcat&catid=${c.getCatCodigo()}">
                                    <i class="bi bi-bookmarks"></i> ${c.getCatNombre()}
                                </a>
                            </c:forEach>
                        </div>
                    </li>
                </ul>
            </div>
        </nav>
        <br>                
        <br>                
        <br>                
        <br>                
        <br>                
        <br>                
        <br>                         
        <br>                
        <br>                
        <br>                


 <br>                
        <br>                
        <br>                
      
        
           <div class="container">
        <div class="row">
            <div class="col-md-6">
                <div class="card">
                    <div class="row">
                        <!-- Asegúrate de que "detalle" esté definido y no sea null -->
                        <c:if test="${not empty detalle}">
                            <div class="col-6">
                                <label>Nombre del producto</label>
                                <input type="text" class="form-control" value="${detalle.dpdNombreProducto}" readonly>
                            </div>
                            <div class="col-6">
                                <label>Precio unitario</label>
                                <input type="number" class="form-control" value="${detalle.dpdPrecioUnitario}" readonly>
                            </div>
                            <div class="col-6">
                                <label>Cantidad</label>
                                <input type="text" class="form-control" value="${detalle.dpdCantidad}" readonly>
                            </div>
                            <div class="col-6">
                                <label>Fecha</label>
                                <input type="text" class="form-control" value="${detalle.dpdFecha}" readonly>
                            </div>
                            <div class="col-6">
                                <label>Precio total</label>
                                <input type="text" class="form-control" value="${detalle.dpdPrecioTotal}" readonly>
                            </div>
                        </c:if>
                        <c:if test="${empty detalle}">
                            <p>No se encontraron detalles para este pedido.</p>
                        </c:if>
                    </div>
                </div>
            </div>
        </div>
    </div>
s://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    </body>
</html>
