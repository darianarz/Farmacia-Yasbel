import 'package:api_corte/carrito/carrito_model.dart';
import 'package:flutter/material.dart';
import 'package:api_corte/models/product.dart';
import 'package:provider/provider.dart';

class DetalleProducto extends StatelessWidget {
  final Product product;

  DetalleProducto({required this.product});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(product.name),
      ),
      body: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            Center(
              child: Image.network(
                'https://localhost:3000/Imagenes/${product.categoryId}/${product.photo}',
                fit: BoxFit.cover,
                height: 250.0,
                width: double.infinity,
                errorBuilder: (context, error, stackTrace) {
                  return Center(child: Icon(Icons.error, color: Colors.red));
                },
              ),
            ),
            SizedBox(height: 16.0),
            Text(
              product.name,
              style: TextStyle(fontSize: 24.0, fontWeight: FontWeight.bold),
            ),
            SizedBox(height: 8.0),
            Text(
              'Precio: \$${product.price}',
              style: TextStyle(fontSize: 18.0, color: Colors.green),
            ),
            SizedBox(height: 16.0),
            Text(
              product.description,
              style: TextStyle(fontSize: 16.0),
            ),
            Spacer(),
            ElevatedButton(
              onPressed: () {
                // Add to cart logic
                final carrito = Provider.of<CarritoModel>(context, listen: false);
                carrito.addProduct(product);
                ScaffoldMessenger.of(context).showSnackBar(
                  SnackBar(
                    content: Text('${product.name} añadido al carrito'),
                    duration: Duration(seconds: 2),
                    backgroundColor: Colors.green,
                    behavior: SnackBarBehavior.floating,
                    shape: RoundedRectangleBorder(
                      borderRadius: BorderRadius.circular(30),
                    ),
                    margin: EdgeInsets.symmetric(horizontal: 20, vertical: 10),
                  ),
                );
              },
              child: Text('Añadir al Carrito'),
            ),
          ],
        ),
      ),
    );
  }
}
