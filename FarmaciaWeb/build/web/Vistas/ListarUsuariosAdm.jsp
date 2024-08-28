<%-- 
    Document   : ListarUsuariosAdm
    Created on : 26/08/2024, 10:48:52 AM
    Author     : SENA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" crossorigin="anonymous">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
        <title>Listar Usuarios</title>
        <link href="/FarmaciaWeb/CSS/IndexAdmin.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
         <div class="container-fluid">
        <div class="row">
            <div class="col-md-3 sidebar">
                <div class="header d-flex justify-content-between align-items-center mb-3">
                    <a href="#" class="logo d-flex align-items-center text-light">
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
                <nav class="nav">
                    
                    <!-- Collapsible Section -->
                    <div class="collapsible">
                        <button class="collapsible-trigger">
                            Gestión de Productos
                            <svg class="icon" xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round">
                                <path d="m9 18 6-6-6-6"/>
                            </svg>
                        </button>
                        <div class="collapsible-content">
                            <a href="#" class="collapsible-link">Droguería</a>
                            <a href="IndexAdmin.jsp" class="collapsible-link submenu-btn">Inventario</a>
                            <a href="GestionPedidoAdm.jsp" class="collapsible-link submenu-btn">Procesamiento de Pedidos</a>
                            <a href="#" class="collapsible-link submenu-btn">Gestión de Clientes</a>
                            <a href="ListarProductoAdm.jsp" class="collapsible-link submenu-btn">Gestion de Productos</a>
                            <a href="#" class="collapsible-link submenu-btn">..</a>
                            <a href="#" class="collapsible-link submenu-btn">PQR</a>
                            <a href="#" class="collapsible-link submenu-btn">..</a>
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
                            <img src="/placeholder.svg" width="32" height="32" alt="Avatar" class="avatar">
                            <span class="sr-only">Toggle user menu</span>
                        </button>
                        <div class="user-menu-content">
                            <div class="user-menu-label">Mi Cuenta</div>
                            <div class="user-menu-separator"></div>
                            <a href="#" class="user-menu-item">Cerrar sesión</a>
                        </div>
                    </div>
                </header>
                <main class="main">
                     <div class="container mt-5 border" style="border-radius: 15px">
            <div class="row">
                <div class="col-sm-4"></div>
                <div class="col-sm-4"></div>
                <div class="col-sm-4">
                    <form class="form-inline mt-4" action="">
                        <div class="form-group mx-sm-3 mb-2">
                            <input type="text" class="form-control" name="txtbuscar" placeholder="digite nombre">
                        </div>
                        <button type="submit" class="btn btn-success mb-2" name="accion" value="buscar"  style="background: #74BD64"><i class="bi bi-search"></i> Buscar</button>
                    </form>
                </div>
            </div>
            <table class="table table-bordered">
                <thead class="thead-light border">
                    <tr table-success>
                        <th scope="col" colspan="7" class="text-center border">USUARIOS DE LA FARMACIA</th>
                        <th scope="col" class="text-center border"><a class="btn btn-primary ml-2" href=""  style="background: #74BD64"><i class="bi bi-person-add"></i></a></th>
                    </tr>
                    <tr>
                        <th scope="col" class="text-center border">Id</th>
                        <th scope="col" class="text-center border">Nombre</th>
                        <th scope="col" class="text-center border">Apellido</th>
                        <th scope="col" class="text-center border">Direccion</th>
                        <th scope="col" class="text-center border">Telefono</th>
                        <th scope="col" class="text-center border">Usuario</th>
                        <th scope="col" class="text-center border">Tipo</th>
                        <th scope="col" class="text-center border">Acciones</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="usu" items="">  
                    <tr>
                        <th scope="row" class="border"></th>
                        <td class="border"></td>
                        <td class="border"></td>
                        <td class="border"></td>
                        <td class="border"></td>
                        <td class="border"></td>
                        <td class="border"></td>
                        <td class=" text-center border">
                            <input type="hidden" name="id" id="id" value="">
                            <a class="btn btn-warning" href=""><i class="bi bi-pencil-fill"></i></a>
                            <a class="btn btn-danger" id="btneliminar" href="#"><i class="bi bi-trash-fill"></i></i></a>
                        </td>
                    </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
                </main>
            </div>
        </div>
    </div>
    <!-- Bootstrap JS, Popper.js, and jQuery -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script src="../JS/IndexAdmin.js" type="text/javascript"></script>
    </body>
</html>
