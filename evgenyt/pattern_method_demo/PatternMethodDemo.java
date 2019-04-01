package evgenyt.pattern_method_demo;

/**
 * Pattern method pattern demo
 * Mar 2019 Evgeny Tyurin
 *
 * We have a pattern to convert file from one format to another (FileConverter)
 * and concrete realizations for different formats (CsvToTagConverter and
 * TagToCsvConverter)
 */

public class PatternMethodDemo {
    /** Run point */
    public static void main(String[] args) {
        System.out.println("Converting tag file to csv format.");
        convertFile(new TagToCsvConverter());
        System.out.println("Converting csv file to tag format.");
        convertFile(new CsvToTagConverter());
    }

    /** Converts anything */
    private static void convertFile(FileConverter fileConverter) {
        fileConverter.convert();
    }

}
