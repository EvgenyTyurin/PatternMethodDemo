package evgenyt.pattern_method_demo;

/**
 * Pattern for file format conversion
 */

abstract class FileConverter {
    abstract void fileOpen();
    abstract void fileImport();
    abstract void fileExport();
    abstract void fileClose();
    void convert() {
        fileOpen();
        fileImport();
        fileExport();
        fileClose();
    }
}
