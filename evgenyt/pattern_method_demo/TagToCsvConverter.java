package evgenyt.pattern_method_demo;

/**
 * Converts tag file to csv format
 */

class TagToCsvConverter extends FileConverter {
    @Override
    void fileOpen() {
        System.out.println("Tag file open...");
    }

    @Override
    void fileImport() {
        System.out.println("Tag file import...");
    }

    @Override
    void fileExport() {
        System.out.println("CSV file export...");
    }

    @Override
    void fileClose() {
        System.out.println("Tag file closed...");
    }
}
