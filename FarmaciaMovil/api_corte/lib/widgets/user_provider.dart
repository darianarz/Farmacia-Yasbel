import 'package:flutter/material.dart';
import 'package:http/http.dart' as http;
import 'dart:convert';

class UserProvider with ChangeNotifier {
  String? _username;
  String? _token;

  String? get username => _username;

  Future<void> login(String username, String password) async {
    final response = await http.post(
      Uri.parse('http://localhost:3000/login'), // Cambia la URL según tu configuración
      headers: {'Content-Type': 'application/json'},
      body: jsonEncode({'username': username, 'password': password}),
    );

    if (response.statusCode == 200) {
      final data = jsonDecode(response.body);
      _token = data['token']; // Asegúrate de que la respuesta contiene el token
      await fetchUserInfo();
    } else {
      throw Exception('Failed to login');
    }
  }

  Future<void> fetchUserInfo() async {
    if (_token == null) return;

    final response = await http.get(
      Uri.parse('http://localhost:3000/user'),
      headers: {'Authorization': 'Bearer $_token'},
    );

    if (response.statusCode == 200) {
      final data = jsonDecode(response.body);
      _username = data['username'];
      notifyListeners();
    } else {
      throw Exception('Failed to load user info');
    }
  }

  Future<void> logout() async {
    if (_token == null) return;

    final response = await http.delete(
      Uri.parse('http://localhost:3000/logout'),
      headers: {'Authorization': 'Bearer $_token'},
    );

    if (response.statusCode == 200) {
      _username = null;
      _token = null;
      notifyListeners();
    } else {
      throw Exception('Failed to logout');
    }
  }

  void setToken(String token) {
    _token = token;
    notifyListeners();
  }
}
