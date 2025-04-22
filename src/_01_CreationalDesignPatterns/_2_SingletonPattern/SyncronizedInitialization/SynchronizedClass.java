package _01_CreationalDesignPatterns._2_SingletonPattern.SyncronizedInitialization;

class SynchronizedClass {
    private String name;
    private static SynchronizedClass instance;

    private SynchronizedClass(String name) {
        this.name = name;
    }

    synchronized public static SynchronizedClass getInstance(){
        if (instance == null) {
            instance = new SynchronizedClass("Pavan");
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
