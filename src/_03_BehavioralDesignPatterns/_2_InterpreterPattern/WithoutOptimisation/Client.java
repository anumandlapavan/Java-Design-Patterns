package _03_BehavioralDesignPatterns._2_InterpreterPattern.WithoutOptimisation;

import java.util.HashMap;

public class Client {
    public static void main(String[] args) {
        Context context = new Context(new HashMap<>());
        context.put("a", 2);
        context.put("b", 4);
        context.put("c", 8);
        context.put("d", 10);
        AbstractInterpreter expression = new SumNonTerminalInterpreter(
                new MultiplyNonTerminalInterpreter(new NumberTerminalExpression("a"), new NumberTerminalExpression("b")),
                new MultiplyNonTerminalInterpreter(new NumberTerminalExpression("c"), new NumberTerminalExpression("d"))
        );

        System.out.println("Result: " + expression.interpreter(context));

    }
}
