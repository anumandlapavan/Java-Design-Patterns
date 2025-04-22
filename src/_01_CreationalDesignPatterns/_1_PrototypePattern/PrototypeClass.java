package _01_CreationalDesignPatterns._1_PrototypePattern;


public class PrototypeClass {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Usha",21);

        Teacher teacher2 = (Teacher) teacher1.clone();

        System.out.println("Teacher 1 info : "+ teacher1);
        System.out.println("Teacher 2 info : "+ teacher2);

        if(teacher1 == teacher2){
            System.out.println("Yes they are same");
        }
        else{
            System.out.println("No they are not same");
        }

        Student student1 = new Student("Pavan",21);

        Student student2 = (Student) student1.clone();

        System.out.println("Student 1 info : "+student1);
        System.out.println("Student 2 info : "+student2);

        if(student1 == student2){
            System.out.println("Yes they are same");
        }
        else{
            System.out.println("No they are not same");
        }
    }
}
