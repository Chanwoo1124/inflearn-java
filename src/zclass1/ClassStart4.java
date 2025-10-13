package zclass1;

import class1.Student;

public class ClassStart4 {

    public static void main(String[] args) {
        Student student1;
        student1 = new Student(); //x001
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); //x002
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = {student1,student2};

        for (int i = 0; i < students.length; i++){
            Student s = students[i];
            System.out.println(s.name +"|" + s.age + "|"+ s.grade );

        }

        for(Student s : students){
            System.out.println(s.name + s.age + s.grade);
        }
        for (Student student : students) {

        }
        for (Student student : students) {

        }




/*
        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성적:" + student1.grade);
        System.out.println("이름:" + student2.name + " 나이:" + student2.age + " 성적:" + student2.grade);*/
    }
}
