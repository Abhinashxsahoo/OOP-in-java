import java.util.Scanner;

class Product {
    String productName;
    int productID;
    double price;
    int quantityInStock;
    private static final int MAX_PRODUCT = 5;
    static Product productArr[] = new Product[MAX_PRODUCT];

    Product(String productName,
            int productID,
            double price,
            int quantityInStock) {
        this.productName = productName;
        this.productID = productID;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    static void applyDiscount(double discount, int id) {
        for (int i = 0; i < productArr.length; i++) {
            if (id == productArr[i].productID) {
                if (discount > 100 || discount < 0) {
                    System.out.println("Invalid discount");
                    return;
                }
                productArr[i].price -= productArr[i].price * (discount / 100);
                System.out.println("Updated price: " + productArr[i].price);
            }
        }
    }

}

public class ProductDiscount {

    public static void main(String[] args) {

        Product.productArr[0] = new Product("Coco-Cola", 1, 10.00, 100);
        Product.productArr[1] = new Product("Sprite", 2, 10.00, 100);
        Product.productArr[2] = new Product("Mazza", 3, 15.00, 100);
        Product.productArr[3] = new Product("Limca", 4, 10.00, 100);
        Product.productArr[4] = new Product("Pepsi", 5, 10.00, 100);

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the product id: ");
        int tempID = scan.nextInt();
        System.out.print("Enter the discount: ");
        double tempDiscount = scan.nextDouble();

        Product.applyDiscount(tempDiscount, tempID);
        scan.close();
    }
}