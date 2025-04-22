package _03_BehavioralDesignPatterns._2_InterpreterPattern.WithoutOptimisation;

public class SumNonTerminalInterpreter implements AbstractInterpreter{
    AbstractInterpreter LeftExpression;
    AbstractInterpreter RightExpression;

    public SumNonTerminalInterpreter(AbstractInterpreter LE, AbstractInterpreter RE){
        this.LeftExpression = LE;
        this.RightExpression = RE;
    }

    public int interpreter (Context context){
        return this.LeftExpression.interpreter(context)+this.RightExpression.interpreter(context);
    }
}
