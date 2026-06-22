package Week1.EcommercePlatformSearchFunction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productCatalog = new ArrayList<>();
        productCatalog.add(new Product(101, "Wireless Mouse", "Electronics"));
        productCatalog.add(new Product(105, "Mechanical Keyboard", "Electronics"));
        productCatalog.add(new Product(110, "Leather Wallet", "Accessories"));
        productCatalog.add(new Product(120, "Running Shoes", "Footwear"));

        int searchId = 110;

        Product resultLinear = ProductSearch.linearSearch(productCatalog, searchId);
        System.out.println("Linear Search Result: " + resultLinear);

        Product resultBinary = ProductSearch.binarySearch(productCatalog, searchId);
        System.out.println("Binary Search Result: " + resultBinary);
    }
}
