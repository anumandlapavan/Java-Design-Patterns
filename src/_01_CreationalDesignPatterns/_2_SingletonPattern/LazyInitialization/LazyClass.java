package _01_CreationalDesignPatterns._2_SingletonPattern.LazyInitialization;

class LazyClass {
    private String name;
    private static LazyClass instance;

    private LazyClass(String name) {
        this.name = name;
    }

    public static LazyClass getInstance() {
        if (instance == null) {
            instance = new LazyClass("Pavan");
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
