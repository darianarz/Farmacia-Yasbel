import 'package:api_corte/widgets/user_provider.dart';
import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'package:api_corte/widgets/registro_page.dart';
import 'package:api_corte/widgets/login_page.dart';
import 'package:api_corte/carrito/carrito_model.dart';
import 'package:api_corte/widgets/welcome_page.dart';
import 'package:api_corte/home_page.dart';

void main() {
  runApp(
    MultiProvider(
      providers: [
        ChangeNotifierProvider(create: (context) => CarritoModel()),
        ChangeNotifierProvider(create: (context) => UserProvider()),
      ],
      child: MaterialApp(
        title: 'Mi Tienda Virtual',
        debugShowCheckedModeBanner: false,
        theme: ThemeData(
          primarySwatch: Colors.blue,
        ),
        initialRoute: '/welcome',
        routes: {
          '/welcome': (context) => WelcomePage(),
          '/login': (context) => LoginPage(),
          '/registro': (context) => RegistroPage(),
          '/home': (context) => HomePage(token: ''), 
        },
      ),
    ),
  );
}
