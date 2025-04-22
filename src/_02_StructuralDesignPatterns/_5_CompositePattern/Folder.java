package _02_StructuralDesignPatterns._5_CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystem {
    private String name;
    private List<FileSystem> contents = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileSystem fileSystem) {
        contents.add(fileSystem);
    }

    public void display() {
        System.out.println("Folder: " + name);
        for (FileSystem f : contents) {
            f.display();
        }
    }
}
