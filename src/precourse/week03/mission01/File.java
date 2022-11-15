package precourse.week03.mission01;

public class File {

    String fileName = null;
    String directory = null;

    Printer printer;

    File(Printer printer) {
        this.printer = printer;
    }

    public void createFile(Printer printer) {
        printer.globalPrintln("파일 생성 시작 !!");
    }
}
