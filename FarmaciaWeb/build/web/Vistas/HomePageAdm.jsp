<%-- 
    Document   : HomePageAdm
    Created on : 28/08/2024, 07:58:08 AM
    Author     : SENA
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Admin</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css">
        <link href="/FarmaciaWeb/CSS/PQR.css" rel="stylesheet" type="text/css"/>
        <link href="/FarmaciaWeb/CSS/style.css" rel="stylesheet" type="text/css"/>
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <script src="/FarmaciaWeb/JS/scripts.js" type="text/javascript"></script>
    </head>
     <%
        if (session.getAttribute("log") == null || session.getAttribute("log").equals('0')) {
            response.sendRedirect("../Vistas/LogginPage.jsp");
        }
    %>
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
                            <a class="dropdown-item text-warnig" href="/FarmaciaWeb/CtrProductoLi?accion=admi">Gestion Administrador</a>
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

        <div class="offer-banner">
            <p class="offer-text">Ofertas con el 30% de descuento</p>
        </div>

        <br>
        <section id="productos" class="product-container">
            <div class="container">
                <div class="row">
                    <c:forEach var="prod" items="${productos}">
                        <div class="col-md-4 col-sm-6 mb-4">
                            <div class="card h-100">
                                <img src="${prod.getProFoto()}" class="card-img-top" alt="${prod.getProNombre()}">
                                <div class="card-body d-flex flex-column">
                                    <h5 class="card-title">${prod.getProNombre()}</h5>
                                    <p class="card-text">${prod.getProDescripcion()}</p>
                                    
                                    <div class="mt-auto">
                                        <a href="/FarmaciaWeb/CtrProductoLi?accion=comprar&id=${prod.getProCodigo()}" class="btn btn-secondary ml-2">Carrito</a>
                                        <a href="/FarmaciaWeb/CtrProductoLi?accion=AgregarCarrito&id=${prod.getProCodigo()}" class="btn btn-primary">Agregar al carrito</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                </div>
            </div>



        </section>
    </main>
    <div class="row-expand-lg py-4" id="footer" >
        <div class="container" >
            <div class="row">
                <div class="col-md-4 text-black">
                    <h5>Información</h5>
                    <p>Dirección: calle 51d#2g63 </p>
                    <p>Teléfono: 324 6794400 </p>
                </div>
                <div class="col-md-4 text-black">
                    <h5>Métodos De Pago</h5>
                    <a href="#"><img src="../img/mastercard.png" alt="" height="40px" width="70px" ></i>
                        <a href="#"><img src="../img/visa.png" alt="" height="60px" width="50px"></a>
                        <a href="#"><img src="../img/nequi.png" alt="" height="20px" width="55px" > </a>
                </div>
                <div class="col-md-4 text-black">
                    <h5>Redes Sociales</h5>
                    <a href="#" class="text-black"> Facebook <i class="bi bi-facebook"></i></a><br>
                    <a href="#" class="text-black"> Instagram <i class="bi bi-instagram"></i></a>
                </div>
            </div>
            <div class="col-md-4 text-black">
                <p>Tu salud, nuestra prioridad.Descubre la comodidad de cuidarte desde casa con nuestra drogueria
                    en linea. Expertos en bienestar a solo un click.
                </p>
                <a href="#"><button type="button" class="btn btn-link">Terminos de servicio</button></a>
                <a href="#"><button type="button" class="btn btn-link">politica de privacidad</button></a>

            </div>

        </div>

    </div>

</div>

<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h1 class="modal-title fs-5" id="exampleModalLabel">Sistema de PQR</h1>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                <form action="/FarmaciaWeb/CtrPQR?accion=CrearPQR" method="post" >
                    <div class="form-group">
                        <label for="name"> Nombre</label>
                        <input id="name" name="nombre" type="text" placeholder="Ingrese su nombre">
                    </div>
                    <div class="form-group">
                        <label for="email"> Correo electrónico</label>
                        <input id="email" name="correo" type="email" placeholder="Ingrese su correo">
                    </div>
                    <div class="form-group">
                        <label for="phone"> Teléfono</label>
                        <input id="phone" name="telefono" type="text" placeholder="Ingrese su teléfono">
                    </div>
                    <div class="form-group">
                        <label for="type"> Tipo de solicitud</label>
                        <select id="type" name="tipo">
                            <option value="" disabled selected>Seleccione una opción</option>
                            <option value="petition">Petición</option>
                            <option value="complaint">Queja</option>
                            <option value="claim">Reclamo</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label for="description"> Descripción de la solicitud</label>
                        <textarea id="description" name="descripcion" placeholder="Ingrese los detalles de su solicitud"></textarea>
                    </div>
                    <button type="submit" name="accion" value="CrearPQR" class="button"> Enviar</button>
                </form>
            </div>
            <div class="modal-footer" id="modal">
                <p>Si el problema persiste, llame a la linea +123-456-789</p>
            </div>
        </div>
    </div>
</div>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
crossorigin="anonymous"></script>
    </body>
</html>
