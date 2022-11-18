package precourse.week03.mission01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class File {

    String fileName = null;
    String directory = null;

    Printer printer;
    Input input;

    File(Input input, Printer printer) {
        this.input = input;
        this.printer = printer;
    }

    public void createFile() {

        printer.globalPrintln("파일 생성 시작!!!");
        printer.globalPrint("파일 디렉토리 입력: ");
        directory = input.globalInput();

        printer.globalPrint("파일 이름 입력: ");
        fileName = input.globalInput();

        printer.globalPrintln("----- " + fileName + "에 입력할 내용을 적으십시오. -----");
        printer.globalPrintln("이름 / 학번 / 전공과목 / 국어 / 수학 / 영어 순서로 적으십시오.");
        printer.globalPrintln("입력을 종료하시려면 Exit 입력!!!");


    }
}
