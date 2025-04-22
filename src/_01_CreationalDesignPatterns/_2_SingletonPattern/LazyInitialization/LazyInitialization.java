package _01_CreationalDesignPatterns._2_SingletonPattern.LazyInitialization;

public class LazyInitialization {
    public static void main(String[] args) {
        LazyClass obj1 = LazyClass.getInstance();
        LazyClass obj2 = LazyClass.getInstance();

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
