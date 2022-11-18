package precourse.week03.mission02.practice;

import java.io.BufferedWriter;
import java.io.IOException;

public class Printer {

    BufferedWriter bw;

    Printer(BufferedWriter bw) {
        this.bw = bw;
    }

    public void globalPrintln(String s) {
        try {
            bw.write(s);
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void globalPrint(String s) {
        try {
            bw.write(s);
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void globalNewLine() {
        try {
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
