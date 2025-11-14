package collection.Map.test;

import java.util.HashMap;

public class WordFrequencyTest1 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";

        String[] s = text.split(" ");

        HashMap<String, Integer> kumono = new HashMap<>();


        //없으면 과일 넣고 1추가   있으면 값만 추가
        for (String string : s) {
            if(!kumono.containsKey(string)){
                kumono.put(string,+1);
            }else{
                Integer i = kumono.get(string);
                kumono.put(string,i+1);
            }
        }
        System.out.println(kumono);

    }
}
