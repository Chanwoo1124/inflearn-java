package zclass1;

public class Student {
    String name;
    int age;
    int grade;

    public Student(String name,int age, int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;

    }

    public static void main(String[] args) {
        Student stu1 = new Student("영철",17,80);
        Student stu2 = new Student("찬우",17,80);


    }
}

