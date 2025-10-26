package lang.StringBuliderMain_1.test;

public class startWith {
    public static void main(String[] args) {
//        String url = "https://www.example.com";
//        System.out.println(url.startsWith("https"));

//        String[] arr = {"hello", "java", "jvm","spring", "jsp"};
//        int sum = 0;
//        for (String s : arr) {
//            System.out.println(s.length());
//            sum += s.length();
//
//        }
//        System.out.println(sum);

//        String str = "hello.txt";
//        System.out.println(str.indexOf("txt"));


        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";
        int count = 0;
        int index = str.indexOf(key);
        System.out.println(index);
        while (index >= 0) {
            index = str.indexOf(key, index + 1);
        }
        System.out.println(index);
    }
}
