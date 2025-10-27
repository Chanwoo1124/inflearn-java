package enumeration.test;

import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("당신의 등급을 입력하세요 [GUEST, LOGIN, ADMIN]: ");
            String description =sc.nextLine();
            enumeration.test.AuthGrade authgrade =AuthGrade.valueOf(description.toUpperCase());
            System.out.println("당신의 등급은 :"+ authgrade.getDescription() + "입니다.");
            System.out.println("== 메뉴 목록==");
            System.out.println("- 메인 화면");
            if (authgrade.name().equals("LOGIN")){
                System.out.println("- 이메일 관리 화면");
            } else if (authgrade.name().equals("ADMIN")) {
                System.out.println("- 이메일 관리 화면");
                System.out.println("-관리자 화면");
            }


        }
    }
}
