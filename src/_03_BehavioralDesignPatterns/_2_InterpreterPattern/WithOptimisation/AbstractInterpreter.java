package _03_BehavioralDesignPatterns._2_InterpreterPattern.WithOptimisation;

import _03_BehavioralDesignPatterns._2_InterpreterPattern.WithoutOptimisation.Context;

interface AbstractInterpreter {
    int interpreter(Context context);
}
