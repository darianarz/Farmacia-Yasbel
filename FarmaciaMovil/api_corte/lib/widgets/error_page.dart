import 'package:flutter/material.dart';

class ErrorPage extends StatelessWidget {
  const ErrorPage({
    Key? key,
  }) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.white, // Fondo blanco
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            // Contenedor verde redondeado debajo del logotipo
            Container(
              padding: EdgeInsets.all(16.0),
              decoration: BoxDecoration(
                color: const Color(0xFF74BD64), // Color verde del contenedor
                shape: BoxShape.circle, // Forma circular para embasar el logo
              ),
              child: Image.asset(
                'assets/images/logo.png',
                height: 150.0,
              ),
            ),
            SizedBox(height: 20),
            // Texto "!UPS" debajo del logotipo
            Text(
              '¡UPS!',
              style: TextStyle(
                fontSize: 32,
                fontWeight: FontWeight.bold,
                color: const Color(0xFF74BD64), // Color verde para "¡UPS!"
              ),
            ),
            SizedBox(height: 10),
            // Texto "vuelva más tarde" debajo del texto "¡UPS!"
            Text(
              'Vuelva más tarde',
              style: TextStyle(
                fontSize: 20,
                color: Colors.black, // Color negro para "vuelva más tarde"
              ),
            ),
          ],
        ),
      ),
    );
  }
}
