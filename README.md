# Unit 3 Work - 3-5 Solution

## Overview
This project demonstrates polymorphism in action by using parent class references to hold child class objects and observing how Java calls the correct method at runtime.

## Task: Polymorphism in Action
**Objective**: Observe polymorphism by using a parent class reference to hold a child class object and see how Java calls the correct method at runtime.

### Implementation
- **Product.java**: Parent class with displayInfo() method
- **DigitalProduct.java**: Child class that extends Product and overrides displayInfo()
- **Store.java**: Main class demonstrating polymorphism with parent references

### Key Learning Concepts

#### 1. Polymorphism
- **Runtime Binding**: Java determines which method to call at runtime
- **Parent References**: Can hold child class objects
- **Same Interface**: Different objects respond to the same method call
- **Dynamic Dispatch**: Method resolution based on actual object type

#### 2. Method Overriding
- **@Override Annotation**: Indicates intentional method overriding
- **Same Signature**: Must have the same method signature as parent
- **Specialized Behavior**: Child class provides its own implementation
- **Polymorphic Calls**: Same method call produces different results

#### 3. Reference vs Object Types
- **Reference Type**: Determines what methods are available
- **Object Type**: Determines which version of the method is called
- **Runtime Decision**: Java chooses the correct method at runtime
- **Type Safety**: Compile-time checking vs runtime behavior

#### 4. Benefits of Polymorphism
- **Code Reusability**: Same code works with different object types
- **Flexibility**: Easy to add new types without changing existing code
- **Maintainability**: Changes to one class don't affect others
- **Extensibility**: New functionality through inheritance

### Project Structure
```
unit-3-work/
├── src/
│   └── main/
│       └── java/
│           ├── Product.java          # Parent class with displayInfo() method
│           ├── DigitalProduct.java   # Child class that overrides displayInfo()
│           └── Store.java            # Main class demonstrating polymorphism
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
=== Store Product Management with Polymorphism ===
Demonstrating how the same method call produces different output
depending on the actual type of the object

=== Polymorphism Demonstration ===
Using the same variable 'currentProduct' to reference different objects

--- Step 1: Assigning Standard Product ---
currentProduct now references a Standard Product object
Calling currentProduct.displayInfo():
=== Product Information ===
Name: Gaming Laptop
Price: $1299.99
SKU: LAP-001
Type: Standard Product

--- Step 2: Assigning Digital Product ---
currentProduct now references a Digital Product object
Calling currentProduct.displayInfo() again:
=== Product Information ===
Name: E-Book: Java Programming
Price: $29.99
SKU: EBOOK-001
Type: Standard Product
Download URL: https://store.example.com/download/ebook-001
Type: Digital Product
Description: This is a digital item that can be downloaded instantly

=== The Magic of Polymorphism ===
Notice that we used the EXACT same line of code:
    currentProduct.displayInfo();

But it produced completely different output!
This is because Java determines at RUNTIME which method to call
based on the ACTUAL type of the object, not the reference type.
```

### Key Differences from 3-4-Solution

#### Before (3-4-Solution)
```java
// Direct object references
Product standardProduct = new Product();
DigitalProduct digitalProduct = new DigitalProduct();
standardProduct.displayInfo(); // Product's version
digitalProduct.displayInfo();  // DigitalProduct's version
```

#### After (3-5-Solution)
```java
// Polymorphism with parent references
Product currentProduct;
currentProduct = new Product();
currentProduct.displayInfo(); // Calls Product's displayInfo()

currentProduct = new DigitalProduct();
currentProduct.displayInfo(); // Calls DigitalProduct's displayInfo()!
```

### Learning Objectives
- Understand the concept of polymorphism and runtime method resolution
- Learn how parent references can hold child objects
- Practice observing different behavior from the same method call
- Understand the difference between reference type and actual object type
- Learn how polymorphism enables flexible and extensible code
- Understand the benefits of polymorphic design

### Advanced Concepts Demonstrated
- **Runtime Polymorphism**: Dynamic method resolution
- **Method Overriding**: Child classes providing specialized implementations
- **Type Casting**: Converting between parent and child references
- **Array Polymorphism**: Using arrays of parent references
- **Interface Design**: Single interface for multiple implementations

### Polymorphism in Action
The key demonstration is that the same line of code:
```java
currentProduct.displayInfo();
```

Produces completely different output depending on whether `currentProduct` references a `Product` or `DigitalProduct` object. This is the power of polymorphism - the same interface can have multiple implementations!

---

*This project is designed for educational purposes and demonstrates advanced object-oriented programming concepts.*
