// carrito_page.dart
import 'package:api_corte/carrito/carrito_model.dart';
import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'package:api_corte/widgets/product_page.dart';

class CarritoPage extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    final carrito = Provider.of<CarritoModel>(context);

    return Scaffold(
      appBar: AppBar(title: Text('Carrito de Compras')),
      body: carrito.isEmpty()
          ? Center(
              child: Text('El carrito está vacío'),
            )
          : ListView.builder(
              itemCount: carrito.carrito.length,
              itemBuilder: (context, index) {
                final product = carrito.carrito.keys.elementAt(index);
                final quantity = carrito.carrito[product]!;
                return Card(
                  margin: EdgeInsets.symmetric(vertical: 10, horizontal: 20),
                  child: ListTile(
                    onTap: () {
                      Navigator.push(
                        context,
                        MaterialPageRoute(
                          builder: (context) => ProductPage(product: product),
                        ),
                      );
                    },
                    title: Text(
                      product.nombre,
                      style: TextStyle(fontSize: 18, fontWeight: FontWeight.bold),
                    ),
                    subtitle: Column(
                      crossAxisAlignment: CrossAxisAlignment.start,
                      children: [
                        Text(
                          'Precio: \$${product.precio}',
                          style: TextStyle(fontSize: 16, color: Colors.blue[900]),
                        ),
                        SizedBox(height: 10),
                        Text(
                          'Descripción: ${product.descripcion}',
                          style: TextStyle(fontSize: 14, color: Colors.grey[600]),
                        ),
                      ],
                    ),
                    trailing: Row(
                      mainAxisSize: MainAxisSize.min,
                      children: [
                        IconButton(
                          icon: Icon(Icons.remove, color: Colors.red),
                          onPressed: () {
                            carrito.decrementProduct(product, context);
                          },
                        ),
                        Text('$quantity', style: TextStyle(fontSize: 16)),
                        IconButton(
                          icon: Icon(Icons.add, color: Colors.green),
                          onPressed: () {
                            carrito.incrementProduct(product);
                          },
                        ),
                        IconButton(
                          icon: Icon(Icons.delete, color: Colors.red),
                          onPressed: () {
                            Provider.of<CarritoModel>(context, listen: false).removeProduct(product);
                            ScaffoldMessenger.of(context).showSnackBar(
                              SnackBar(
                                content: Text('${product.nombre} se ha eliminado del carrito'),
                                duration: Duration(seconds: 2),
                                backgroundColor: Colors.red,
                                behavior: SnackBarBehavior.floating,
                                shape: RoundedRectangleBorder(
                                  borderRadius: BorderRadius.circular(30),
                                ),
                                margin: EdgeInsets.symmetric(horizontal: 20, vertical: 10),
                              ),
                            );
                          },
                        ),
                      ],
                    ),
                  ),
                );
              },
            ),
      bottomNavigationBar: carrito.isEmpty()
          ? null
          : Container(
              padding: EdgeInsets.all(10),
              color: Colors.grey[200],
              child: Row(
                mainAxisAlignment: MainAxisAlignment.spaceBetween,
                children: [
                  Text(
                    'Total: \$${carrito.getTotal().toStringAsFixed(2)}',
                    style: TextStyle(fontSize: 18, fontWeight: FontWeight.bold),
                  ),
                  ElevatedButton(
                    onPressed: () {
                      // Aquí podrías implementar la lógica para realizar la compra.
                    },
                    child: Text('Comprar'),
                  ),
                ],
              ),
            ),
    );
  }
}




/*import 'package:flutter/material.dart';
import 'package:api_corte/models/product.dart';

class CarritoPage extends StatefulWidget {
  final List<Product> initialProducts;
  const CarritoPage({Key? key, required this.initialProducts}) : super(key: key);

  @override
  _CarritoPageState createState() => _CarritoPageState();
}

class _CarritoPageState extends State<CarritoPage> {
  List<Product> products = []; // Lista de productos en el carrito
  double total = 0; // Total inicial del carrito

  @override
  void initState() {
    super.initState();
    // Copia los productos iniciales a la lista del estado local
    products.addAll(widget.initialProducts);
    _calculateTotal();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text('Carrito de Compras')),
      body: products.isEmpty
          ? Center(
              child: Text('El carrito está vacío'),
            )
          : ListView.builder(
              itemCount: products.length,
              itemBuilder: (context, index) {
                final product = products[index];
                return Card(
                  margin: EdgeInsets.symmetric(vertical: 10, horizontal: 20),
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
                          'Descripción: ${product.descripcion}',
                          style: TextStyle(fontSize: 14, color: Colors.grey[600]),
                        ),
                        SizedBox(height: 10),
                        Row(
                          mainAxisAlignment: MainAxisAlignment.end,
                          children: [
                            IconButton(
                              icon: Icon(Icons.delete, color: Colors.red),
                              onPressed: () {
                                setState(() {
                                  products.removeAt(index);
                                  _calculateTotal();
                                });
                              },
                            ),
                          ],
                        ),
                      ],
                    ),
                  ),
                );
              },
            ),
      bottomNavigationBar: products.isEmpty
          ? null
          : Container(
              padding: EdgeInsets.all(10),
              color: Colors.grey[200],
              child: Row(
                mainAxisAlignment: MainAxisAlignment.spaceBetween,
                children: [
                  Text(
                    'Total: \$${total.toStringAsFixed(2)}',
                    style: TextStyle(fontSize: 18, fontWeight: FontWeight.bold),
                  ),
                  ElevatedButton(
                    onPressed: () {
                      // Aquí podrías implementar la lógica para realizar la compra.
                    },
                    child: Text('Comprar'),
                  ),
                ],
              ),
            ),
    );
  }

  // Método para calcular el total del carrito
  void _calculateTotal() {
    double newTotal = 0;
    for (var product in products) {
      newTotal += product.precio;
    }
    setState(() {
      total = newTotal;
    });
  }
}*/
