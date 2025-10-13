package zclass1;

import class1.Student;

public class ClassStart3 {

    public static void main(String[] args) {
        class1.Student student1;
        student1 = new class1.Student(); //x001
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        class1.Student student2 = new Student(); //x002
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성적:" + student1.grade);
        System.out.println("이름:" + student2.name + " 나이:" + student2.age + " 성적:" + student2.grade);
    }
}
