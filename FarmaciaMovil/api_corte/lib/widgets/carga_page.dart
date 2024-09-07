import 'package:flutter/material.dart';

class CargaPage extends StatelessWidget {
  const CargaPage({
    Key? key,
  }) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: const Color(0xFF74BD64), // Fondo verde
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            // Contenedor redondeado blanco
            Container(
              width: 200, // Ancho del contenedor
              height: 200, // Alto del contenedor
              decoration: BoxDecoration(
                color: Colors.white, // Fondo blanco
                shape: BoxShape.circle, // Forma redondeada
              ),
              child: Padding(
                padding: const EdgeInsets.all(16.0),
                child: Image.asset(
                  'assets/images/logo.png',
                  fit: BoxFit.contain, // Asegura que el logo se ajuste al contenedor
                ),
              ),
            ),
            SizedBox(height: 30), // Espacio entre el logo y el texto
            Text(
              'Por favor espere...',
              style: TextStyle(
                color: Colors.white, // Texto blanco
                fontSize: 18, // Tamaño de la letra
                fontWeight: FontWeight.bold,
              ),
            ),
          ],
        ),
      ),
    );
  }
}
