package _01_CreationalDesignPatterns._2_SingletonPattern.SyncronizedInitialization;

public class SynchronizedMethods {
    public static void main(String[] args) {
        SynchronizedClass obj1 = SynchronizedClass.getInstance();
        SynchronizedClass obj2 = SynchronizedClass.getInstance();

        System.out.println(obj1.getName());
        System.out.println(obj2.getName());

        obj1.setName("Anu");

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
