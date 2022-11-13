package precourse.week02.mission02.inputpractice;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Print {

    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public void globalPrint(String string) {
        try {
            bw.write(string);
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void globalPrintln(String string) {
        try {
            bw.write(string);
            bw.newLine();
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void globalPrintln()   {
        try {
            bw.newLine();
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
