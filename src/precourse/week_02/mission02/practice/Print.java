package precourse.week_02.mission02.practice;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Print {

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void globalPrintln(String string) {
        try {
            bw.write(string);
//            bw.newLine();
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void globalPrintln()   {
        try {
            bw.newLine();
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
