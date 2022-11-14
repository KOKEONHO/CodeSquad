package precourse.week02.mission02.question02;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Print {

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

    public void globalClose() {
        try {
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
