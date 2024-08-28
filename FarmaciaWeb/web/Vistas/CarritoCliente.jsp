<%-- 
    Document   : CarritoClienrte
    Created on : 14/08/2024, 08:01:33 AM
    Author     : SENA
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <title>Carrito de Compras</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css">
         <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css">
        <link href="/FarmaciaWeb/CSS/style.css" rel="stylesheet" type="text/css"/>
        <link href="/FarmaciaWeb/CSS/carritocliente.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
         <nav class="navbar navbar-expand-lg navbar-light navbar-custom">
            <a class="navbar-brand" href="/FarmaciaWeb/CtrProductoLi?accion=home">
                <img src="/FarmaciaWeb/Imagenes/lo-removebg-preview.png" class="icon" width="60px" height="60px"/>
                Farmacia yasbel
            </a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarNav">
                <form class="form-inline my-2 my-lg-0 mr-auto" action="/FarmaciaWeb/CtrProductoLi?accion=buscar" method="post">
                    <input class="form-control mr-sm-2" type="search" placeholder="Buscar productos..." aria-label="Search" name="busqueda">
                    <button class="btn-search my-2 my-sm-0" type="submit">
                        <div class="original">BUSCAR</div>
                        <div class="letters">
                            <span>B</span>
                            <span>U</span>
                            <span>S</span>
                            <span>C</span>
                            <span>A</span>
                            <span>R</span>
                        </div>
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
                            <a class="dropdown-item"  data-bs-toggle="modal" data-bs-target="#exampleModal">PQR</a>
                            <a class="dropdown-item text-danger" href="/FarmaciaWeb/CtrProductoLi?accion=salir">Cerrar Sesion</a>

                        </div>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link nav-text-white" href="CtrProductoLi?accion=Carrito">
                            <i class="bi bi-cart-check-fill"></i> Carrito
                            (<label style="color: darkorange">${contador}</label>)
                            
                        </a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle nav-text-white" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <i class="bi bi-bookmark"></i> Comprar por categorías
                        </a>

                        <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <c:forEach var="c" items="${categorias}">
                                <input type="hidden" value="${c.getCatCodigo()}" name="catid" id="catid">
                                <li><a class="dropdown-item" href="/FarmaciaWeb/CtrProductoLi?accion=buscarcat&catid=${c.getCatCodigo()}" ><i class="bi bi-bookmarks"></i> ${c.getCatNombre()}</a></li>

                            </c:forEach>
                        </ul>

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
        
        <div class="container">
           <div class="main-content">
                <h1 class="main-title">Tu Carrito</h1>
                
                <c:forEach var="car" items="${carrito}">
                <div class="product-grid">
                    <div class="product-card">
                        <div class="product-info">
                            <img src="${car.getFoto()}" alt="Producto 1" class="product-img" style="height: 200px ; width: 200px;">
                            <div class="product-details">
                                <h3 class="product-name">${car.getNombre()}</h3>
                                <p class="product-price">${car.getPreciocompra()}</p>
                                <p class="product-name">${car.getDescripcion()}</p>
                                <p class="product-name">${car.getCantidad()}</p>
                                <input type="hidden" id="idp" value="${car.getIdproducto()}">
                            </div>
                        </div>
                        <div class="product-actions">
                            <div class="quantity-controls">
                                <button class="quantity-btn">-</button>
                                <span></span>
                                <button class="quantity-btn">+</button>
                            </div>
                            <button class="remove-btn">Eliminar</button>
                        </div>
                    </div>
                </div>
                </c:forEach>
                
                
                <div class="summary-card">
                    <div class="summary-header">
                        <h2 class="summary-title">Resumen del Pedido</h2>
                        <button class="empty-cart-btn">Vaciar Carrito</button>
                    </div>
                    <div class="summary-details">
                        <div class="summary-item">
                            <p>Subtotal:</p>
                            <p></p>
                        </div>
                        <div class="summary-item">
                            <p>Envío:</p>
                            <p>$2.99</p>
                        </div>
                        <div class="summary-item summary-total">
                            <p>Total:</p>
                            <p></p>
                        </div>
                    </div>
                    <div class="summary-actions">
                        <button class="continue-shopping-btn">Seguir Comprando</button>
                        <button class="checkout-btn">Proceder al Pago</button>
                    </div>
                </div>
            </div>
        </main>
    </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
        <script src="/FarmaciaWeb/JS/scripts.js" type="text/javascript"></script>
    </body>
</html>
