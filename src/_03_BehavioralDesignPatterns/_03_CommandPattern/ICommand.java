package _03_BehavioralDesignPatterns._03_CommandPattern;

interface ICommand {
    public void execute();

    public void undo();

    public void redo();
}
