package _03_BehavioralDesignPatterns._02_InterpreterPattern.WithoutOptimisation;

import java.util.Map;

public class Context {
    private static Map<String,Integer> contextMap;
    public Context(Map<String,Integer> contextMap){
        Context.contextMap = contextMap;
    }

    public void put(String variable, int value) {
        contextMap.put(variable, value);
    }
    public int get(String variable){
        return contextMap.get(variable);
    }
}
