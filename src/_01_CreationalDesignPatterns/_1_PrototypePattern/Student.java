package _01_CreationalDesignPatterns._1_PrototypePattern;

class Student implements Prototype {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Prototype clone() {
        return new Student(this.name, this.age);
    }

    @Override
    public String toString() {
        return "Student name is " + this.name + " and age is " + this.age;
    }

}
