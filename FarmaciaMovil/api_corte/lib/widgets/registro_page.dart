import 'package:api_corte/home_page.dart';
import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'user_provider.dart';  // Asegúrate de que este es el path correcto para importar el UserProvider
import 'registro_top_bar.dart';  // Importa tu archivo de diseño de barra superior

class RegistroPage extends StatefulWidget {
  @override
  _RegistroPageState createState() => _RegistroPageState();
}

class _RegistroPageState extends State<RegistroPage> {
  final TextEditingController _usernameController = TextEditingController();
  final TextEditingController _firstNameController = TextEditingController();
  final TextEditingController _lastNameController = TextEditingController();
  final TextEditingController _emailController = TextEditingController();
  final TextEditingController _passwordController = TextEditingController();
  final TextEditingController _passwordConfirmationController = TextEditingController();
  final TextEditingController _phoneController = TextEditingController();
  final TextEditingController _addressController = TextEditingController();
  
  String? _errorMessage;

  Future<void> _register() async {
    final String username = _usernameController.text.trim();
    final String firstName = _firstNameController.text.trim();
    final String lastName = _lastNameController.text.trim();
    final String email = _emailController.text.trim();
    final String password = _passwordController.text.trim();
    final String passwordConfirmation = _passwordConfirmationController.text.trim();
    final String phone = _phoneController.text.trim();
    final String address = _addressController.text.trim();

    if (username.isEmpty || firstName.isEmpty || lastName.isEmpty || email.isEmpty || password.isEmpty || passwordConfirmation.isEmpty || phone.isEmpty || address.isEmpty) {
      setState(() {
        _errorMessage = 'Por favor, complete todos los campos.';
      });
      return;
    }

    if (password != passwordConfirmation) {
      setState(() {
        _errorMessage = 'Las contraseñas no coinciden.';
      });
      return;
    }

    final userProvider = Provider.of<UserProvider>(context, listen: false);

    try {
      await userProvider.register(
        username,
        firstName,
        lastName,
        email,
        password,
        phone,
        address,
        passwordConfirmation,
      );

      if (userProvider.username != null) {
        if (!mounted) return; // Verificar si el widget sigue montado
        Navigator.pushReplacement(
          context,
          MaterialPageRoute(builder: (context) => HomePage(token: userProvider.token!)),
        );
      } else {
        setState(() {
          _errorMessage = 'Error al registrar el usuario.';
        });
      }
    } catch (e) {
      setState(() {
        _errorMessage = 'Error durante el registro. Por favor, intente de nuevo.';
      });
    }
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Stack(
        children: [
          RegistroTopBar(), // Llama al diseño del archivo 'registro_top_bar.dart'
          Align(
            alignment: Alignment.topCenter,
            child: Container(
              margin: EdgeInsets.only(top: 20.0), // Espacio superior para el logo
              child: Column(
                children: [
                  Container(
                    width: 150.0,
                    height: 150.0,
                    decoration: BoxDecoration(
                      color: const Color(0xFF74BD64), // Color verde claro
                      shape: BoxShape.circle,
                    ),
                    child: Center(
                      child: Image.asset(
                        'assets/images/logo.png', // Asegúrate de que la ruta del logo es correcta
                        height: 160.0, // Ajusta el tamaño del logotipo según sea necesario
                      ),
                    ),
                  ),
                ],
              ),
            ),
          ),
          Positioned(
            top: 230, // Ajusta la posición para que no se sobreponga con el logo
            left: 0,
            right: 0,
            child: Padding(
              padding: const EdgeInsets.all(16.0),
              child: SingleChildScrollView(
                child: Column(
                  crossAxisAlignment: CrossAxisAlignment.start,
                  children: [
                    _buildTextField(_usernameController, 'Usuario'),
                    SizedBox(height: 10),
                    _buildTextField(_firstNameController, 'Nombre'),
                    SizedBox(height: 10),
                    _buildTextField(_lastNameController, 'Apellido'),
                    SizedBox(height: 10),
                    _buildTextField(_emailController, 'Correo Electrónico', keyboardType: TextInputType.emailAddress),
                    SizedBox(height: 10),
                    _buildTextField(_phoneController, 'Teléfono', keyboardType: TextInputType.phone),
                    SizedBox(height: 10),
                    _buildTextField(_addressController, 'Dirección'),
                    SizedBox(height: 10),
                    _buildTextField(_passwordController, 'Contraseña', obscureText: true),
                    SizedBox(height: 10),
                    _buildTextField(_passwordConfirmationController, 'Confirmar Contraseña', obscureText: true),
                    if (_errorMessage != null)
                      Padding(
                        padding: const EdgeInsets.only(top: 10.0),
                        child: Text(
                          _errorMessage!,
                          style: TextStyle(color: Colors.red, fontSize: 16),
                        ),
                      ),
                    SizedBox(height: 20),
                    Center(
                      child: ElevatedButton(
                        style: ElevatedButton.styleFrom(
                          backgroundColor: const Color(0xFF74BD64), // Color verde del botón
                          foregroundColor: Colors.white, // Letras blancas
                          minimumSize: Size(200, 60), // Tamaño del botón
                          elevation: 8, // Altura de la sombra
                          shadowColor: Colors.black.withOpacity(0.2), // Sombras suaves
                          side: BorderSide(
                            color: const Color(0xFF559D46), // Color del borde
                            width: 5.0, // Ancho del borde
                          ),
                          shape: RoundedRectangleBorder(
                            borderRadius: BorderRadius.circular(12.0), // Bordes redondeados
                          ),
                        ),
                        onPressed: _register,
                        child: Row(
                          mainAxisSize: MainAxisSize.min,
                          children: [
                            Icon(Icons.person_add), // Ícono de registro
                            SizedBox(width: 8),
                            Text('Registrar'),
                          ],
                        ),
                      ),
                    ),
                  ],
                ),
              ),
            ),
          ),
        ],
      ),
    );
  }

  // Método para construir campos de texto con estilo uniforme
  Widget _buildTextField(TextEditingController controller, String label, {bool obscureText = false, TextInputType keyboardType = TextInputType.text}) {
    return TextField(
      controller: controller,
      decoration: InputDecoration(
        labelText: label,
        filled: true,
        fillColor: Colors.white,
        border: OutlineInputBorder(
          borderRadius: BorderRadius.circular(8),
          borderSide: BorderSide.none,
        ),
        contentPadding: EdgeInsets.symmetric(vertical: 15, horizontal: 20),
      ),
      obscureText: obscureText,
      keyboardType: keyboardType,
    );
  }
}
