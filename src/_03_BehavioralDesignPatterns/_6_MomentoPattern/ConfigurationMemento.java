package _03_BehavioralDesignPatterns._6_MomentoPattern;

public class ConfigurationMemento {
    int height;
    int weight;
    ConfigurationMemento(int height, int weight){
        this.height = height;
        this.weight = weight;
    }

    public int getHeight(){
        return height;
    }

    public int getWeight() {
        return weight;
    }
}
