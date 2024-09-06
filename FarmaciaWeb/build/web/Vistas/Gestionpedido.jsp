<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Historial de pedidos</title>
  <!-- Bootstrap CSS -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
  <link href="../CSS/Gestionpedido.css" rel="stylesheet" type="text/css"/>
</head>
<body>
  
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
        <form class="form-inline my-2 my-lg-0 mr-auto search-form" action="/FarmaciaWeb/CtrProductoLi?accion=buscar" method="post">
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
  <!-- Espacio entre el navbar y el contenido -->
  <br>
  <br>
  <br>
  <br>
  <div class="mt-4 container">
    <header class="mb-4">
      <h1>Historial de pedidos</h1>
      <p>Aquí puedes ver el estado, precio y procesamiento de tus pedidos.</p>
    </header>

    <div class="table-responsive">
      <table class="table table-hover">
        <thead class="table-light">
          <tr>
            <th>ID</th>
            <th>Estado</th>
            <th>Precio</th>
            <th>Fecha</th>
            <th>Acción</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>ORD001</td>
            <td><span class="badge bg-warning text-dark">Pendiente</span></td>
            <td>$149.909</td>
            <td>2023-05-12</td>
            <td><button class="btn btn-outline-primary btn-sm" data-bs-toggle="modal" data-bs-target="#orderModal" onclick="setModalDetails('ORD001')">Ver detalles</button></td>
          </tr>
          <tr>
            <td>ORD002</td>
            <td><span class="badge bg-info text-dark">Enviado</span></td>
            <td>$79.909</td>
            <td>2023-04-28</td>
            <td><button class="btn btn-outline-primary btn-sm" data-bs-toggle="modal" data-bs-target="#orderModal" onclick="setModalDetails('ORD002')">Ver detalles</button></td>
          </tr>
          <tr>
            <td>ORD003</td>
            <td><span class="badge bg-success">Entregado</span></td>
            <td>$299.99</td>
            <td>2023-03-15</td>
            <td><button class="btn btn-outline-primary btn-sm" data-bs-toggle="modal" data-bs-target="#orderModal" onclick="setModalDetails('ORD003')">Ver detalles</button></td>
          </tr>
          <tr>
            <td>ORD004</td>
            <td><span class="badge bg-danger">Cancelado</span></td>
            <td>$39.909</td>
            <td>2023-02-22</td>
            <td><button class="btn btn-outline-primary btn-sm" data-bs-toggle="modal" data-bs-target="#orderModal" onclick="setModalDetails('ORD004')">Ver detalles</button></td>
          </tr>
          <tr>
            <td>ORD005</td>
            <td><span class="badge bg-warning text-dark">Pendiente</span></td>
            <td>$199.990</td>
            <td>2023-01-08</td>
            <td><button class="btn btn-outline-primary btn-sm" data-bs-toggle="modal" data-bs-target="#orderModal" onclick="setModalDetails('ORD005')">Ver detalles</button></td>
          </tr>
        </tbody>
      </table>
    </div>

    <!-- Modal -->
    <div class="modal fade" id="orderModal" tabindex="-1" aria-labelledby="orderModalLabel" aria-hidden="true">
      <div class="modal-dialog">
        <div class="modal-content">
          <div class="modal-header">
            <h5 class="modal-title" id="orderModalLabel">Detalles del pedido</h5>
            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
          </div>
          <div class="modal-body">
            <p id="orderDetails">Detalles del pedido...</p>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cerrar</button>
          </div>
        </div>
      </div>
    </div>

  </div>

  <!-- Bootstrap JS (y dependencias de Popper.js) -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

  <script>
    function setModalDetails(orderId) {
      document.getElementById('orderDetails').innerText = 'Detalles del pedido: ' + orderId;
    }
  </script>
</body>
</html>
