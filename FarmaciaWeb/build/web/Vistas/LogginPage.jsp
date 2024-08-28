<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <link href="FarmaciaWeb/CSS/style.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-icons/1.10.5/font/bootstrap-icons.min.css" integrity="sha512-ZnR2wlLbSbr8/c9AgLg3jQPAattCUImNsae6NHYnS9KrIwRdcY9DxFotXhNAKIKbAXlRnujIqUWoXXwqyFOeIQ==" crossorigin="anonymous" referrerpolicy="no-referrer" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="/FarmaciaWeb/CSS/LoginPage.css" rel="stylesheet" type="text/css"/>
        
    </head>
    <%String Mensaje = "";
        if (request.getParameter("fallo") != null) {
            int i = Integer.parseInt(request.getParameter("fallo"));
            if (i == 0) {
                Mensaje = "usuario y/o contrase�a incorrecta";
            }
        }
    %>
    <body>
        <div class="container">
            <div class="box">
                <div class="form sign_in">
                    
                    <img src="../Imagenes/lo-removebg-preview.png" alt="Logo" class="logo"/>
                    <h3>Iniciar sesi�n</h3>

                    <form action="/FarmaciaWeb/CtrValidarInfo" id="form_input" method="post">
                        <div class="type">
                            <input type="text" placeholder="Correo Electronico" id="email" name="txtusu">
                        </div>
                        <div class="type">
                            <input type="password" placeholder="Contrase�a" id="password" name="txtpass">
                        </div>
                        <div class="forgot">
                            <span>�Olvid� su contrase�a?</span>
                        </div>
                        
                        <input type="submit" name="accion" value="Ingresar" class="btn bkg">
                        <p style="Color: red;"><%=Mensaje %></p>
                    </form>
                </div>

                <div class="form sign_up">
                    <img src="../Imagenes/lo-removebg-preview.png" alt="Logo" class="logo"/>
                    <h3>Reg�strate</h3>
                    <form action="/FarmaciaWeb/CtrUsuarioCre?accion=nuevo" id="form_input" class="form_input2">
                        <div class="grid-container">
                            <div class="type">
                                <input type="text" placeholder="N�mero de identificaci�n" name="id" id="id" class="id">
                            </div>
                            <div class="type">
                                <input type="text" placeholder="Nombre" id="nombre" class="nombre" name="nombre">
                            </div>
                            <div class="type">
                                <input type="text" placeholder="Apellido" name="apellido" id="apellido" class="apellido">
                            </div>
                            <div class="type">
                                <input  type="text" placeholder="Direcci�n" id="direccion" class="direccion" name="direccion">
                            </div>
                            <div class="type">
                                <input type="number" placeholder="Tel�fono" id="telefono" class="telefono" name="telefono">
                            </div>
                            <div class="type">
                                <input type="email" placeholder="Correo" id="email" class="email" name="email">
                            </div>
                            <div class="type">
                                <input type="text" placeholder="usuario" id="usuario" class="usuario" name="usuario">
                            </div>
                            
                            <div class="type">
                                <input type="password" placeholder="Contrase�a" id="contrasena" class="contrasena" name="contrasena">
                            </div>
                            
                            <div class="col formulario_grupo" id="grupo_tipo">
                            <label for="tipo" class="formulario_label">Tipo</label> 
                            <div class="formulario_grupo-input">
                                <select class="form-control formulario_input" name="tipo" id="tipo">
                                    <option value="Administrador">Administrador</option> 
                                    <option value="Usuario">Usuario</option> 
                                    <option value="Invitado">Invitado</option> 
                                    <option value="Cliente">Cliente</option> 
                                </select>
                            </div>
                        </div>
                            
                            
                        </div>
                        
                         <button type="submit" class="btn bkg" name="accion" value="nuevo">Guardar <i class="bi bi-floppy"></i></button>
                        <br>
                        <br>
                    </form>
                </div>
            </div>

            <div class="overlay">
                <div class="page page_signIn">
                    <img src="../Imagenes/lo-removebg-preview.png" alt="Logo" class="logo"/>
                    <h3>�Bienvenido!</h3>
                    <p>Para continuar con nosotros, inicie sesi�n con sus datos personales.</p>
                    <button class="btn btnSign-in">Reg�strate <i class="bi bi-arrow-right"></i></button>
                </div>

                <div class="page page_signUp">
                    <img src="../Imagenes/lo-removebg-preview.png" alt="Logo" class="logo"/>
                    <h3>�Bienvenido!</h3>
                    <p>Ingresa tus datos personales</p>
                    <button class="btn btnSign-up"><i class="bi bi-arrow-left"></i> Iniciar sesi�n</button>
                </div>
            </div>
        </div>

        <script src="../JS/LoginPage.js" type="text/javascript"></script>
        <script src="../JS/ValidarDatos.js" type="text/javascript"></script>
    </body>
    

</html>
