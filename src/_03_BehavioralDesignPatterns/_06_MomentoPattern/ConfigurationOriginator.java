package _03_BehavioralDesignPatterns._06_MomentoPattern;

public class ConfigurationOriginator{
    int height ;
    int weight;
    ConfigurationOriginator(int height, int weight){
        this.height = height;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public  ConfigurationMemento createMomento(){
        return new ConfigurationMemento(height,weight);
    }

    public void returnMomento(ConfigurationMemento momento){
        this.height = momento.height;
        this.weight = momento.weight;
    }
}

