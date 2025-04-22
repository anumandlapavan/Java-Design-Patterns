package _01_CreationalDesignPatterns._2_SingletonPattern.EagerInitialization;

class EagerClass {
    private String name;
    private static final EagerClass instance = new EagerClass("Pavan");

    private EagerClass(String name) {
        this.name = name;
    }

    public static EagerClass getInstance() {
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
