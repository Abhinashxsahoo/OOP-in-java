import java.util.Scanner;

class InvoiceItem {
    private String id;
    private String description;
    private int quantity;
    private double unitPrice;
    private double discountRate; // Percentage discount (e.g., 10 for 10%)
    private double taxRate; // Percentage tax (e.g., 5 for 5%)

    // Constructor to initialize the attributes
    public InvoiceItem(String id, String description, int quantity, double unitPrice, double discountRate, double taxRate) {
        this.id = id;
        this.description = description;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.discountRate = discountRate;
        this.taxRate = taxRate;
    }

    // Method to calculate the total price before discount and taxes
    public double calculateTotalPrice() {
        return quantity * unitPrice;
    }

    // Method to calculate the discount amount
    public double calculateDiscount() {
        return calculateTotalPrice() * (discountRate / 100);
    }

    // Method to calculate the tax amount
    public double calculateTax() {
        return (calculateTotalPrice() - calculateDiscount()) * (taxRate / 100);
    }

    // Method to calculate the final price after discount and taxes
    public double calculateFinalPrice() {
        return calculateTotalPrice() - calculateDiscount() + calculateTax();
    }

    // Method to display the invoice details
    public void displayInvoice() {
        System.out.println("Invoice ID: " + id);
        System.out.println("Description: " + description);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Total Price: " + calculateTotalPrice());
        System.out.println("Discount: " + calculateDiscount());
        System.out.println("Tax: " + calculateTax());
        System.out.println("Final Price: " + calculateFinalPrice());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter the invoice ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter the description: ");
        String description = scanner.nextLine();
        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter the unit price: ");
        double unitPrice = scanner.nextDouble();
        System.out.print("Enter the discount rate (percentage): ");
        double discountRate = scanner.nextDouble();
        System.out.print("Enter the tax rate (percentage): ");
        double taxRate = scanner.nextDouble();

        // Create an InvoiceItem object
        InvoiceItem item = new InvoiceItem(id, description, quantity, unitPrice, discountRate, taxRate);

        // Display the invoice details
        item.displayInvoice();
    }
}
