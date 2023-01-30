package masters.cs16.cs06.view;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputView {

    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public void showInitializationMessage() {
        try {
            bw.write("체스 보드를 초기화했습니다.");
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void globalPrintln(String output) {
        try {
            bw.write(output);
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void globalPrint(String output) {
        try {
            bw.write(output);
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
