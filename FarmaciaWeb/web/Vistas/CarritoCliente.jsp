<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Carrito</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css">
    <link rel="stylesheet" href="/FarmaciaWeb/CSS/style.css">
    <link rel="stylesheet" href="/FarmaciaWeb/CSS/carritocliente.css">
    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script src="/FarmaciaWeb/JS/scripts.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.css">
    <script src="https://cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
    <script src="/FarmaciaWeb/JS/EliminarCarrito.js"></script>
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
                    <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <c:forEach var="c" items="${categorias}">
                            <input type="hidden" value="${c.getCatCodigo()}" name="catid" id="catid">
                            <li><a class="dropdown-item" href="/FarmaciaWeb/CtrProductoLi?accion=buscarcat&catid=${c.getCatCodigo()}"><i class="bi bi-bookmarks"></i> ${c.getCatNombre()}</a></li>
                        </c:forEach>
                    </ul>
                </li>
            </ul>
        </div>
    </nav>
                    <br>
                    <br>
                    <br>
    <div class="container mt-5">
        <h1 class="main-title text-center">Tu Carrito</h1>
        <div class="product-container d-flex flex-wrap justify-content-start">
            <table class="table table-hover">
                <tbody>
                    <c:forEach var="car" items="${carrito}">
                        <tr>
                            <td>${car.getItem()}</td>
                            <td>${car.getNombre()}<img src="${car.getFoto()}" width="100" height="100" alt="${car.getNombre()}"></td>
                            <td>${car.getDescripcion()}</td>
                            <td>${car.getPreciocompra()}</td>
                            <td>
                                <input type="hidden" id="idpro" value="${car.getIdproducto()}">
                                <input type="number" id="cantidad" value="${car.getCantidad()}" class="form-control text-center" min="1">
                            </td>
                            <td>${car.getSubtotal()}</td>
                            <td>
                                <input type="hidden" id="idpro" value="${car.getIdproducto()}">
                                <a class="btn btn-outline-danger" href="#" id="btndeletecar"><i class="bi bi-trash"></i></a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table> 
        </div>
        <form action="/FarmaciaWeb/CtrProductoLi?accion=pedido" method="post">
            <input type="hidden" name="idusu" value="${usuario.getUsuid()}">
            <input type="hidden" name="totalp" value="${totalpagar}">
            <div class="card-body">
                <label>Subtotal:</label>
                <input type="text" value="${totalpagar}" readonly class="form-control">
                <label>Descuento:</label>
                <input type="text" value="$0.00" readonly class="form-control">
                <label>Total:</label>
                <input type="text" value="${totalpagar}" readonly class="form-control">
            </div>
            <div class="formulario_grupo-input">
                <select class="form-control formulario_input" name="tipos" id="tipos">
                    <option value="Efectivo">Efectivo</option>
                    <option value="Tranferencia">Transferencia</option>
                </select>
            </div>
            <div class="card-footer">
                <button type="submit" class="btn btn-danger btn-block" onclick="ejecutarTarea()">Generar Pedido</button>
            </div>
        </form>
    </div>

    <!-- Modal -->
    <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h1 class="modal-title fs-5" id="exampleModalLabel">Sistema de PQR</h1>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"><i class="bi bi-x-lg"></i></button>
                </div>
                <div class="modal-body">
                    <form action="/FarmaciaWeb/CtrPQR?accion=CrearPQR" method="POST">
                        <div class="form-group">
                            <label for="name">Nombre</label>
                            <input id="name" name="nombre" class="nombre form-control" type="text" placeholder="Ingrese su nombre">
                        </div>
                        <div class="form-group">
                            <label for="email">Correo electrónico</label>
                            <input id="email" name="correo" type="email" class="email form-control" placeholder="Ingrese su correo">
                        </div>
                        <div class="form-group">
                            <label for="phone">Teléfono</label>
                            <input id="telefono" name="telefono" type="text" class="telefono form-control" placeholder="Ingrese su teléfono">
                        </div>
                        <div class="form-group">
                            <label for="type">Tipo de solicitud</label>
                            <select id="type" name="tipo" class="tipo form-control">
                                <option value="Sugerencia">Sugerencia</option>
                                <option value="Queja">Queja</option>
                                <option value="Consulta">Consulta</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="message">Mensaje</label>
                            <textarea id="message" name="mensaje" class="mensaje form-control" rows="5" placeholder="Ingrese su mensaje"></textarea>
                        </div>
                        <button type="submit" class="btn btn-danger">Enviar</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</body>
</html>








