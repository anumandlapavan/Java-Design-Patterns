package _03_BehavioralDesignPatterns._03_CommandPattern;

import java.util.Stack;

public class MyRemoteControl__Invoker {
    Stack<ICommand> commandHistoryStack = new Stack<>();
    Stack<ICommand> redoStack = new Stack<>();

    private ICommand iCommand;

    public void setCommand(ICommand iCommand) {
        this.iCommand = iCommand;
    }

    public void pressButton() {
        if (iCommand != null) {
            iCommand.execute();
            commandHistoryStack.push(iCommand);
            redoStack.clear();
        }
    }

    public void undo() {
        if (!commandHistoryStack.isEmpty()) {
            iCommand = commandHistoryStack.pop();
            iCommand.undo();
            redoStack.push(iCommand);
        } else {
            System.out.println("No commands to undo!");
        }
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            iCommand = redoStack.pop();
            iCommand.redo();
            commandHistoryStack.push(iCommand);
        } else {
            System.out.println("No commands to redo!");
        }
    }
}
