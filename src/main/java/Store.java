/**
 * Store class demonstrates polymorphism in action.
 * This class shows how the same method call can produce different output
 * depending on the actual type of the object, even when referenced through
 * a parent class variable.
 * 
 * @author Student Developer
 * @version 1.0.0
 */
public class Store {
    
    /**
     * Main method - demonstrates polymorphism with Product and DigitalProduct objects.
     * This method shows how Java's runtime polymorphism works by using a parent
     * class reference to hold child class objects and calling the same method
     * to produce different results.
     * 
     * @param args command line arguments (not used in this example)
     */
    public static void main(String[] args) {
        System.out.println("=== Store Product Management with Polymorphism ===");
        System.out.println("Demonstrating how the same method call produces different output");
        System.out.println("depending on the actual type of the object");
        System.out.println();
        
        // Create a standard Product object
        Product standardProduct = new Product();
        standardProduct.setProductInfo("Gaming Laptop", 1299.99, "LAP-001");
        
        // Create a DigitalProduct object
        DigitalProduct digitalProduct = new DigitalProduct();
        digitalProduct.setDigitalProductInfo("E-Book: Java Programming", 29.99, "EBOOK-001", 
                                           "https://store.example.com/download/ebook-001");
        
        // This is the key to polymorphism - using a parent class reference
        Product currentProduct;
        
        System.out.println("=== Polymorphism Demonstration ===");
        System.out.println("Using the same variable 'currentProduct' to reference different objects");
        System.out.println();
        
        // First, assign the standard Product to the parent reference
        System.out.println("--- Step 1: Assigning Standard Product ---");
        currentProduct = standardProduct;
        System.out.println("currentProduct now references a Standard Product object");
        System.out.println("Calling currentProduct.displayInfo():");
        currentProduct.displayInfo(); // This calls Product's displayInfo()
        System.out.println();
        
        // Now, assign the DigitalProduct to the same parent reference
        System.out.println("--- Step 2: Assigning Digital Product ---");
        currentProduct = digitalProduct;
        System.out.println("currentProduct now references a Digital Product object");
        System.out.println("Calling currentProduct.displayInfo() again:");
        currentProduct.displayInfo(); // This calls DigitalProduct's displayInfo()!
        System.out.println();
        
        // Demonstrate that the same line of code produces different output
        System.out.println("=== The Magic of Polymorphism ===");
        System.out.println("Notice that we used the EXACT same line of code:");
        System.out.println("    currentProduct.displayInfo();");
        System.out.println();
        System.out.println("But it produced completely different output!");
        System.out.println("This is because Java determines at RUNTIME which method to call");
        System.out.println("based on the ACTUAL type of the object, not the reference type.");
        System.out.println();
        
        // Show the objects are still independent
        System.out.println("=== Object Independence ===");
        System.out.println("Both objects still exist independently:");
        System.out.println("Standard Product: " + standardProduct.getProductInfo());
        System.out.println("Digital Product: " + digitalProduct.getProductInfo());
        System.out.println();
        
        // Demonstrate that we can still access child-specific methods when we have the right reference
        System.out.println("=== Accessing Child-Specific Methods ===");
        System.out.println("When we have a DigitalProduct reference, we can access specialized methods:");
        System.out.println("Download URL: " + digitalProduct.getDownloadUrl());
        System.out.println();
        
        // Show what happens when we try to access child methods through parent reference
        System.out.println("=== Polymorphism Limitations ===");
        System.out.println("When using a parent reference, we can only access parent methods:");
        System.out.println("// currentProduct.getDownloadUrl(); // ERROR: Method not found in Product");
        System.out.println("This is because the reference type determines what methods are available,");
        System.out.println("but the actual object type determines which version of the method is called.");
        System.out.println();
        
        // Demonstrate polymorphism with multiple objects
        System.out.println("=== Polymorphism with Multiple Objects ===");
        System.out.println("Let's create an array of Product references to show polymorphism at scale:");
        
        Product[] products = new Product[3];
        products[0] = new Product();
        products[0].setProductInfo("Physical Book", 19.99, "BOOK-001");
        
        products[1] = new DigitalProduct();
        products[1].setProductInfo("Online Course", 99.99, "COURSE-001");
        ((DigitalProduct) products[1]).setDownloadUrl("https://learn.example.com/course-001");
        
        products[2] = new Product();
        products[2].setProductInfo("T-Shirt", 24.99, "SHIRT-001");
        
        System.out.println("Calling displayInfo() on each product in the array:");
        for (int i = 0; i < products.length; i++) {
            System.out.println("--- Product " + (i + 1) + " ---");
            products[i].displayInfo(); // Polymorphism in action!
            System.out.println();
        }
        
        System.out.println("=== Key Benefits of Polymorphism ===");
        System.out.println("1. Code Reusability: Same method works for different object types");
        System.out.println("2. Flexibility: Easy to add new types without changing existing code");
        System.out.println("3. Maintainability: Changes to one class don't affect others");
        System.out.println("4. Extensibility: New functionality can be added through inheritance");
        System.out.println("5. Clean Design: Single interface for multiple implementations");
    }
}
