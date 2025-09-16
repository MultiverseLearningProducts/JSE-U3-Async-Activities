# Unit 3 Work - 3-6 Solution

## Overview
This project demonstrates a flexible shopping cart that combines all OOP principles by creating a collection that can hold different but related object types and process them uniformly.

## Task: Building a Flexible Shopping Cart
**Objective**: Combine all the OOP principles by creating a collection that can hold different but related object types.

### Implementation
- **Product.java**: Parent class with displayInfo() method
- **DigitalProduct.java**: Child class that extends Product and overrides displayInfo()
- **Store.java**: Main class demonstrating flexible shopping cart with ArrayList and for-each loops

### Key Learning Concepts

#### 1. Collections with Polymorphism
- **ArrayList<Product>**: Collection declared to hold parent class references
- **Mixed Types**: Can hold both Product and DigitalProduct objects
- **Type Safety**: Compile-time checking ensures all items are Product objects
- **Uniform Processing**: Same code works for all object types

#### 2. For-Each Loops
- **Enhanced For Loop**: `for (Product item : shoppingCart)`
- **Automatic Iteration**: No need to manage indices manually
- **Polymorphic Calls**: Each item behaves according to its actual type
- **Clean Code**: Simple and readable iteration syntax

#### 3. Combined OOP Principles
- **Encapsulation**: Private fields with public methods
- **Inheritance**: DigitalProduct extends Product
- **Polymorphism**: Same method call, different behavior
- **Collections**: Managing multiple objects uniformly

#### 4. Real-World Applications
- **GUI Components**: Managing different UI elements
- **Database Records**: Processing various entity types
- **Game Objects**: Handling different game entities
- **File Processing**: Working with different file types

### Project Structure
```
unit-3-work/
├── src/
│   └── main/
│       └── java/
│           ├── Product.java          # Parent class with displayInfo() method
│           ├── DigitalProduct.java   # Child class that overrides displayInfo()
│           └── Store.java            # Main class with flexible shopping cart
└── README.md
```

### How to Run
```bash
# Compile all classes
javac src/main/java/*.java

# Run the Store application
java -cp src/main/java Store
```

### Expected Output
```
=== Flexible Shopping Cart with OOP Principles ===
Combining encapsulation, inheritance, and polymorphism in a practical application

=== Building the Shopping Cart ===
Adding various Product and DigitalProduct objects to the cart...

Shopping cart now contains 6 items

=== Processing the Shopping Cart ===
Using a for-each loop to process all items uniformly:

--- Shopping Cart Item 1 ---
=== Product Information ===
Name: Gaming Laptop
Price: $1299.99
SKU: LAP-001
Type: Standard Product

--- Shopping Cart Item 2 ---
=== Product Information ===
Name: Java Programming Guide
Price: $49.99
SKU: BOOK-001
Type: Standard Product

--- Shopping Cart Item 3 ---
=== Product Information ===
Name: Developer T-Shirt
Price: $24.99
SKU: SHIRT-001
Type: Standard Product

--- Shopping Cart Item 4 ---
=== Product Information ===
Name: E-Book: Advanced Java
Price: $29.99
SKU: EBOOK-001
Type: Standard Product
Download URL: https://store.example.com/download/ebook-001
Type: Digital Product
Description: This is a digital item that can be downloaded instantly

--- Shopping Cart Item 5 ---
=== Product Information ===
Name: Online Course: OOP Mastery
Price: $99.99
SKU: COURSE-001
Type: Standard Product
Download URL: https://learn.example.com/course-oop-mastery
Type: Digital Product
Description: This is a digital item that can be downloaded instantly

--- Shopping Cart Item 6 ---
=== Product Information ===
Name: IDE Software License
Price: $199.99
SKU: SOFT-001
Type: Standard Product
Download URL: https://download.example.com/ide-license
Type: Digital Product
Description: This is a digital item that can be downloaded instantly

=== Advanced Shopping Cart Operations ===
Total Cart Value: $1704.94

Cart Summary:
- Physical Products: 3
- Digital Products: 3
- Total Items: 6
```

### Key Differences from 3-5-Solution

#### Before (3-5-Solution)
```java
// Individual object references
Product standardProduct = new Product();
DigitalProduct digitalProduct = new DigitalProduct();
currentProduct = standardProduct;
currentProduct.displayInfo();
currentProduct = digitalProduct;
currentProduct.displayInfo();
```

#### After (3-6-Solution)
```java
// Collection-based approach
ArrayList<Product> shoppingCart = new ArrayList<>();
shoppingCart.add(laptop);
shoppingCart.add(ebook);
shoppingCart.add(course);

// Uniform processing with for-each loop
for (Product item : shoppingCart) {
    item.displayInfo(); // Polymorphism in action!
}
```

### Learning Objectives
- Understand how to use collections with polymorphic objects
- Learn to create flexible data structures that can hold related types
- Practice using for-each loops with collections
- Understand the power of combining OOP principles
- Learn real-world patterns for managing multiple object types
- Understand the benefits of uniform processing

### Advanced Concepts Demonstrated
- **Collections Framework**: Using ArrayList for dynamic storage
- **Polymorphic Collections**: Storing different types in the same collection
- **For-Each Loops**: Modern iteration syntax
- **Type Checking**: Using instanceof for type identification
- **Collection Operations**: Adding, removing, and processing items
- **Real-World Patterns**: Common software development techniques

### Real-World Applications
This pattern is used everywhere in software development:
- **GUI Components**: `List<Component>` for buttons, labels, panels
- **Database Records**: `List<Entity>` for users, orders, products
- **Game Objects**: `List<GameObject>` for players, enemies, items
- **File Processing**: `List<File>` for documents, images, videos
- **API Responses**: `List<Response>` for different data types

### Why This Pattern is Powerful
1. **Uniform Processing**: Same code works for all product types
2. **Easy to Extend**: Add new product types without changing existing code
3. **Type Safety**: ArrayList ensures all items are Product objects
4. **Polymorphic Behavior**: Each item behaves according to its actual type
5. **Collection Benefits**: Easy to add, remove, iterate, and search

---

*This project demonstrates the culmination of object-oriented programming principles in a practical, real-world application.*
