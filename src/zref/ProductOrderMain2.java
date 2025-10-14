package zref;

import java.util.Scanner;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요");
        int n = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] pos = new ProductOrder[3];

        pos[0] =createOrder("두부",2000,2);
        pos[1] =createOrder("김치",5000,1);
        pos[2] =createOrder("콜라",3000,3);

        printOrders(pos);
        getTotalAmount(pos);


    }


    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder po = new ProductOrder();
        po.productName = productName;
        po.price = price;
        po.quantity = quantity;

        return po;
    }
    static void printOrders(ProductOrder[] pos) {
        for (int i = 0; i < pos.length; i++) {
            System.out.println("상품: " + pos[i].productName + "가격: " + pos[i].price + "개수: " + pos[i].quantity);
        }
    }
     static void getTotalAmount(ProductOrder[] pos){
        int total = 0;
        for (int i = 0; i < pos.length; i++){
            total += pos[0].price;
        }
         System.out.println(total);
     }

}
