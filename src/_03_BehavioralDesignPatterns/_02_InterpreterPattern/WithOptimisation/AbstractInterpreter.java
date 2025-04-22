package _03_BehavioralDesignPatterns._02_InterpreterPattern.WithOptimisation;

import _03_BehavioralDesignPatterns._02_InterpreterPattern.WithoutOptimisation.Context;

interface AbstractInterpreter {
    int interpreter(Context context);
}
