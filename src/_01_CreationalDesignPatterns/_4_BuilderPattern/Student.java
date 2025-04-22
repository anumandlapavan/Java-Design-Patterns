package _01_CreationalDesignPatterns._4_BuilderPattern;

class Student {
    String name;
    int rollNumber;

    String email;

    String course;
    String branch;

    Student(Builder builder) {
        this.name = builder.name;
        this.course = builder.course;
        this.email = builder.email;
        this.branch = builder.branch;
        this.rollNumber = builder.rollNumber;
    }

    String getName() {
        return this.name;
    }

    String getCourse() {
        return this.course;
    }

    String getEmail() {
        return this.email;
    }

    int getRollNumber() {
        return this.rollNumber;
    }

    String getBranch() {
        return this.branch;
    }
}
