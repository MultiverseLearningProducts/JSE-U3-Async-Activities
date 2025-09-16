# Unit 3 Work - 3-2 Starter

## Challenge: Blueprint for a Product

### Objective
Learn to define a class as a blueprint and create multiple, distinct objects from it.

### Your Task
1. **Complete Product.java**: Define a Product class with three public fields:
   - `String name` - The name of the product
   - `double price` - The price of the product  
   - `String sku` - The Stock Keeping Unit (unique identifier)

2. **Complete Store.java**: In the main method:
   - Create two different Product objects (instances of the class)
   - Manually set the field values for each product
   - Print the product information to the console

### Why This Matters
Classes and objects are how you model the real world in your code. This task is your first step in moving from simple variables to organized, meaningful data structures.

### Project Structure
```
unit-3-work/
├── src/
│   └── main/
│       └── java/
│           ├── Product.java      # TODO: Add your three public fields
│           └── Store.java        # TODO: Create objects and print them
└── README.md
```

### How to Test Your Solution
```bash
# Compile your classes
javac src/main/java/*.java

# Run the Store application
java -cp src/main/java Store
```

### Expected Output
Your program should display information about two different products, showing their names, prices, and SKUs.

### Success Criteria
- ✅ Product class has three public fields (name, price, sku)
- ✅ Store class creates two Product objects
- ✅ Field values are set for both products
- ✅ Product information is printed to console
- ✅ Code compiles and runs without errors

---

*This is a starter template. Complete the TODO items to finish the challenge.*
