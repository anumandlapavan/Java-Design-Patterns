package _01_CreationalDesignPatterns._4_BuilderPattern;

public class Client {
    public static void main(String[] args) {

        Builder builder = new Builder();

        Student mTechCseStudent = builder.setName("Sai").setRollNumber(422170).setBranch("CSE").studentBuild();
        System.out.println(mTechCseStudent.getName());
        System.out.println(mTechCseStudent.getRollNumber());

        Student btechCseStudent = new BuilderContext(new Builder()).btechCseStudent();
        System.out.println(btechCseStudent.getCourse());
        System.out.println(btechCseStudent.getBranch());
    }
}
