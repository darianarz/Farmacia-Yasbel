import 'dart:convert';

List<Product> productFromJson(String str) => List<Product>.from(json.decode(str).map((x) => Product.fromJson(x)));

String productToJson(List<Product> data) => json.encode(List<dynamic>.from(data.map((x) => x.toJson())));

class Product {
  int id;
  int supplierId;
  double price;
  double? discount; // Assuming discount can be null
  String brand;
  String name;
  String photo;
  String description;
  DateTime expirationDate;
  int stock;
  int categoryId;
  DateTime createdAt;
  DateTime updatedAt;

  Product({
    required this.id,
    required this.supplierId,
    required this.price,
    this.discount,
    required this.brand,
    required this.name,
    required this.photo,
    required this.description,
    required this.expirationDate,
    required this.stock,
    required this.categoryId,
    required this.createdAt,
    required this.updatedAt,
  });

  factory Product.fromJson(Map<String, dynamic> json) => Product(
    id: json["id"],
    supplierId: json["supplier_id"],
    price: json["price"].toDouble(),
    discount: json["discount"]?.toDouble(),
    brand: json["brand"],
    name: json["name"],
    photo: json["photo"],
    description: json["description"],
    expirationDate: DateTime.parse(json["expiration_date"]),
    stock: json["stock"],
    categoryId: json["category_id"],
    createdAt: DateTime.parse(json["created_at"]),
    updatedAt: DateTime.parse(json["updated_at"]),
  );

  Map<String, dynamic> toJson() => {
    "id": id,
    "supplier_id": supplierId,
    "price": price,
    "discount": discount,
    "brand": brand,
    "name": name,
    "photo": photo,
    "description": description,
    "expiration_date": expirationDate.toIso8601String(),
    "stock": stock,
    "category_id": categoryId,
    "created_at": createdAt.toIso8601String(),
    "updated_at": updatedAt.toIso8601String(),
  };

  @override
  bool operator ==(Object other) =>
      identical(this, other) ||
      other is Product &&
          runtimeType == other.runtimeType &&
          id == other.id &&
          supplierId == other.supplierId &&
          price == other.price &&
          discount == other.discount &&
          brand == other.brand &&
          name == other.name &&
          photo == other.photo &&
          description == other.description &&
          expirationDate == other.expirationDate &&
          stock == other.stock &&
          categoryId == other.categoryId &&
          createdAt == other.createdAt &&
          updatedAt == other.updatedAt;

  @override
  int get hashCode =>
      id.hashCode ^
      supplierId.hashCode ^
      price.hashCode ^
      discount.hashCode ^
      brand.hashCode ^
      name.hashCode ^
      photo.hashCode ^
      description.hashCode ^
      expirationDate.hashCode ^
      stock.hashCode ^
      categoryId.hashCode ^
      createdAt.hashCode ^
      updatedAt.hashCode;
}
