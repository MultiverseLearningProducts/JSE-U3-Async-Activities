# Unit 3 Work - 3-4 Solution

## Overview
This project demonstrates inheritance by creating a specialized subclass that inherits properties and behaviors from a parent class.

## Task: Inheritance with a Digital Product
**Objective**: Use inheritance to create a specialized subclass that inherits properties and behaviors from a parent class.

### Implementation
- **Product.java**: Parent class with displayInfo() method
- **DigitalProduct.java**: Child class that extends Product and overrides displayInfo()
- **Store.java**: Main class demonstrating inheritance benefits

### Key Learning Concepts

#### 1. Inheritance
- **Parent Class**: Product serves as the base class
- **Child Class**: DigitalProduct extends Product
- **Code Reuse**: Child classes inherit all parent functionality
- **Specialization**: Child classes can add their own features

#### 2. Method Overriding
- **@Override Annotation**: Indicates intentional method overriding
- **Same Signature**: Must have the same method signature as parent
- **Specialized Behavior**: Child class provides its own implementation
- **super Keyword**: Allows calling parent methods from child class

#### 3. Field Inheritance
- **Inherited Fields**: Child classes can access parent fields through methods
- **Additional Fields**: Child classes can have their own specialized fields
- **Encapsulation**: Private fields are accessed through getter/setter methods

#### 4. Benefits of Inheritance
- **Code Reuse**: Avoid duplicating code across classes
- **Consistency**: Shared interface across related classes
- **Maintainability**: Changes to parent affect all child classes
- **Extensibility**: Easy to add new specialized classes

### Project Structure
```
unit-3-work/
├── src/
│   └── main/
│       └── java/
│           ├── Product.java          # Parent class with displayInfo() method
│           ├── DigitalProduct.java   # Child class that extends Product
│           └── Store.java            # Main class demonstrating inheritance
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
=== Store Product Management with Inheritance ===
Demonstrating how child classes inherit from parent classes

=== Inheritance Demonstration ===
Both objects can use inherited methods from the Product class

--- Standard Product (Parent Class) ---
Using inherited methods:
Name: Gaming Laptop
Price: $1299.99
SKU: LAP-001
Product Info: Product: Gaming Laptop, Price: $1299.99, SKU: LAP-001

--- Digital Product (Child Class) ---
Using inherited methods from Product class:
Name: E-Book: Java Programming
Price: $29.99
SKU: EBOOK-001
Product Info: Product: E-Book: Java Programming, Price: $29.99, SKU: EBOOK-001

Using specialized methods from DigitalProduct class:
Download URL: https://store.example.com/download/ebook-001

=== Method Overriding Demonstration ===
Both classes have displayInfo() methods, but they behave differently:

--- Standard Product displayInfo() ---
=== Product Information ===
Name: Gaming Laptop
Price: $1299.99
SKU: LAP-001
Type: Standard Product

--- Digital Product displayInfo() ---
=== Product Information ===
Name: E-Book: Java Programming
Price: $29.99
SKU: EBOOK-001
Type: Standard Product
Download URL: https://store.example.com/download/ebook-001
Type: Digital Product
Description: This is a digital item that can be downloaded instantly
```

### Key Differences from 3-3-Solution

#### Before (3-3-Solution)
```java
// Only Product class with encapsulation
Product product = new Product();
product.setName("Laptop");
product.displayInfo(); // Only one implementation
```

#### After (3-4-Solution)
```java
// Inheritance with specialized child class
Product standardProduct = new Product();
DigitalProduct digitalProduct = new DigitalProduct();

// Both can use inherited methods
standardProduct.getName(); // Inherited method
digitalProduct.getName();  // Inherited method

// Child class has additional methods
digitalProduct.getDownloadUrl(); // Specialized method

// Method overriding
standardProduct.displayInfo(); // Product's version
digitalProduct.displayInfo();  // DigitalProduct's version
```

### Learning Objectives
- Understand the concept of inheritance and parent-child relationships
- Learn how to create child classes that extend parent classes
- Practice method overriding with @Override annotation
- Understand how child classes inherit parent functionality
- Learn to use the super keyword to call parent methods
- Understand the benefits of code reuse through inheritance

### Advanced Concepts Demonstrated
- **Method Overriding**: Child classes providing specialized implementations
- **Inheritance Hierarchy**: Parent-child class relationships
- **Code Reuse**: Avoiding duplication through inheritance
- **Specialization**: Adding new features to inherited classes
- **Consistency**: Shared interface across related classes

### Inheritance in Action
The key demonstration is that DigitalProduct inherits all the functionality of Product (getName, getPrice, getSku, setProductInfo, etc.) while adding its own specialized features (downloadUrl, getDownloadUrl, setDownloadUrl) and overriding the displayInfo() method to provide specialized behavior.

---

*This project is designed for educational purposes and demonstrates fundamental object-oriented programming concepts.*
