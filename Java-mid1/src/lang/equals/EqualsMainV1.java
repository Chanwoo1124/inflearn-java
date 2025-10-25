package lang.equals;

public class EqualsMainV1 {
    static void main(String[] args) {
        UserV1 userv1 = new UserV1();
        UserV1 userv2 = new UserV1();

        System.out.println(userv1 == userv2);
        System.out.println(userv1.equals(userv2));



    }
}
