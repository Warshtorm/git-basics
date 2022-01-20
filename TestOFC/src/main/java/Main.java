public class Main {
    private static final String PTV_DATA_FILE = "src/main/resources/ptv.json";
    private static final String SUOT_DATA_FILE = "src/main/resources/suot.json";

    public static void main(String[] args) {
        Parser parser = new Parser();
        parser.getJsonFile(PTV_DATA_FILE);
    }
}
