package _03_BehavioralDesignPatterns._10_TemplatePattern;

public class DatabaseConcreteClass extends AbstractDataMinerTemplateClass{
    @Override
    protected void openFile() {
        System.out.println("Connecting to database...");
    }

    @Override
    protected void readData() {
        System.out.println("Running SQL query...");
    }

    @Override
    protected void parseData() {
        System.out.println("Parsing database records...");
    }

    @Override
    protected void closeFile() {
        System.out.println("Closing database connection...");
    }
}
