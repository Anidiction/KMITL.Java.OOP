package pack7a;

import java.util.HashMap;
import java.util.Map;

public class Catalog {
    private Map<String, Product> productList;
    private Map<String, Integer> priceList;

    public Catalog() {
        productList = new HashMap<>();
        priceList = new HashMap<>();
    }

    public void add(Product product, int price) {
        // 2
        productList.put(product.getpName(), product);
        priceList.put(product.getpName(), price);
    }

    public void showCatalog() {
        productList.forEach((p, n) -> System.out.printf("%s @ %d\n", p, priceList.get(p))); // 3
    }

    public int getPrice(String productName) {
        return 0;
    }

    public Product getProduct(String productName) {
        return null;
    }
}
