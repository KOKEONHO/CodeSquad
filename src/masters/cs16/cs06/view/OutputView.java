package masters.cs16.cs06.view;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputView {

    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

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

    public void globalNewLine() {
        try {
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
