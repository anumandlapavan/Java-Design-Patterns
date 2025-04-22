package _03_BehavioralDesignPatterns._06_MomentoPattern;

import java.util.ArrayList;
import java.util.List;

public class ConfigurationCareTaker {
    List<ConfigurationMemento> originatorList = new ArrayList<>();

    public void addMomento(ConfigurationMemento momento){
        originatorList.add(momento);
    }
    public ConfigurationMemento undo(){
        if(originatorList != null){
            int index = originatorList.size()-1;
            ConfigurationMemento memento = originatorList.get(index);
            originatorList.remove(index);
            return memento;
        }
        return null;
    }
}
