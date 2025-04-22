package _03_BehavioralDesignPatterns._02_InterpreterPattern.WithOptimisation;

import _03_BehavioralDesignPatterns._02_InterpreterPattern.WithoutOptimisation.*;

import java.util.HashMap;

public class Client {
    public static void main(String[] args) {
        Context context = new Context(new HashMap<>());
        context.put("a", 2);
        context.put("b", 4);
        context.put("c", 8);
        context.put("d", 10);

        AbstractInterpreter expression = new BinomialNonTerminalExpression(
                new BinomialNonTerminalExpression(new NumberTerminalExpression("a"), new NumberTerminalExpression("b"), '*'),
                new BinomialNonTerminalExpression(new NumberTerminalExpression("c"), new NumberTerminalExpression("d"), '*'),
                '+'
        );

        System.out.println("Result: " + expression.interpreter(context));
    }
}
