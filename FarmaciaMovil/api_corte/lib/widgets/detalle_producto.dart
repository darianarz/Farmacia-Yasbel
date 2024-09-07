import 'package:flutter/material.dart';

class DetalleProducto extends StatelessWidget {
  final dynamic product;

  DetalleProducto({required this.product});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(product['nombre']),
      ),
      body: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            Image.network(product['foto']),
            SizedBox(height: 16.0),
            Text(
              product['nombre'],
              style: TextStyle(fontSize: 24.0, fontWeight: FontWeight.bold),
            ),
            SizedBox(height: 8.0),
            Text(
              'Price: \$${product['precio']}',
              style: TextStyle(fontSize: 18.0, color: Colors.green),
            ),
            SizedBox(height: 16.0),
            Text(
              product['descripcion'],
              style: TextStyle(fontSize: 16.0),
            ),
            Spacer(),
            ElevatedButton(
              onPressed: () {
                // Add to cart logic
              },
              child: Text('Add to Cart'),
            ),
          ],
        ),
      ),
    );
  }
}
