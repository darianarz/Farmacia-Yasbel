import 'dart:convert';
import 'package:flutter/material.dart';
import 'package:http/http.dart' as http;

class UserProvider with ChangeNotifier {
  String? _username;
  String? _token;
  String? _errorMessage;

  String? get username => _username;
  String? get token => _token;
  String? get errorMessage => _errorMessage;

  Future<void> register(
    String username,
    String firstName,
    String lastName,
    String email,
    String password,
    String phone,
    String address,
    String passwordConfirmation,
  ) async {
    final url = Uri.parse('https://6685-179-19-166-152.ngrok-free/users'); // Reemplaza con tu endpoint correcto

    try {
      final response = await http.post(
        url,
        headers: {'Content-Type': 'application/json'},
        body: json.encode({
          'user': {
            'username': username,
            'first_name': firstName,
            'last_name': lastName,
            'email': email,
            'password': password,
            'phone': phone,
            'address': address,
            'password_confirmation': passwordConfirmation,
          }
        }),
      );

      if (response.statusCode == 201) {
        final responseData = json.decode(response.body);
        _username = responseData['username'];
        _token = responseData['token'];
        _errorMessage = null;
      } else {
        final errorData = json.decode(response.body);
        _errorMessage = errorData['message'] ?? 'Error al registrar el usuario';
      }
    } catch (e) {
      _errorMessage = 'Error de red. Por favor, intenta nuevamente.';
    }

    notifyListeners();
  }

  Future<void> login(String username, String password) async {
    final url = Uri.parse('https://6685-179-19-166-152.ngrok-free/login');
    try {
      final response = await http.post(
        url,
        headers: {'Content-Type': 'application/json'},
        body: json.encode({
          'user': {
            'username': username,
            'password': password,
          }
        }),
      );

      if (response.statusCode == 200) {
        final responseData = json.decode(response.body);
        _username = responseData['username'];
        _token = responseData['token'];
        _errorMessage = null;
      } else {
        final errorData = json.decode(response.body);
        _errorMessage = errorData['message'] ?? 'Error en las credenciales';
      }
    } catch (e) {
      _errorMessage = 'Error de red. Por favor, intenta nuevamente.';
    }

    notifyListeners();
  }

  void logout() {
    _username = null;
    _token = null;
    _errorMessage = null;
    notifyListeners();
  }
}
