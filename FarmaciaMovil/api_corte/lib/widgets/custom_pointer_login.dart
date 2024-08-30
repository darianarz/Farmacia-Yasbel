import 'package:flutter/material.dart';

class LoginShapePainter extends CustomPainter {
  @override
  void paint(Canvas canvas, Size size) {
    Path path = Path();
    Paint paint = Paint();

    // Primer fondo
    path.lineTo(0, size.height * 0.25);
    path.quadraticBezierTo(size.width * 0.25, size.height * 0.3, size.width * 0.5, size.height * 0.25);
    path.quadraticBezierTo(size.width * 0.75, size.height * 0.2, size.width, size.height * 0.25);
    path.lineTo(size.width, 0);
    path.close();
    paint.color = Colors.teal[300]!;
    canvas.drawPath(path, paint);

    // Segundo fondo
    path = Path();
    path.lineTo(0, size.height * 0.2);
    path.quadraticBezierTo(size.width * 0.25, size.height * 0.25, size.width * 0.5, size.height * 0.2);
    path.quadraticBezierTo(size.width * 0.75, size.height * 0.15, size.width, size.height * 0.2);
    path.lineTo(size.width, 0);
    path.close();
    paint.color = Colors.teal[400]!;
    canvas.drawPath(path, paint);

    // Tercer fondo
    path = Path();
    path.lineTo(0, size.height * 0.15);
    path.quadraticBezierTo(size.width * 0.25, size.height * 0.2, size.width * 0.5, size.height * 0.15);
    path.quadraticBezierTo(size.width * 0.75, size.height * 0.1, size.width, size.height * 0.15);
    path.lineTo(size.width, 0);
    path.close();
    paint.color = Colors.teal[500]!;
    canvas.drawPath(path, paint);
  }

  @override
  bool shouldRepaint(CustomPainter oldDelegate) {
    return oldDelegate != this;
  }
}
