import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'package:api_corte/models/product.dart';
import 'package:api_corte/widgets/detalle_producto.dart';
import 'package:api_corte/carrito/carrito_model.dart';
import 'package:api_corte/widgets/user_provider.dart';

class DatosPage extends StatefulWidget {
  final List<Product> products;

  DatosPage({required this.products});

  @override
  _DatosPageState createState() => _DatosPageState();
}

class _DatosPageState extends State<DatosPage> {
  late List<Product> _products;
  bool _isLoading = false;
  final TextEditingController _searchController = TextEditingController();

  @override
  void initState() {
    super.initState();
    _products = widget.products;
  }

  void _searchProducts(String query) {
    setState(() {
      _products = widget.products.where((product) {
        final name = product.name.toLowerCase();
        final search = query.toLowerCase();
        return name.contains(search);
      }).toList();
    });
  }

  @override
  Widget build(BuildContext context) {
    final userProvider = Provider.of<UserProvider>(context);
    final carrito = Provider.of<CarritoModel>(context);

    return Scaffold(
      appBar: AppBar(
        title: Text('Products'),
        actions: [
          Stack(
            alignment: Alignment.center,
            children: [
              IconButton(
                icon: Icon(Icons.shopping_cart, color: Colors.black),
                onPressed: () {
                  Navigator.pushNamed(context, '/cart');
                },
              ),
              if (carrito.carrito.isNotEmpty)
                Positioned(
                  right: 0,
                  top: 8,
                  child: Text(
                    '${carrito.carrito.length}',
                    style: TextStyle(
                      fontSize: 16,
                      color: Colors.black,
                      fontWeight: FontWeight.bold,
                    ),
                  ),
                ),
            ],
          ),
          PopupMenuButton<String>(
            onSelected: (value) {
              if (value == 'logout') {
                userProvider.logout();
                Navigator.pushNamedAndRemoveUntil(context, '/login', (route) => false);
              } else if (value == 'profile') {
                // Navegar al perfil de usuario o detalles de la sesión
              }
            },
            itemBuilder: (context) => [
              PopupMenuItem(
                value: 'profile',
                child: Text(userProvider.username ?? 'Profile'),
              ),
              PopupMenuItem(
                value: 'logout',
                child: Text('Logout'),
              ),
            ],
          ),
        ],
        bottom: PreferredSize(
          preferredSize: Size.fromHeight(60.0),
          child: Padding(
            padding: const EdgeInsets.all(8.0),
            child: TextField(
              controller: _searchController,
              onChanged: _searchProducts,
              decoration: InputDecoration(
                hintText: 'Search...',
                prefixIcon: Icon(Icons.search),
                border: OutlineInputBorder(
                  borderRadius: BorderRadius.circular(10.0),
                ),
              ),
            ),
          ),
        ),
      ),
      body: _isLoading
          ? Center(child: CircularProgressIndicator())
          : GridView.builder(
              gridDelegate: SliverGridDelegateWithFixedCrossAxisCount(
                crossAxisCount: 2,
                crossAxisSpacing: 10.0,
                mainAxisSpacing: 10.0,
              ),
              itemCount: _products.length,
              itemBuilder: (context, index) {
                final product = _products[index];
                return Card(
                  elevation: 5.0,
                  child: Column(
                    crossAxisAlignment: CrossAxisAlignment.start,
                    children: [
                      // Expanded(
                      //   child: Image.network(
                      //     'https://localhost:3000/Imagenes/${product.categoryId}/${product.photo}',
                      //     fit: BoxFit.cover,
                      //     width: double.infinity,
                      //     errorBuilder: (context, error, stackTrace) {
                      //       return Center(child: Icon(Icons.error, color: Colors.red));
                      //     },
                      //   ),
                      // ),
                      Padding(
                        padding: const EdgeInsets.all(8.0),
                        child: Text(
                          product.name,
                          style: TextStyle(fontWeight: FontWeight.bold),
                        ),
                      ),
                      Padding(
                        padding: const EdgeInsets.symmetric(horizontal: 8.0),
                        child: Text(
                          'Precio: \$${product.price}',
                          style: TextStyle(color: Colors.green),
                        ),
                      ),
                      Padding(
                        padding: const EdgeInsets.all(8.0),
                        child: Row(
                          mainAxisAlignment: MainAxisAlignment.spaceBetween,
                          children: [
                            IconButton(
                              icon: Icon(Icons.add_shopping_cart),
                              onPressed: () {
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
                            ),
                            IconButton(
                              icon: Icon(Icons.info_outline),
                              onPressed: () {
                                Navigator.push(
                                  context,
                                  MaterialPageRoute(
                                    builder: (context) => DetalleProducto(product: product),
                                  ),
                                );
                              },
                            ),
                          ],
                        ),
                      ),
                    ],
                  ),
                );
              },
            ),
    );
  }
}
