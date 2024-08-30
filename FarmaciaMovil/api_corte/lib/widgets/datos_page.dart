import 'package:api_corte/carrito/carrito_page.dart';
import 'package:api_corte/widgets/user_provider.dart';
import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'package:api_corte/carrito/carrito_model.dart';
import 'package:api_corte/models/product.dart';
import 'package:api_corte/widgets/product_page.dart';


class DatosPage extends StatelessWidget {
  final List<Product> products;

  const DatosPage({Key? key, required this.products}) : super(key: key);

  void _showLogoutModal(BuildContext context) {
    final userProvider = Provider.of<UserProvider>(context, listen: false);

    showDialog(
      context: context,
      builder: (BuildContext context) {
        return AlertDialog(
          title: Text('Cerrar Sesión'),
          content: Column(
            mainAxisSize: MainAxisSize.min,
            crossAxisAlignment: CrossAxisAlignment.start,
            children: <Widget>[
              Text('Usuario: ${userProvider.username ?? 'No logueado'}'),
            ],
          ),
          actions: <Widget>[
            TextButton(
              onPressed: () {
                Navigator.of(context).pop(); // Cierra el modal
              },
              child: Text('Cancelar'),
            ),
            TextButton(
              onPressed: () {
                userProvider.logout(); // Llama al método logout
                Navigator.of(context).pushNamedAndRemoveUntil('/login', (route) => false);
              },
              child: Text('Cerrar Sesión'),
            ),
          ],
        );
      },
    );
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Productos'),
        actions: [
          IconButton(
            icon: Icon(Icons.shopping_cart),
            onPressed: () {
              Navigator.push(
                context,
                MaterialPageRoute(
                  builder: (context) => CarritoPage(),
                ),
              );
            },
          ),
          IconButton(
            icon: Icon(Icons.person),
            onPressed: () {
              _showLogoutModal(context);
            },
          ),
        ],
      ),
      body: ListView.builder(
        itemCount: products.length,
        itemBuilder: (context, index) {
          final product = products[index];
          return Card(
            margin: EdgeInsets.all(10),
            child: Padding(
              padding: const EdgeInsets.all(15.0),
              child: Column(
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  Text(
                    product.nombre,
                    style: TextStyle(fontSize: 18, fontWeight: FontWeight.bold),
                  ),
                  SizedBox(height: 10),
                  Text(
                    'Precio: \$${product.precio}',
                    style: TextStyle(fontSize: 16, color: Colors.blue[900]),
                  ),
                  SizedBox(height: 10),
                  Text(
                    product.descripcion,
                    style: TextStyle(fontSize: 14, color: Colors.grey[600]),
                  ),
                  SizedBox(height: 10),
                  Row(
                    mainAxisAlignment: MainAxisAlignment.end,
                    children: [
                      TextButton(
                        onPressed: () {
                          Navigator.push(
                            context,
                            MaterialPageRoute(
                              builder: (context) => ProductPage(product: product),
                            ),
                          );
                        },
                        child: Text('Más especificaciones'),
                      ),
                      ElevatedButton(
                        onPressed: () {
                          Provider.of<CarritoModel>(context, listen: false).addProduct(product);
                          ScaffoldMessenger.of(context).showSnackBar(
                            SnackBar(
                              content: Text('${product.nombre} añadido al carrito'),
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
                        style: ElevatedButton.styleFrom(
                          primary: Colors.green[500],
                          padding: EdgeInsets.symmetric(horizontal: 16),
                        ),
                        child: Text('Agregar al carrito'),
                      ),
                    ],
                  ),
                ],
              ),
            ),
          );
        },
      ),
    );
  }
}
