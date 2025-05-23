package _03_BehavioralDesignPatterns._02_InterpreterPattern.WithOptimisation;

import _03_BehavioralDesignPatterns._02_InterpreterPattern.WithoutOptimisation.Context;

public class NumberTerminalExpression implements AbstractInterpreter {
    String variable;

    public NumberTerminalExpression(String variable) {
        this.variable = variable;
    }

    public int interpreter(Context context) {
        return context.get(this.variable);
    }
}
