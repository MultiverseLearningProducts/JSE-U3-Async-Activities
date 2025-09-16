/**
 * Product class demonstrates encapsulation and serves as a parent class for inheritance.
 * This class shows how to create a base class that can be extended by child classes
 * to inherit properties and behaviors.
 * 
 * @author Student Developer
 * @version 1.0.0
 */
public class Product {
    
    // Private fields - encapsulated data
    private String name;    // The name of the product
    private double price;   // The price of the product
    private String sku;     // The Stock Keeping Unit (unique identifier)
    
    // Getter methods - provide read access to private fields
    
    /**
     * Gets the name of the product.
     * 
     * @return the product name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Gets the price of the product.
     * 
     * @return the product price
     */
    public double getPrice() {
        return price;
    }
    
    /**
     * Gets the SKU of the product.
     * 
     * @return the product SKU
     */
    public String getSku() {
        return sku;
    }
    
    // Setter methods - provide controlled write access to private fields
    
    /**
     * Sets the name of the product.
     * 
     * @param name the new product name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Sets the price of the product.
     * 
     * @param price the new product price
     */
    public void setPrice(double price) {
        this.price = price;
    }
    
    /**
     * Sets the SKU of the product.
     * 
     * @param sku the new product SKU
     */
    public void setSku(String sku) {
        this.sku = sku;
    }
    
    // Additional utility methods for better encapsulation
    
    /**
     * Sets all product information at once.
     * This method demonstrates how encapsulation can provide
     * convenient ways to set multiple related fields together.
     * 
     * @param name the product name
     * @param price the product price
     * @param sku the product SKU
     */
    public void setProductInfo(String name, double price, String sku) {
        this.name = name;
        this.price = price;
        this.sku = sku;
    }
    
    /**
     * Gets a formatted string representation of the product.
     * This method demonstrates how encapsulation can provide
     * controlled ways to display object data.
     * 
     * @return a formatted string with product information
     */
    public String getProductInfo() {
        return "Product: " + name + ", Price: $" + price + ", SKU: " + sku;
    }
    
    /**
     * Displays basic product information to the console.
     * This method can be overridden by child classes to provide
     * specialized display behavior while maintaining the same interface.
     * 
     * This method demonstrates inheritance - child classes can inherit
     * this behavior and extend it with their own specialized information.
     */
    public void displayInfo() {
        System.out.println("=== Product Information ===");
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("SKU: " + sku);
        System.out.println("Type: Standard Product");
    }
}
