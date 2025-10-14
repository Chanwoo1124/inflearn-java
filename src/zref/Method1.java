package zref;



public class Method1 {
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.name ="학생1";
        student1.age = 17;
        student1.grade = 85;




        Student student2 = new Student();
        student2.name ="학생1";
        student2.age = 17;
        student2.grade = 85;

        printStudent(student1);
        printStudent(student2);


    }
    static void printStudent(Student s){
        System.out.println(s.name + s.age + s.grade);
    }
}
