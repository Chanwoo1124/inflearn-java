package collection.Map.test.cart;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Cart {
    private Map<Product,Integer> cartMap = new HashMap<>();


    public void add(Product product , int quantity){
        Integer existingQuantity = cartMap.getOrDefault(product, 0);



    }

    public void printAll() {
    }

    public void minus(Product product, int i) {
    }
}
