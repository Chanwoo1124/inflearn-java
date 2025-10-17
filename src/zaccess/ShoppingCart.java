package zaccess;

public class ShoppingCart {
    private  Item[] items = new Item[10];
    private  int intCount = 0 ;

    public void addItem(Item item) {
        if (intCount >= items.length) {
            System.out.println("장바구니 가득 참");
            return;
        }
        items[intCount] = item;
        intCount++;

    }
    public void displayItems(){
        int result = 0;
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < items.length; i++){
            if (items[i] == null){
                System.out.println("합계:"+ result);
                return;
            }
            Item It = items[i];

            System.out.println("상품명:" + It.getMenu() + "합계:" + It.getM());
            result += It.getM();
        }

    }

}
