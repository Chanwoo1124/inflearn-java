package collection.Map.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> dictionary = new HashMap<>();
        while (true) {
            System.out.println("단어 입력 단계");
            System.out.print("영어 단어를 입력하세요");
            String e = scanner.nextLine();
            if(e =="q"){
                break;
            }
            System.out.println("한글 뜻을 입력하세요");
            String k = scanner.nextLine();
            if(e =="k"){
                break;
            }
            dictionary.put(e,k);
        }



    }
}
