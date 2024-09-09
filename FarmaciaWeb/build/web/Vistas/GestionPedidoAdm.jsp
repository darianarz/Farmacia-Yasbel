<%-- 
    Document   : GestionPedidoEmp
    Created on : 20/08/2024, 10:41:53 AM
    Author     : SENA
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestión de Pedidos</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <link href="/FarmaciaWeb/CSS/IndexAdmin.css" rel="stylesheet" type="text/css"/>
        <link href="/FarmaciaWeb/CSS/GestionPedidoAdm.css" rel="stylesheet" type="text/css"/>

    </head>
    <body>
        <div class="container-fluid">
            <div class="row">
                <div class="col-md-3 sidebar">
                    <div class="header d-flex justify-content-between align-items-center mb-3">
                        <a href="/FarmaciaWeb/CtrProductoLi?accion=home" class="logo d-flex align-items-center text-light">
                            <svg class="icon" xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round">
                            <path d="M3 9h18v10a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V9Z"/>
                            <path d="m3 9 2.45-4.9A2 2 0 0 1 7.24 3h9.52a2 2 0 0 1 1.8 1.1L21 9"/>
                            <path d="M12 3v6"/>
                            </svg>
                            Farmacia Yasbel
                        </a>
                        <button class="notification-btn btn btn-link text-light">
                            <svg class="icon" xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round">
                            <path d="M6 8a6 6 0 0 1 12 0c0 7 3 9 3 9H3s3-2 3-9"/>
                            <path d="M10.3 21a1.94 1.94 0 0 0 3.4 0"/>
                            </svg>
                            <span class="sr-only">Toggle notifications</span>
                        </button>
                    </div>

                    <div class="collapsible">
                        <button class="collapsible-trigger">
                            Gestión de Productos
                            <svg class="icon" xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round">
                            <path d="m9 18 6-6-6-6"/>
                            </svg>
                        </button>
                        <div class="collapsible-content">

                            <a href="/FarmaciaWeb/CtrProductoLi?accion=gestion" class="collapsible-link submenu-btn">Procesamiento de Pedidos</a>
                            <a href="/FarmaciaWeb/CtrUsuarioCre?accion=Listar" class="collapsible-link submenu-btn">Gestión de Clientes</a>
                            <a href="/FarmaciaWeb/CtrProductoLi?accion=Listaradm" class="collapsible-link submenu-btn">Gestion de Productos</a>
                            <a href="/FarmaciaWeb/CtrPQR?accion=listarPQR" class="collapsible-link submenu-btn">PQR</a>
                            <a href="/FarmaciaWeb/CtrProveedores?accion=listarProveedores" class="collapsible-link submenu-btn">Proveedores</a>
                        </div>
                    </div>
                    </nav>
                </div>
                <div class="col-md-9 main-content">
                    <header class="header d-flex justify-content-between align-items-center mb-3">
                        <a href="#" class="menu-toggle btn btn-link">
                            <svg class="icon" xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round">
                            <path d="M3 9h18v10a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V9Z"/>
                            <path d="m3 9 2.45-4.9A2 2 0 0 1 7.24 3h9.52a2 2 0 0 1 1.8 1.1L21 9"/>
                            <path d="M12 3v6"/>
                            </svg>
                            <span class="sr-only">Home</span>
                        </a>
                        <form class="search-form d-flex">
                            <input type="search" class="form-control" placeholder="Buscar productos...">
                            <svg class="icon search-icon" xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round">
                            <circle cx="11" cy="11" r="8"/>
                            <path d="m21 21-4.3-4.3"/>
                            </svg>
                        </form>
                        <div class="user-menu">
                            <button class="user-btn btn btn-link">
                                <img src="https://www.w3schools.com/w3images/avatar2.png" width="32" height="32" alt="Avatar" class="avatar">
                                <span class="sr-only">Toggle user menu</span>
                            </button>
                            <div class="user-menu-content">
                                <a class="dropdown-item " >${usuario.getUsunombre()}</a>
                                <a class="dropdown-item " >${usuario.getUsutipo()}</a>
                                <a class="dropdown-item text-danger" href="/FarmaciaWeb/CtrProductoLi?accion=salir">Cerrar Sesion</a>
                            </div>
                        </div>
                    </header>
                    <main class="main">
                        <h1>Panel de Administración</h1>
                        <div class="container">
                            <div class="table-container">
                                <table>
                                    <thead>
                                        <tr>
                                            <th>Estado</th>
                                            <th>Cliente</th>
                                            <th>Productos</th>
                                            <th>Total</th>
                                            <th>Acciones</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach var="ped" items="${pedido}">
                                            <tr>
                                                <td><span class="badge pending">${ped.getPedEstado()}</span></td>
                                                <td>
                                                    <div class="font-medium">${ped.getTblUsuarios()}</div>

                                                </td>
                                                <td>
                                                    <!-- Esta sección debe ser dinámica según los productos en el pedido -->
                                                    <div>Paracetamol x 2</div>
                                                    <div>Ibuprofeno x 1</div>
                                                </td>
                                                <td>${ped.pedTotal}</td>
                                                <td>
                                                    <div class="actions">
                                                        <input type="hidden" class="idpqr" value="${ped.getPedCodigo()}">
                                                        <a class="btn btn-danger btneliminarpqr" href="#"><i class="bi bi-trash-fill"></i></a>
                                                        <a class="btn" style="background-color: #74BD64" href="CtrProductoLi?accion=Epedidos&idp=${ped.getPedCodigo()}">
                                                            <i class="bi bi-envelope-check"></i>
                                                        </a>
                                                    </div>
                                                </td>
                                            </tr>
                                        </c:forEach>

                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </main>
                </div>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <script src="/FarmaciaWeb/JS/IndexAdmin.js" type="text/javascript"></script>
    </body>
</html>
