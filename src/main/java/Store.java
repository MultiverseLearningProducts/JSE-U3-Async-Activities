/**
 * Store class demonstrates how to use encapsulated Product objects.
 * This class shows how to interact with objects that have private fields
 * through public getter and setter methods.
 * 
 * @author Student Developer
 * @version 1.0.0
 */
public class Store {
    
    /**
     * Main method - demonstrates encapsulation and controlled data access.
     * This method shows how to create Product objects and interact with them
     * using getter and setter methods instead of direct field access.
     * 
     * @param args command line arguments (not used in this example)
     */
    public static void main(String[] args) {
        System.out.println("=== Store Product Management with Encapsulation ===");
        System.out.println("Demonstrating private fields and public getter/setter methods");
        System.out.println();
        
        // Create the first Product object
        Product laptop = new Product();
        
        // Set the field values using setter methods (encapsulation in action!)
        laptop.setName("Gaming Laptop");
        laptop.setPrice(1299.99);
        laptop.setSku("LAP-001");
        
        // Create the second Product object
        Product mouse = new Product();
        
        // Set the field values using setter methods
        mouse.setName("Wireless Mouse");
        mouse.setPrice(29.99);
        mouse.setSku("MOU-002");
        
        // Display the first product information using getter methods
        System.out.println("--- Product 1 (Using Individual Getters) ---");
        System.out.println("Name: " + laptop.getName());
        System.out.println("Price: $" + laptop.getPrice());
        System.out.println("SKU: " + laptop.getSku());
        System.out.println();
        
        // Display the second product information using the utility method
        System.out.println("--- Product 2 (Using Utility Method) ---");
        System.out.println(mouse.getProductInfo());
        System.out.println();
        
        // Demonstrate that we can still modify objects, but through controlled methods
        System.out.println("--- Modifying Objects Through Setters ---");
        System.out.println("Original laptop price: $" + laptop.getPrice());
        laptop.setPrice(1199.99); // Price drop through setter!
        System.out.println("New laptop price: $" + laptop.getPrice());
        System.out.println("Mouse price remains unchanged: $" + mouse.getPrice());
        System.out.println();
        
        // Demonstrate the setProductInfo utility method
        System.out.println("--- Using Utility Method for Bulk Updates ---");
        Product keyboard = new Product();
        keyboard.setProductInfo("Mechanical Keyboard", 89.99, "KEY-003");
        System.out.println("New product created: " + keyboard.getProductInfo());
        System.out.println();
        
        // Show that objects are still independent
        System.out.println("--- Object Independence with Encapsulation ---");
        System.out.println("All products are separate objects with their own data:");
        System.out.println("Laptop: " + laptop.getProductInfo());
        System.out.println("Mouse: " + mouse.getProductInfo());
        System.out.println("Keyboard: " + keyboard.getProductInfo());
        System.out.println();
        
        // Demonstrate the benefits of encapsulation
        System.out.println("=== Benefits of Encapsulation ===");
        System.out.println("1. Data Protection: Fields are private and can't be accessed directly");
        System.out.println("2. Controlled Access: Only through public getter/setter methods");
        System.out.println("3. Data Validation: Setters can validate data before setting");
        System.out.println("4. Flexibility: Internal implementation can change without affecting users");
        System.out.println("5. Better Design: Clear interface for interacting with objects");
        System.out.println();
        
        // Show what happens if we try to access private fields (this would cause compilation errors)
        System.out.println("--- What We Can't Do (Compilation Errors) ---");
        System.out.println("// laptop.name = \"New Name\";  // ERROR: name has private access");
        System.out.println("// System.out.println(laptop.price);  // ERROR: price has private access");
        System.out.println("// mouse.sku = \"NEW-SKU\";  // ERROR: sku has private access");
        System.out.println();
        System.out.println("Instead, we must use the public methods:");
        System.out.println("laptop.setName(\"New Name\");");
        System.out.println("System.out.println(laptop.getPrice());");
        System.out.println("mouse.setSku(\"NEW-SKU\");");
    }
}
