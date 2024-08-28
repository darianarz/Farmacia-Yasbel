<%-- 
    Document   : GestionPedidoEmp
    Created on : 20/08/2024, 10:41:53 AM
    Author     : SENA
--%>

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
                        <a href="#" class="nav-link active">
                            <svg class="icon" xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round">
                            <path d="M19 21v-2a4 4 0 0 0-4-4H9a4 4 0 0 0-4 4v2"/>
                            <circle cx="12" cy="7" r="4"/>
                            </svg>
                            Mi cuenta
                        </a>
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
                                <a href="#" class="collapsible-link submenu-btn">Productos Disponibles</a>
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
                                <a href="#" class="user-menu-item">Configuración</a>
                                <a href="#" class="user-menu-item">Soporte</a>
                                <div class="user-menu-separator"></div>
                                <a href="#" class="user-menu-item">Cerrar sesión</a>
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
                                                <tr>
                                                    <td><span class="badge pending">Pendiente</span></td>
                                                    <td>
                                                        <div class="font-medium">Juan Pérez</div>
                                                        <div class="text-muted">Calle Principal 123, Bogotá</div>
                                                        <div class="text-muted">+57 123 456 789</div>
                                                    </td>
                                                    <td>
                                                        <div>Paracetamol x 2</div>
                                                        <div>Ibuprofeno x 1</div>
                                                    </td>
                                                    <td>$50.00</td>
                                                    <td>
                                                        <div class="actions">
                                                            <button class="button icon success">
                                                                <svg class="icon" xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round">
                                                                <path d="M20 6 9 17l-5-5"></path>
                                                                </svg>
                                                                <span class="sr-only">Marcar como Pagado</span>
                                                            </button>
                                                            <button class="button icon info">
                                                                <svg class="icon" xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round">
                                                                <path d="M14 18V6a2 2 0 0 0-2-2H4a2 2 0 0 0-2 2v11a1 1 0 0 0 1 1h2"></path>
                                                                <path d="M15 18H9"></path>
                                                                <path d="M19 18h2a1 1 0 0 0 1-1v-3.65a1 1 0 0 0-.22-.624l-3.48-4.35A1 1 0 0 0 17.52 8H14"></path>
                                                                <circle cx="17" cy="18" r="2"></circle>
                                                                <circle cx="7" cy="18" r="2"></circle>
                                                                </svg>
                                                                <span class="sr-only">Marcar como Listo para Enviar</span>
                                                            </button>
                                                        </div>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td><span class="badge pending">Pendiente</span></td>
                                                    <td>
                                                        <div class="font-medium">María Gómez</div>
                                                        <div class="text-muted">Avenida Central 456, Medellín</div>
                                                        <div class="text-muted">+57 987 654 321</div>
                                                    </td>
                                                    <td>
                                                        <div>Amoxicilina x 3</div>
                                                        <div>Vitamina C x 1</div>
                                                    </td>
                                                    <td>$75.00</td>
                                                    <td>
                                                        <div class="actions">
                                                            <button class="button icon success">
                                                                <svg class="icon" xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round">
                                                                <path d="M20 6 9 17l-5-5"></path>
                                                                </svg>
                                                                <span class="sr-only">Marcar como Pagado</span>
                                                            </button>
                                                            <button class="button icon info">
                                                                <svg class="icon" xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round">
                                                                <path d="M14 18V6a2 2 0 0 0-2-2H4a2 2 0 0 0-2 2v11a1 1 0 0 0 1 1h2"></path>
                                                                <path d="M15 18H9"></path>
                                                                <path d="M19 18h2a1 1 0 0 0 1-1v-3.65a1 1 0 0 0-.22-.624l-3.48-4.35A1 1 0 0 0 17.52 8H14"></path>
                                                                <circle cx="17" cy="18" r="2"></circle>
                                                                <circle cx="7" cy="18" r="2"></circle>
                                                                </svg>
                                                                <span class="sr-only">Marcar como Listo para Enviar</span>
                                                            </button>
                                                        </div>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td><span class="badge paid">Pagado por Nequi</span></td>
                                                    <td>
                                                        <div class="font-medium">Carlos Rodríguez</div>
                                                        <div class="text-muted">Calle 67 #89-12, Cali</div>
                                                        <div class="text-muted">+57 456 789 012</div>
                                                    </td>
                                                    <td>
                                                        <div>Aspirina x 1</div>
                                                        <div>Loratadina x 2</div>
                                                    </td>
                                                    <td>$35.00</td>
                                                    <td>
                                                        <div class="actions">
                                                            <button class="button icon info">
                                                                <svg class="icon" xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round">
                                                                <path d="M14 18V6a2 2 0 0 0-2-2H4a2 2 0 0 0-2 2v11a1 1 0 0 0 1 1h2"></path>
                                                                <path d="M15 18H9"></path>
                                                                <path d="M19 18h2a1 1 0 0 0 1-1v-3.65a1 1 0 0 0-.22-.624l-3.48-4.35A1 1 0 0 0 17.52 8H14"></path>
                                                                <circle cx="17" cy="18" r="2"></circle>
                                                                <circle cx="7" cy="18" r="2"></circle>
                                                                </svg>
                                                                <span class="sr-only">Marcar como Listo para Enviar</span>
                                                            </button>
                                                        </div>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td><span class="badge paid">Pagado por Contraentrega</span></td>
                                                    <td>
                                                        <div class="font-medium">Ana Martínez</div>
                                                        <div class="text-muted">Carrera 45 #78-90, Barranquilla</div>
                                                        <div class="text-muted">+57 789 012 345</div>
                                                    </td>
                                                    <td>
                                                        <div>Omeprazol x 1</div>
                                                        <div>Acetaminofén x 2</div>
                                                    </td>
                                                    <td>$45.00</td>
                                                    <td>
                                                        <div class="actions">
                                                            <button class="button icon info">
                                                                <svg class="icon" xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round">
                                                                <path d="M14 18V6a2 2 0 0 0-2-2H4a2 2 0 0 0-2 2v11a1 1 0 0 0 1 1h2"></path>
                                                                <path d="M15 18H9"></path>
                                                                <path d="M19 18h2a1 1 0 0 0 1-1v-3.65a1 1 0 0 0-.22-.624l-3.48-4.35A1 1 0 0 0 17.52 8H14"></path>
                                                                <circle cx="17" cy="18" r="2"></circle>
                                                                <circle cx="7" cy="18" r="2"></circle>
                                                                </svg>
                                                                <span class="sr-only">Marcar como Listo para Enviar</span>
                                                            </button>
                                                        </div>
                                                    </td>
                                                </tr>
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
