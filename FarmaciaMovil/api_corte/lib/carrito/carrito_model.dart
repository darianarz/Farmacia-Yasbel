// carrito_model.dart
import 'package:flutter/material.dart';
import 'package:api_corte/models/product.dart';

class CarritoModel extends ChangeNotifier {
  final Map<Product, int> _carrito = {};

  Map<Product, int> get carrito => _carrito;

  void addProduct(Product product) {
    if (_carrito.containsKey(product)) {
      _carrito[product] = _carrito[product]! + 1;
    } else {
      _carrito[product] = 1;
    }
    notifyListeners();
  }

  void removeProduct(Product product) {
    _carrito.remove(product);
    notifyListeners();
  }

  void incrementProduct(Product product) {
    _carrito[product] = _carrito[product]! + 1;
    notifyListeners();
  }

  void decrementProduct(Product product, BuildContext context) {
    if (_carrito[product] == 1) {
      _carrito.remove(product);
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
    } else {
      _carrito[product] = _carrito[product]! - 1;
    }
    notifyListeners();
  }

  double getTotal() {
    double total = 0;
    _carrito.forEach((product, quantity) {
      total += product.precio * quantity;
    });
    return total;
  }

  bool isEmpty() {
    return _carrito.isEmpty;
  }

  void clearCart() {
    _carrito.clear();
    notifyListeners();
  }
}

