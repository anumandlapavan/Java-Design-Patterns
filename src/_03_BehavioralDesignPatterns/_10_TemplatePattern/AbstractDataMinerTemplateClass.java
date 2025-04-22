package _03_BehavioralDesignPatterns._10_TemplatePattern;

public abstract class AbstractDataMinerTemplateClass {
    public final void mineData(){
        openFile();
        readData();
        parseData();
        closeFile();
    }

    protected abstract void openFile();
    protected abstract void closeFile();
    protected abstract void readData();
    protected abstract void parseData();
}
