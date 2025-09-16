/**
 * Store class demonstrates inheritance in action.
 * This class shows how child classes inherit properties and behaviors
 * from parent classes and can extend them with specialized functionality.
 * 
 * @author Student Developer
 * @version 1.0.0
 */
public class Store {
    
    /**
     * Main method - demonstrates inheritance with Product and DigitalProduct objects.
     * This method shows how child classes inherit from parent classes and
     * can override methods to provide specialized behavior.
     * 
     * @param args command line arguments (not used in this example)
     */
    public static void main(String[] args) {
        System.out.println("=== Store Product Management with Inheritance ===");
        System.out.println("Demonstrating how child classes inherit from parent classes");
        System.out.println();
        
        // Create a standard Product object
        Product standardProduct = new Product();
        standardProduct.setProductInfo("Gaming Laptop", 1299.99, "LAP-001");
        
        // Create a DigitalProduct object (inherits from Product)
        DigitalProduct digitalProduct = new DigitalProduct();
        digitalProduct.setDigitalProductInfo("E-Book: Java Programming", 29.99, "EBOOK-001", 
                                           "https://store.example.com/download/ebook-001");
        
        System.out.println("=== Inheritance Demonstration ===");
        System.out.println("Both objects can use inherited methods from the Product class");
        System.out.println();
        
        // Show that both objects can use inherited methods
        System.out.println("--- Standard Product (Parent Class) ---");
        System.out.println("Using inherited methods:");
        System.out.println("Name: " + standardProduct.getName());
        System.out.println("Price: $" + standardProduct.getPrice());
        System.out.println("SKU: " + standardProduct.getSku());
        System.out.println("Product Info: " + standardProduct.getProductInfo());
        System.out.println();
        
        System.out.println("--- Digital Product (Child Class) ---");
        System.out.println("Using inherited methods from Product class:");
        System.out.println("Name: " + digitalProduct.getName());        // Inherited from Product
        System.out.println("Price: $" + digitalProduct.getPrice());      // Inherited from Product
        System.out.println("SKU: " + digitalProduct.getSku());          // Inherited from Product
        System.out.println("Product Info: " + digitalProduct.getProductInfo()); // Inherited from Product
        System.out.println();
        
        System.out.println("Using specialized methods from DigitalProduct class:");
        System.out.println("Download URL: " + digitalProduct.getDownloadUrl()); // Own method
        System.out.println();
        
        // Demonstrate method overriding
        System.out.println("=== Method Overriding Demonstration ===");
        System.out.println("Both classes have displayInfo() methods, but they behave differently:");
        System.out.println();
        
        System.out.println("--- Standard Product displayInfo() ---");
        standardProduct.displayInfo(); // Calls Product's displayInfo()
        System.out.println();
        
        System.out.println("--- Digital Product displayInfo() ---");
        digitalProduct.displayInfo(); // Calls DigitalProduct's overridden displayInfo()
        System.out.println();
        
        // Show the benefits of inheritance
        System.out.println("=== Benefits of Inheritance ===");
        System.out.println("1. Code Reuse: DigitalProduct inherits all Product functionality");
        System.out.println("2. Specialization: DigitalProduct adds its own specialized features");
        System.out.println("3. Consistency: Both classes share the same interface");
        System.out.println("4. Extensibility: Easy to add new product types");
        System.out.println("5. Maintainability: Changes to Product affect all child classes");
        System.out.println();
        
        // Demonstrate that inheritance works with arrays
        System.out.println("=== Inheritance with Arrays ===");
        System.out.println("We can treat both types as Product objects:");
        
        Product[] products = new Product[2];
        products[0] = standardProduct;
        products[1] = digitalProduct;
        
        for (int i = 0; i < products.length; i++) {
            System.out.println("--- Product " + (i + 1) + " ---");
            System.out.println("Name: " + products[i].getName()); // Works for both types
            System.out.println("Price: $" + products[i].getPrice()); // Works for both types
            System.out.println("SKU: " + products[i].getSku()); // Works for both types
            System.out.println();
        }
        
        // Show what we can't do with inheritance
        System.out.println("=== Inheritance Limitations ===");
        System.out.println("Parent references can only access parent methods:");
        System.out.println("// products[1].getDownloadUrl(); // ERROR: Method not found in Product");
        System.out.println("This is because the reference type determines available methods.");
        System.out.println();
        
        System.out.println("=== Key Learning Points ===");
        System.out.println("1. Child classes inherit all public methods from parent classes");
        System.out.println("2. Child classes can add their own specialized methods");
        System.out.println("3. Child classes can override parent methods with @Override");
        System.out.println("4. The super keyword allows calling parent methods");
        System.out.println("5. Inheritance promotes code reuse and consistency");
    }
}
