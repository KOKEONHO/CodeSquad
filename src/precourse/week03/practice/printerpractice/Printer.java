package precourse.week03.practice.printerpractice;

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

    public void globalClose() {
        try {
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
