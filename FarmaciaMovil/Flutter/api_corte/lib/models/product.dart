class Product {
  final int supplierId;
  final double price;
  final double discount;
  final String brand;
  final String name;
  final String photo;
  final String description;
  final String expirationDate;
  final int stock;
  final int categoryId;

  Product({
    required this.supplierId,
    required this.price,
    required this.discount,
    required this.brand,
    required this.name,
    required this.photo,
    required this.description,
    required this.expirationDate,
    required this.stock,
    required this.categoryId,
  });

  factory Product.fromJson(Map<String, dynamic> json) {
    return Product(
      supplierId: json['supplier_id'],
      price: (json['price'] is String) ? double.parse(json['price']) : json['price'].toDouble(),
      discount: (json['discount'] is String) ? double.parse(json['discount']) : json['discount'].toDouble(),
      brand: json['brand'],
      name: json['name'],
      photo: json['photo'],
      description: json['description'],
      expirationDate: json['expiration_date'],
      stock: json['stock'],
      categoryId: json['category_id'],
    );
  }
}
