/**
 * DigitalProduct class extends Product to demonstrate inheritance.
 * This class shows how child classes can inherit properties and behaviors
 * from parent classes while adding their own specialized features.
 * 
 * @author Student Developer
 * @version 1.0.0
 */
public class DigitalProduct extends Product {
    
    // Additional private field specific to digital products
    private String downloadUrl;    // URL where the digital product can be downloaded
    
    // Constructor for DigitalProduct
    public DigitalProduct() {
        super(); // Call parent constructor
    }
    
    // Getter method for the additional field
    
    /**
     * Gets the download URL for the digital product.
     * 
     * @return the download URL
     */
    public String getDownloadUrl() {
        return downloadUrl;
    }
    
    // Setter method for the additional field
    
    /**
     * Sets the download URL for the digital product.
     * 
     * @param downloadUrl the download URL
     */
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }
    
    /**
     * Sets all digital product information at once.
     * This method extends the parent's setProductInfo method
     * to include the digital-specific download URL.
     * 
     * @param name the product name
     * @param price the product price
     * @param sku the product SKU
     * @param downloadUrl the download URL
     */
    public void setDigitalProductInfo(String name, double price, String sku, String downloadUrl) {
        setProductInfo(name, price, sku); // Call parent method to set inherited fields
        this.downloadUrl = downloadUrl;   // Set the additional field
    }
    
    /**
     * Overrides the parent's displayInfo method to demonstrate inheritance.
     * This method shows how child classes can extend parent behavior
     * by calling the parent method and adding additional information.
     * 
     * The @Override annotation indicates that this method intentionally
     * overrides a method from the parent class.
     */
    @Override
    public void displayInfo() {
        // Call the parent's displayInfo method to show inherited information
        super.displayInfo();
        
        // Add additional information specific to digital products
        System.out.println("Download URL: " + downloadUrl);
        System.out.println("Type: Digital Product");
        System.out.println("Description: This is a digital item that can be downloaded instantly");
    }
}
