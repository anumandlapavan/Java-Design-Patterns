package _01_CreationalDesignPatterns._2_SingletonPattern.DoubleLockingInitialisation;

public class DoubleLockingMethod {
    public static void main(String[] args) {
        DoubleLockingClass obj1 = DoubleLockingClass.getInstance();
        DoubleLockingClass obj2 = DoubleLockingClass.getInstance();

        System.out.println(obj1.getName());
        System.out.println(obj2.getName());

        obj1.setName("Anumandla");

        System.out.println(obj1.getName());
        System.out.println(obj2.getName());

        if(obj1 == obj2){
            System.out.println("Both are same");
        }
        else{
            System.out.println("Both are not same.");
        }
    }
}
