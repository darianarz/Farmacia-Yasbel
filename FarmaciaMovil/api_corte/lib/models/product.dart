// To parse this JSON data, do
//
//     final product = productFromJson(jsonString);

import 'dart:convert';

List<Product> productFromJson(String str) => List<Product>.from(json.decode(str).map((x) => Product.fromJson(x)));

String productToJson(List<Product> data) => json.encode(List<dynamic>.from(data.map((x) => x.toJson())));

class Product {
  int id;
  String nombre;
  int precio;
  String descripcion;
  DateTime createdAt;
  DateTime updatedAt;

  Product({
    required this.id,
    required this.nombre,
    required this.precio,
    required this.descripcion,
    required this.createdAt,
    required this.updatedAt,
  });

  factory Product.fromJson(Map<String, dynamic> json) => Product(
    id: json["id"],
    nombre: json["nombre"],
    precio: json["precio"],
    descripcion: json["descripcion"],
    createdAt: DateTime.parse(json["created_at"]),
    updatedAt: DateTime.parse(json["updated_at"]),
  );

  Map<String, dynamic> toJson() => {
    "id": id,
    "nombre": nombre,
    "precio": precio,
    "descripcion": descripcion,
    "created_at": createdAt.toIso8601String(),
    "updated_at": updatedAt.toIso8601String(),
  };

  @override
  bool operator ==(Object other) =>
      identical(this, other) ||
      other is Product &&
          runtimeType == other.runtimeType &&
          id == other.id &&
          nombre == other.nombre &&
          precio == other.precio &&
          descripcion == other.descripcion &&
          createdAt == other.createdAt &&
          updatedAt == other.updatedAt;

  @override
  int get hashCode =>
      id.hashCode ^
      nombre.hashCode ^
      precio.hashCode ^
      descripcion.hashCode ^
      createdAt.hashCode ^
      updatedAt.hashCode;
}


/*import 'dart:convert';

List<Product> productFromJson(String str) => List<Product>.from(json.decode(str).map((x) => Product.fromJson(x)));

String productToJson(List<Product> data) => json.encode(List<dynamic>.from(data.map((x) => x.toJson())));

class Product {
    int id;
    String nombre;
    int precio;
    String descripcion;
    DateTime createdAt;
    DateTime updatedAt;

    Product({
        required this.id,
        required this.nombre,
        required this.precio,
        required this.descripcion,
        required this.createdAt,
        required this.updatedAt,
    });

    factory Product.fromJson(Map<String, dynamic> json) => Product(
        id: json["id"],
        nombre: json["nombre"],
        precio: json["precio"],
        descripcion: json["descripcion"],
        createdAt: DateTime.parse(json["created_at"]),
        updatedAt: DateTime.parse(json["updated_at"]),
    );

    Map<String, dynamic> toJson() => {
        "id": id,
        "nombre": nombre,
        "precio": precio,
        "descripcion": descripcion,
        "created_at": createdAt.toIso8601String(),
        "updated_at": updatedAt.toIso8601String(),
    };
}*/
