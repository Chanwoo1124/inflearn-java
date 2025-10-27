package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {
        //Enum 상수를 포함하는 배열을 반환함
        Grade[] values = Grade.values();

        //배열 목록 출력할때 Arrays.toString
        System.out.println("values =" + Arrays.toString(values));

        for (Grade value : values) {
            System.out.println(value);
            if (value.equals("GOLD")){
                System.out.println("문자맞음 ");
            }
            // .name()   Eume 을 문자열로 반환   .ordinal  ENUM상수의 선언 순서를 반환함
            System.out.println("name=" + value.name()+ ", ordinal=" +value.ordinal());
        }
        //문자열을 ENUM으로 변환
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold);


    }
}
