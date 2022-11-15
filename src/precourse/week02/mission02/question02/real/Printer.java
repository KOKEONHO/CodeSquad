package precourse.week02.mission02.question02.real;

import java.io.BufferedWriter;
import java.io.IOException;

public class Printer {

    BufferedWriter bw;

    Printer(BufferedWriter bw) {
        this.bw = bw;
    }

    public void globalPrintln(String string) {
        try {
            bw.write(string);
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void globalPrint(String string) {
        try {
            bw.write(string);
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
