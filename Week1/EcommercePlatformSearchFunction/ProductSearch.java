package Week1.EcommercePlatformSearchFunction;

import java.util.List;

public class ProductSearch {

    public static Product linearSearch(List<Product> products, int targetId) {
        for (Product product : products) {
            if (product.getProductId() == targetId) {
                return product;
            }
        }
        return null;
    }

    public static Product binarySearch(List<Product> sortedProducts, int targetId) {
        int low = 0;
        int high = sortedProducts.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            Product midProduct = sortedProducts.get(mid);

            if (midProduct.getProductId() == targetId) {
                return midProduct;
            } else if (midProduct.getProductId() < targetId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }
}
