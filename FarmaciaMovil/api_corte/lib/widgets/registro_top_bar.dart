import 'package:flutter/material.dart';

class RegistroTopBar extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return CustomPaint(
      child: Container(
        height: 300.0, // Ajusta la altura para acomodar el nuevo elemento
        child: Stack(
          children: [
            Positioned.fill(
              child: CustomPaint(
                painter: RegistroTopBarPainter(),
              ),
            ),
            Positioned(
              top: 20.0, // Ajusta la posición vertical del contenedor circular
              left: MediaQuery.of(context).size.width * 0.4 - 32, // Centra el contenedor horizontalmente
              child: Container(
                width: 150.0, // Ajusta el tamaño del contenedor circular
                height: 150.0,
                decoration: BoxDecoration(
                  color: const Color(0xFF74BD64), // Color verde claro
                  shape: BoxShape.circle,
                ),
              ),
            ),
          ],
        ),
      ),
    );
  }
}

class RegistroTopBarPainter extends CustomPainter {
  @override
  void paint(Canvas canvas, Size size) {
    Path path = Path();
    Paint paint = Paint();

    // Primer fondo
    path.lineTo(0, size.height * 0.75);
    path.quadraticBezierTo(size.width * 0.10, size.height * 0.70, size.width * 0.17, size.height * 0.90);
    path.quadraticBezierTo(size.width * 0.20, size.height, size.width * 0.25, size.height * 0.90);
    path.quadraticBezierTo(size.width * 0.40, size.height * 0.40, size.width * 0.50, size.height * 0.70);
    path.quadraticBezierTo(size.width * 0.60, size.height * 0.85, size.width * 0.65, size.height * 0.65);
    path.quadraticBezierTo(size.width * 0.70, size.height * 0.90, size.width, 0);
    path.close();
    paint.color = const Color(0xFFB4FD9F); // Color verde oscuro para el primer fondo
    canvas.drawPath(path, paint);

    // Segundo fondo
    path = Path();
    path.lineTo(0, size.height * 0.50);
    path.quadraticBezierTo(size.width * 0.10, size.height * 0.80, size.width * 0.15, size.height * 0.60);
    path.quadraticBezierTo(size.width * 0.20, size.height * 0.45, size.width * 0.27, size.height * 0.60);
    path.quadraticBezierTo(size.width * 0.45, size.height, size.width * 0.50, size.height * 0.80);
    path.quadraticBezierTo(size.width * 0.55, size.height * 0.45, size.width * 0.75, size.height * 0.75);
    path.quadraticBezierTo(size.width * 0.85, size.height * 0.93, size.width, size.height * 0.60);
    path.lineTo(size.width, 0);
    path.close();
    paint.color = const Color(0xFF94DD81); // Otro tono de verde
    canvas.drawPath(path, paint);

    // Tercer fondo
    path = Path();
    path.lineTo(0, size.height * 0.75);
    path.quadraticBezierTo(size.width * 0.10, size.height * 0.55, size.width * 0.22, size.height * 0.70);
    path.quadraticBezierTo(size.width * 0.30, size.height * 0.90, size.width * 0.40, size.height * 0.75);
    path.quadraticBezierTo(size.width * 0.52, size.height * 0.50, size.width * 0.65, size.height * 0.70);
    path.quadraticBezierTo(size.width * 0.75, size.height * 0.85, size.width, size.height * 0.60);
    path.lineTo(size.width, 0);
    path.close();
    paint.color = const Color(0xFF559D46); // Verde claro
    canvas.drawPath(path, paint);
  }

  @override
  bool shouldRepaint(CustomPainter oldDelegate) {
    return false;
  }
}