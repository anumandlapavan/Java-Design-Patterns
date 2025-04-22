package _01_CreationalDesignPatterns._4_BuilderPattern;

class Builder {
    String name;
    int rollNumber;

    String email;

    String course;
    String branch;

    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    public Builder setEmail(String email) {
        this.email = email;
        return this;
    }

    public Builder setCourse(String course) {
        this.course = course;
        return this;
    }

    public Builder setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
        return this;
    }

    public Builder setBranch(String branch) {
        this.branch = branch;
        return this;
    }

    Student studentBuild() {
        return new Student(this);
    }
}
