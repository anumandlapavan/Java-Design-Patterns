package _02_StructuralDesignPatterns._5_CompositePattern;
public class Client {
    public static void main(String[] args) {
        FileSystem file1 = new File("Resume.docx");
        FileSystem file2 = new File("Photo.jpg");

        Folder folder1 = new Folder("Documents");
        folder1.add(file1);
        folder1.add(file2);

        FileSystem file3 = new File("Budget.xlsx");

        Folder rootFolder = new Folder("Drive");
        rootFolder.add(folder1);
        rootFolder.add(file3);

        rootFolder.display();
    }
}
