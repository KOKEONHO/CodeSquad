package precourse.week_01.shine;

import java.io.BufferedWriter;
import java.io.IOException;

public class GlobalPrintln {

    BufferedWriter bw;

    GlobalPrintln(BufferedWriter bw) {
        this.bw = bw;
    }

    public void globalPrintln(String string) {
        try {
            bw.write(string);
            bw.flush();
            bw.close();
        } catch(IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}
