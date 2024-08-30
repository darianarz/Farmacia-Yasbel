<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Farma-online</title>

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <!-- Bootstrap Icons -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css">
    <!-- Custom CSS -->
    <link href="/FarmaciaWeb/CSS/PQR.css" rel="stylesheet" type="text/css"/>
    <link href="/FarmaciaWeb/CSS/style.css" rel="stylesheet" type="text/css"/>
</head>
<body>

    <%-- Session check --%>
    <%
        if (session.getAttribute("log") == null || session.getAttribute("log").equals('0')) {
            response.sendRedirect("../Vistas/LogginPage.jsp");
        }
    %>

    <!-- Navbar -->
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
                        <a class="dropdown-item">${usuario.getUsunombre()}</a>
                        <a class="dropdown-item">${usuario.getUsutipo()}</a>
                        <a class="dropdown-item" data-bs-toggle="modal" data-bs-target="#exampleModal">PQR</a>
                        <a class="dropdown-item text-danger" href="/FarmaciaWeb/CtrProductoLi?accion=salir">Cerrar Sesión</a>
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

    <!-- Offer Banner -->
 <div class="offer-banner">
    <p class="offer-text">Ofertas con el <span class="discount">30%</span> de descuento</p>
    <p class="offer-note">¡No te lo pierdas!</p>
    <div class="rotating-light"></div>
</div>



    <!-- Products Section -->
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

    <!-- Footer -->
    <footer class="py-5 bg-dark text-white" id="footer">
    <div class="container">
        <div class="row">
            <div class="col-md-4">
                <h5 class="footer-heading">Información</h5>
                <p class="footer-text">Dirección: Calle 51d#2g63</p>
                <p class="footer-text">Teléfono: 324 6794400</p>
            </div>
            <div class="col-md-4">
                <h5 class="footer-heading">Métodos de Pago</h5>
                <div class="payment-methods">
                    <a href="#"><img src="../img/mastercard.png" alt="MasterCard" class="payment-icon"></a>
                    <a href="#"><img src="../img/visa.png" alt="Visa" class="payment-icon"></a>
                    <a href="#"><img src="../img/nequi.png" alt="Nequi" class="payment-icon"></a>
                </div>
            </div>
            <div class="col-md-4">
                <h5 class="footer-heading">Redes Sociales</h5>
                <div class="social-links">
                    <a href="#" class="social-link"><i class="bi bi-facebook"></i> Facebook</a><br>
                    <a href="#" class="social-link"><i class="bi bi-instagram"></i> Instagram</a>
                </div>
            </div>
        </div>
        <div class="footer-bottom mt-4">
            <p class="footer-text">Tu salud, nuestra prioridad. Descubre la comodidad de cuidarte desde casa con nuestra droguería en línea. Expertos en bienestar a solo un clic.</p>
            <div class="footer-buttons">
                <a href="#" class="btn btn-light footer-btn">Términos de servicio</a>
                <a href="#" class="btn btn-light footer-btn">Política de privacidad</a>
            </div>
        </div>
    </div>
</footer>

    <!-- Modal -->
   <!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered">
        <div class="modal-content rounded-4 shadow-lg">
            <div class="modal-header border-0">
                <h1 class="modal-title fs-4" id="exampleModalLabel">Sistema de PQR</h1>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                <form action="/FarmaciaWeb/CtrPQR?accion=CrearPQR" method="post">
                    <div class="form-group mb-3">
                        <label for="name" class="form-label">Nombre</label>
                        <input id="name" name="nombre" type="text" class="form-control custom-input" placeholder="Ingrese su nombre" required>
                    </div>
                    <div class="form-group mb-3">
                        <label for="email" class="form-label">Correo electrónico</label>
                        <input id="email" name="correo" type="email" class="form-control custom-input" placeholder="Ingrese su correo" required>
                    </div>
                    <div class="form-group mb-3">
                        <label for="phone" class="form-label">Teléfono</label>
                        <input id="phone" name="telefono" type="text" class="form-control custom-input" placeholder="Ingrese su teléfono" required>
                    </div>
                    <div class="form-group mb-3">
                        <label for="type" class="form-label">Tipo de solicitud</label>
                        <select id="type" name="tipo" class="form-select custom-select" required>
                            <option value="" disabled selected>Seleccione una opción</option>
                            <option value="1">Queja</option>
                            <option value="2">Sugerencia</option>
                            <option value="3">Reclamo</option>
                        </select>
                    </div>
                    <div class="form-group mb-4">
                        <label for="description" class="form-label">Descripción</label>
                        <textarea id="description" name="descripcion" class="form-control custom-textarea" rows="4" placeholder="Ingrese su mensaje" required></textarea>
                    </div>
                    <button type="submit" class="btn btn-primary custom-btn">Enviar</button>
                </form>
            </div>
            <div class="modal-footer border-0">
                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cerrar</button>
            </div>
        </div>
    </div>
</div>

    <!-- Scripts -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
