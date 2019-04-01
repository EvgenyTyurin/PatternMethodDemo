package evgenyt.pattern_method_demo;

/**
 * Converts csv file to tag format
 */

class CsvToTagConverter extends FileConverter{
    @Override
    void fileOpen() {
        System.out.println("CSV file open...");
    }

    @Override
    void fileImport() {
        System.out.println("CSV file import...");
    }

    @Override
    void fileExport() {
        System.out.println("Tag file export...");
    }

    @Override
    void fileClose() {
        System.out.println("CSV file close...");
    }
}
