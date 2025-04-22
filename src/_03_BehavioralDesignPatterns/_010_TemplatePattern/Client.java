package _03_BehavioralDesignPatterns._10_TemplatePattern;

public class Client {
    public static void main(String[] args) {
        AbstractDataMinerTemplateClass dm = new CsvConcreteClass();
        dm.mineData();

        AbstractDataMinerTemplateClass dm2 = new DatabaseConcreteClass();
        dm2.mineData();
    }

}
