package _01_CreationalDesignPatterns._1_PrototypePattern;

class Teacher implements Prototype {
    String name;
    int age;

    Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Prototype clone() {
        return new Teacher(this.name, this.age);
    }

    @Override
    public String toString() {
        return "Teacher name is " + this.name + " and age is " + this.age;
    }
}
