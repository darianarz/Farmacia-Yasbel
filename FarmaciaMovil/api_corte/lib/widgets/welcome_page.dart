import 'package:flutter/material.dart';
import 'top_bar.dart';

class WelcomePage extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Stack(
        children: [
          TopBar(), // Primero dibujamos el TopBar
          Align(
            alignment: Alignment.topCenter,
            child: Container(
              margin: EdgeInsets.only(top: 5.0), // Mayor espacio para alejar el logotipo de la superficie
              child: Image.asset(
                'assets/images/logo.png',
                height: 160.0, // Ajusta el tamaño del logotipo
              ),
            ),
          ),
          Center(
            child: Padding(
              padding: const EdgeInsets.all(16.0),
              child: Column(
                mainAxisAlignment: MainAxisAlignment.center,
                children: [
                  SizedBox(height: 120), // Ajusta el espacio superior para acomodar el logotipo
                  Text(
                    '¡Bienvenido!',
                    style: TextStyle(
                      fontSize: 32,
                      fontWeight: FontWeight.bold,
                      color: const Color(0xFF559D46),
                    ),
                    textAlign: TextAlign.center,
                  ),
                  SizedBox(height: 20),
                  // Texto de información en negro
                  Text(
                    'Aquí encontrarás una amplia variedad de productos a precios increíbles.',
                    style: TextStyle(
                      fontSize: 18,
                      color: Colors.black,
                    ),
                    textAlign: TextAlign.center,
                  ),
                  SizedBox(height: 40),
                  // Texto que dice "Inicia sesión" por encima del botón
                  Text(
                    'Inicia sesión',
                    style: TextStyle(
                      fontSize: 24,
                      fontWeight: FontWeight.bold,
                      color: const Color(0xFF559D46),
                    ),
                    textAlign: TextAlign.center,
                  ),
                  SizedBox(height: 20),
                  // Botón de inicio de sesión con borde
                  ElevatedButton(
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
                    onPressed: () {
                      Navigator.pushNamed(context, '/login');
                    },
                    child: Row(
                      mainAxisSize: MainAxisSize.min,
                      children: [
                        Icon(Icons.login), // Ícono de inicio de sesión
                        SizedBox(width: 8),
                        Text('Inicio de sesión'),
                      ],
                    ),
                  ),
                  SizedBox(height: 20),
                  // Texto de información sobre registro en negro
                  Text(
                    '¿No tienes una cuenta?, regístrate aquí!',
                    style: TextStyle(
                      fontSize: 18,
                      color: Colors.black,
                    ),
                    textAlign: TextAlign.center,
                  ),
                  SizedBox(height: 40),
                  // Botón de registrarse con borde
                  ElevatedButton(
                    style: ElevatedButton.styleFrom(
                      backgroundColor: const Color(0xFF74BD64), // Color verde del botón
                      foregroundColor: Colors.yellow, // Letras amarillas
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
                    onPressed: () {
                      Navigator.pushNamed(context, '/registro');
                    },
                    child: Row(
                      mainAxisSize: MainAxisSize.min,
                      children: [
                        Icon(Icons.person_add), // Ícono de registro
                        SizedBox(width: 8),
                        Text('Registrarse'),
                      ],
                    ),
                  ),
                ],
              ),
            ),
          ),
        ],
      ),
    );
  }
}
