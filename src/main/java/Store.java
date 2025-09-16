/**
 * Store class demonstrates how to create and use Product objects.
 * This class shows how to instantiate multiple objects from the same class
 * and how to access and modify their public fields.
 * 
 * @author Student Developer
 * @version 1.0.0
 */
public class Store {
    
    /**
     * Main method - demonstrates object creation and field access.
     * This method creates two different Product objects, sets their field values,
     * and displays the information to show how objects can have different data
     * while sharing the same structure (class blueprint).
     * 
     * @param args command line arguments (not used in this example)
     */
    public static void main(String[] args) {
        System.out.println("=== Store Product Management ===");
        System.out.println("Demonstrating classes as blueprints and object creation");
        System.out.println();
        
        // Create the first Product object
        Product laptop = new Product();
        
        // Set the field values for the laptop
        laptop.name = "Gaming Laptop";
        laptop.price = 1299.99;
        laptop.sku = "LAP-001";
        
        // Create the second Product object
        Product mouse = new Product();
        
        // Set the field values for the mouse
        mouse.name = "Wireless Mouse";
        mouse.price = 29.99;
        mouse.sku = "MOU-002";
        
        // Display the first product information
        System.out.println("--- Product 1 ---");
        System.out.println("Name: " + laptop.name);
        System.out.println("Price: $" + laptop.price);
        System.out.println("SKU: " + laptop.sku);
        System.out.println();
        
        // Display the second product information
        System.out.println("--- Product 2 ---");
        System.out.println("Name: " + mouse.name);
        System.out.println("Price: $" + mouse.price);
        System.out.println("SKU: " + mouse.sku);
        System.out.println();
        
        // Demonstrate that objects are independent
        System.out.println("--- Object Independence Demo ---");
        System.out.println("Both products are separate objects:");
        System.out.println("Laptop object: " + laptop);
        System.out.println("Mouse object: " + mouse);
        System.out.println("They have different memory locations and data!");
        
        // Show how we can modify one object without affecting the other
        System.out.println();
        System.out.println("--- Modifying Objects Independently ---");
        laptop.price = 1199.99; // Price drop!
        System.out.println("Laptop price after discount: $" + laptop.price);
        System.out.println("Mouse price remains unchanged: $" + mouse.price);
        
        System.out.println();
        System.out.println("=== Key Learning Points ===");
        System.out.println("1. Classes are blueprints for creating objects");
        System.out.println("2. Objects are instances of a class");
        System.out.println("3. Each object has its own copy of the fields");
        System.out.println("4. Objects are independent - changing one doesn't affect others");
        System.out.println("5. Public fields can be accessed directly with dot notation");
    }
}
