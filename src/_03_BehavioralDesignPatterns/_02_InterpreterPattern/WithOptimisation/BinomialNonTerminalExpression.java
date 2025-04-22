package _03_BehavioralDesignPatterns._02_InterpreterPattern.WithOptimisation;

import _03_BehavioralDesignPatterns._02_InterpreterPattern.WithoutOptimisation.Context;

public class BinomialNonTerminalExpression implements AbstractInterpreter {

    AbstractInterpreter LeftExpression;
    AbstractInterpreter RightExpression;

    char operator;

    public BinomialNonTerminalExpression(AbstractInterpreter LE, AbstractInterpreter RE,char operator) {
        this.LeftExpression = LE;
        this.RightExpression = RE;
        this.operator = operator;
    }

    public int interpreter(Context context) {
        switch (this.operator){
            case '+':
                return LeftExpression.interpreter(context) + RightExpression.interpreter(context);
            case '*':
                return LeftExpression.interpreter(context) * RightExpression.interpreter(context);
            default:
                throw new UnsupportedOperationException("Unsupported operator: " + operator);

        }
    }
}
