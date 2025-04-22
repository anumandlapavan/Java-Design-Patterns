package _01_CreationalDesignPatterns._2_SingletonPattern.EagerInitialization;

public class EagerInitialization {
    public static void main(String[] args) {
        EagerClass obj1 = EagerClass.getInstance();
        EagerClass obj2 = EagerClass.getInstance();

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
