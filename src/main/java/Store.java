/**
 * Store class demonstrates a flexible shopping cart using collections and polymorphism.
 * This class shows how to combine all OOP principles by creating a collection
 * that can hold different but related object types and process them uniformly.
 * 
 * @author Student Developer
 * @version 1.0.0
 */
import java.util.ArrayList;

public class Store {
    
    /**
     * Main method - demonstrates a flexible shopping cart with polymorphic collections.
     * This method shows how to use ArrayList with parent class references to manage
     * different types of objects uniformly, demonstrating the power of OOP principles.
     * 
     * @param args command line arguments (not used in this example)
     */
    public static void main(String[] args) {
        System.out.println("=== Flexible Shopping Cart with OOP Principles ===");
        System.out.println("Combining encapsulation, inheritance, and polymorphism in a practical application");
        System.out.println();
        
        // Create various Product objects
        Product laptop = new Product();
        laptop.setProductInfo("Gaming Laptop", 1299.99, "LAP-001");
        
        Product book = new Product();
        book.setProductInfo("Java Programming Guide", 49.99, "BOOK-001");
        
        Product tShirt = new Product();
        tShirt.setProductInfo("Developer T-Shirt", 24.99, "SHIRT-001");
        
        // Create various DigitalProduct objects
        DigitalProduct ebook = new DigitalProduct();
        ebook.setDigitalProductInfo("E-Book: Advanced Java", 29.99, "EBOOK-001", 
                                   "https://store.example.com/download/ebook-001");
        
        DigitalProduct course = new DigitalProduct();
        course.setDigitalProductInfo("Online Course: OOP Mastery", 99.99, "COURSE-001", 
                                    "https://learn.example.com/course-oop-mastery");
        
        DigitalProduct software = new DigitalProduct();
        software.setDigitalProductInfo("IDE Software License", 199.99, "SOFT-001", 
                                      "https://download.example.com/ide-license");
        
        // This is the key to flexible collections - ArrayList of parent type
        ArrayList<Product> shoppingCart = new ArrayList<>();
        
        System.out.println("=== Building the Shopping Cart ===");
        System.out.println("Adding various Product and DigitalProduct objects to the cart...");
        System.out.println();
        
        // Add all products to the shopping cart
        // Notice: We can add both Product and DigitalProduct objects to the same list!
        shoppingCart.add(laptop);
        shoppingCart.add(book);
        shoppingCart.add(tShirt);
        shoppingCart.add(ebook);
        shoppingCart.add(course);
        shoppingCart.add(software);
        
        System.out.println("Shopping cart now contains " + shoppingCart.size() + " items");
        System.out.println();
        
        // Demonstrate the power of polymorphic collections
        System.out.println("=== Processing the Shopping Cart ===");
        System.out.println("Using a for-each loop to process all items uniformly:");
        System.out.println();
        
        int itemNumber = 1;
        for (Product item : shoppingCart) {
            System.out.println("--- Shopping Cart Item " + itemNumber + " ---");
            // This is the magic of polymorphism - the same method call
            // produces different behavior based on the actual object type!
            item.displayInfo();
            System.out.println();
            itemNumber++;
        }
        
        // Demonstrate additional operations on the polymorphic collection
        System.out.println("=== Advanced Shopping Cart Operations ===");
        System.out.println();
        
        // Calculate total price
        double totalPrice = 0.0;
        for (Product item : shoppingCart) {
            totalPrice += item.getPrice();
        }
        System.out.println("Total Cart Value: $" + String.format("%.2f", totalPrice));
        System.out.println();
        
        // Count different types of products
        int physicalProducts = 0;
        int digitalProducts = 0;
        
        for (Product item : shoppingCart) {
            if (item instanceof DigitalProduct) {
                digitalProducts++;
            } else {
                physicalProducts++;
            }
        }
        
        System.out.println("Cart Summary:");
        System.out.println("- Physical Products: " + physicalProducts);
        System.out.println("- Digital Products: " + digitalProducts);
        System.out.println("- Total Items: " + shoppingCart.size());
        System.out.println();
        
        // Demonstrate removing items
        System.out.println("=== Removing Items from Cart ===");
        System.out.println("Removing the first item (laptop)...");
        Product removedItem = shoppingCart.remove(0);
        System.out.println("Removed: " + removedItem.getName());
        System.out.println("Cart now contains " + shoppingCart.size() + " items");
        System.out.println();
        
        // Show the updated cart
        System.out.println("=== Updated Shopping Cart ===");
        itemNumber = 1;
        for (Product item : shoppingCart) {
            System.out.println("Item " + itemNumber + ": " + item.getName() + " - $" + item.getPrice());
            itemNumber++;
        }
        System.out.println();
        
        // Demonstrate the power of this pattern
        System.out.println("=== Why This Pattern is Powerful ===");
        System.out.println("1. Uniform Processing: Same code works for all product types");
        System.out.println("2. Easy to Extend: Add new product types without changing existing code");
        System.out.println("3. Type Safety: ArrayList ensures all items are Product objects");
        System.out.println("4. Polymorphic Behavior: Each item behaves according to its actual type");
        System.out.println("5. Collection Benefits: Easy to add, remove, iterate, and search");
        System.out.println();
        
        // Show how easy it is to add new functionality
        System.out.println("=== Adding New Functionality ===");
        System.out.println("Let's add a method to find products by price range:");
        
        System.out.println("Products under $50:");
        for (Product item : shoppingCart) {
            if (item.getPrice() < 50.0) {
                System.out.println("- " + item.getName() + " ($" + item.getPrice() + ")");
            }
        }
        System.out.println();
        
        System.out.println("Products $50 and above:");
        for (Product item : shoppingCart) {
            if (item.getPrice() >= 50.0) {
                System.out.println("- " + item.getName() + " ($" + item.getPrice() + ")");
            }
        }
        System.out.println();
        
        // Demonstrate the real-world power of this pattern
        System.out.println("=== Real-World Applications ===");
        System.out.println("This pattern is used everywhere in software development:");
        System.out.println("- GUI Components: List<Component> for buttons, labels, panels");
        System.out.println("- Database Records: List<Entity> for users, orders, products");
        System.out.println("- Game Objects: List<GameObject> for players, enemies, items");
        System.out.println("- File Processing: List<File> for documents, images, videos");
        System.out.println("- API Responses: List<Response> for different data types");
        System.out.println();
        
        System.out.println("=== Key Learning Points ===");
        System.out.println("1. Collections can hold parent class references to child objects");
        System.out.println("2. For-each loops work seamlessly with polymorphic collections");
        System.out.println("3. The same method call produces different behavior for each object");
        System.out.println("4. This pattern makes code flexible, maintainable, and extensible");
        System.out.println("5. It's one of the most powerful techniques in object-oriented programming");
    }
}
