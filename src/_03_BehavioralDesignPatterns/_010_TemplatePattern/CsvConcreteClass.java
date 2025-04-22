package _03_BehavioralDesignPatterns._10_TemplatePattern;

public class CsvConcreteClass extends AbstractDataMinerTemplateClass{
    @Override
    protected void openFile() {
        System.out.println("Opening CSV file...");
    }

    @Override
    protected void readData() {
        System.out.println("Extracting data from CSV...");
    }

    @Override
    protected void parseData() {
        System.out.println("Parsing CSV data...");
    }

    @Override
    protected void closeFile() {
        System.out.println("Closing CSV file...");
    }
}
