package _01_CreationalDesignPatterns._2_SingletonPattern.DoubleLockingInitialisation;

class DoubleLockingClass {
    private String name;
    private static DoubleLockingClass instance;

    private DoubleLockingClass(String name) {
        this.name = name;
    }

    public static DoubleLockingClass getInstance() {
        if (instance == null) {
            synchronized (DoubleLockingClass.class) {
                if (instance == null) {
                    instance = new DoubleLockingClass("Pavan");
                }
            }
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
