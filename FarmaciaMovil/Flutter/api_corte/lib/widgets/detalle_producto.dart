import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'package:api_corte/models/product.dart';
import 'package:api_corte/carrito/carrito_model.dart';

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
            Text(
              product.name,
              style: Theme.of(context).textTheme.headline5,
            ),
            SizedBox(height: 8),
            Text(
              'Price: \$${product.price}',
              style: Theme.of(context).textTheme.subtitle1,
            ),
            SizedBox(height: 16),
            ElevatedButton(
              onPressed: () {
                final carritoModel = Provider.of<CarritoModel>(context, listen: false);
                carritoModel.addProduct(product, 1); // Asigna una cantidad aquí
                ScaffoldMessenger.of(context).showSnackBar(
                  SnackBar(
                    content: Text('Added ${product.name} to cart'),
                  ),
                );
              },
              child: Text('Add to Cart'),
            ),
          ],
        ),
      ),
    );
  }
}
