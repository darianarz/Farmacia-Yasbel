import 'dart:convert';
import 'package:api_corte/models/product.dart';
import 'package:http/http.dart' as http;
import 'package:api_corte/widgets/carga_page.dart';
import 'package:api_corte/widgets/datos_page.dart';
import 'package:api_corte/widgets/error_page.dart';
import 'package:flutter/material.dart';

class HomePage extends StatelessWidget {
  final String token;

  const HomePage({Key? key, required this.token}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: FutureBuilder<List<Product>>(
        builder: (context, snapshot) {
          if (snapshot.connectionState == ConnectionState.done) {
            if (snapshot.hasError) {
              return const ErrorPage();
            } else if (snapshot.hasData) {
              return DatosPage(products: snapshot.data!);
            }
          }
          return const CargaPage();
        },
        future: getData(token),
      ),
    );
  }

    Future<List<Product>> getData(String token) async {
      final url = Uri.https('75ab-179-19-183-211.ngrok-free.app', '/products');
      final response = await http.get(
        url,
        headers: {
          'Authorization': 'Bearer $token',
        },
      );

      if (response.statusCode == 200) {
        final List jsonData = jsonDecode(response.body);
        return jsonData.map((item) => Product.fromJson(item)).toList();
      } else {
        throw 'Error en la petición: ${response.statusCode}';
      }
  }
}

