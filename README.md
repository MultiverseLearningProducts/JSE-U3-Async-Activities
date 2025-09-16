# Unit 3 Work - 3-3 Solution

## Overview
This project demonstrates encapsulation with private fields and public getter/setter methods in Java.

## Task: Encapsulation with Getters and Setters
**Objective**: Implement encapsulation by making fields private and providing public methods for controlled data access.

### Implementation
- **Product.java**: Class with private fields and public getter/setter methods
- **Store.java**: Main class demonstrating controlled data access through methods

### Key Learning Concepts

#### 1. Encapsulation
- **Private Fields**: Data is hidden and protected from direct access
- **Public Methods**: Controlled access through getter and setter methods
- **Data Protection**: Prevents unauthorized modification of object state

#### 2. Getter Methods
- **Purpose**: Provide read access to private fields
- **Naming**: `getFieldName()` convention
- **Return Type**: Same as the field type
- **Example**: `public String getName() { return name; }`

#### 3. Setter Methods
- **Purpose**: Provide controlled write access to private fields
- **Naming**: `setFieldName()` convention
- **Parameters**: Same type as the field
- **Example**: `public void setPrice(double price) { this.price = price; }`

#### 4. Benefits of Encapsulation
- **Data Validation**: Setters can validate data before setting
- **Flexibility**: Internal implementation can change without affecting users
- **Security**: Prevents direct access to sensitive data
- **Maintainability**: Clear interface for object interaction

### Project Structure
```
unit-3-work/
├── src/
│   └── main/
│       └── java/
│           ├── Product.java      # Encapsulated class with private fields and public methods
│           └── Store.java        # Main class demonstrating controlled data access
└── README.md
```

### How to Run
```bash
# Compile the classes
javac src/main/java/*.java

# Run the Store application
java -cp src/main/java Store
```

### Expected Output
```
=== Store Product Management with Encapsulation ===
Demonstrating private fields and public getter/setter methods

--- Product 1 (Using Individual Getters) ---
Name: Gaming Laptop
Price: $1299.99
SKU: LAP-001

--- Product 2 (Using Utility Method) ---
Product: Wireless Mouse, Price: $29.99, SKU: MOU-002

--- Modifying Objects Through Setters ---
Original laptop price: $1299.99
New laptop price: $1199.99
Mouse price remains unchanged: $29.99

--- Using Utility Method for Bulk Updates ---
New product created: Product: Mechanical Keyboard, Price: $89.99, SKU: KEY-003

--- Object Independence with Encapsulation ---
All products are separate objects with their own data:
Laptop: Product: Gaming Laptop, Price: $1199.99, SKU: LAP-001
Mouse: Product: Wireless Mouse, Price: $29.99, SKU: MOU-002
Keyboard: Product: Mechanical Keyboard, Price: $89.99, SKU: KEY-003

=== Benefits of Encapsulation ===
1. Data Protection: Fields are private and can't be accessed directly
2. Controlled Access: Only through public getter/setter methods
3. Data Validation: Setters can validate data before setting
4. Flexibility: Internal implementation can change without affecting users
5. Better Design: Clear interface for interacting with objects
```

### Key Differences from 3-2-Solution

#### Before (3-2-Solution)
```java
// Direct field access
laptop.name = "Gaming Laptop";
laptop.price = 1299.99;
System.out.println(laptop.name);
```

#### After (3-3-Solution)
```java
// Controlled access through methods
laptop.setName("Gaming Laptop");
laptop.setPrice(1299.99);
System.out.println(laptop.getName());
```

### Learning Objectives
- Understand the concept of encapsulation
- Learn how to create private fields and public methods
- Practice using getter and setter methods
- Understand the benefits of controlled data access
- Learn proper method naming conventions
- Understand the `this` keyword usage

### Advanced Concepts Demonstrated
- **Utility Methods**: `setProductInfo()` and `getProductInfo()`
- **Method Overloading**: Multiple ways to set data
- **Data Validation**: Potential for validation in setters
- **Interface Design**: Clear public API for object interaction

---

*This project is designed for educational purposes and follows Java best practices for encapsulation.*
