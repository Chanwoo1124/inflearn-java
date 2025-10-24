package zpoly.Pay;

public class KakaoPay implements Pay {
    @Override
    public void pay(int amount) {
        System.out.println("카카오페이");
    }
}
