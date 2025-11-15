package collection.Map.test.cart;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Cart {
    private Map<Product,Integer> cartMap = new HashMap<>();


    public void add(Product product , int quantity){
        Integer existingQuantity = cartMap.getOrDefault(product, 0);
        cartMap.put(product,existingQuantity+1);

    }

    public void printAll() {
        System.out.println("모든 상품 출력");
        for (Map.Entry<Product, Integer> productIntegerEntry : cartMap.entrySet()) {
            System.out.println(productIntegerEntry.getKey()+"수량:" +productIntegerEntry.getValue());

        }

    }

    public void minus(Product product, int i) {
        Integer orDefault = cartMap.getOrDefault(product, 0);
        int newQuantity = orDefault - i;
        if(newQuantity <= 0){
            cartMap.remove(product);
        }else{
            cartMap.put(product,newQuantity);
        }

    }
}
