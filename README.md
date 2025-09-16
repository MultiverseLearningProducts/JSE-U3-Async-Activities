# Unit 3 Work - 3-2 Solution

## Overview
This project demonstrates the fundamental concept of classes as blueprints and object creation in Java.

## Task: Blueprint for a Product
**Objective**: Learn to define a class as a blueprint and create multiple, distinct objects from it.

### Implementation
- **Product.java**: A class blueprint with three public fields (name, price, sku)
- **Store.java**: Main class that creates and uses Product objects

### Key Learning Concepts

#### 1. Classes as Blueprints
- A class defines the structure and attributes of objects
- It's like a template or blueprint for creating objects
- All objects created from the same class share the same structure

#### 2. Object Creation
- Objects are instances of a class
- Each object is independent and has its own data
- Objects are created using the `new` keyword

#### 3. Public Fields
- Fields can be declared as `public` for direct access
- Accessed using dot notation: `object.fieldName`
- Each object has its own copy of the fields

#### 4. Object Independence
- Changing one object doesn't affect other objects
- Each object maintains its own state
- Objects can have different values for the same fields

## Project Structure
```
unit-3-work/
├── src/
│   └── main/
│       └── java/
│           ├── Product.java      # Class blueprint with public fields
│           └── Store.java        # Main class demonstrating object creation
└── README.md
```

## How to Run
```bash
# Compile the classes
javac src/main/java/*.java

# Run the Store application
java -cp src/main/java Store
```

## Expected Output
```
=== Store Product Management ===
Demonstrating classes as blueprints and object creation

--- Product 1 ---
Name: Gaming Laptop
Price: $1299.99
SKU: LAP-001

--- Product 2 ---
Name: Wireless Mouse
Price: $29.99
SKU: MOU-002

--- Object Independence Demo ---
Both products are separate objects:
Laptop object: Product@[memory_address]
Mouse object: Product@[memory_address]
They have different memory locations and data!

--- Modifying Objects Independently ---
Laptop price after discount: $1199.99
Mouse price remains unchanged: $29.99

=== Key Learning Points ===
1. Classes are blueprints for creating objects
2. Objects are instances of a class
3. Each object has its own copy of the fields
4. Objects are independent - changing one doesn't affect others
5. Public fields can be accessed directly with dot notation
```

## Learning Objectives
- Understand the relationship between classes and objects
- Learn how to create multiple objects from the same class
- Practice accessing and modifying object fields
- Understand object independence and state management
- Learn the difference between classes (blueprints) and objects (instances)

---

*This project is designed for educational purposes and follows Java best practices for beginners.*
