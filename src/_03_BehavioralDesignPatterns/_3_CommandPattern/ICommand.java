package _03_BehavioralDesignPatterns._3_CommandPattern;

interface ICommand {
    public void execute();

    public void undo();

    public void redo();
}
