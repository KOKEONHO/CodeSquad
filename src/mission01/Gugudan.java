package mission01;

import java.io.*;

public class Gugudan {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("구구단 별 찍기");
        bw.newLine();
        bw.flush();

        for (int i = 2; i < 10; i++) {
            bw.write(i + "단 시작 !!");
            bw.newLine();
            for (int j = 1; j < 10; j++) {
                bw.write(i + " X " + j + " = " + i * j);
                bw.newLine();
            }
        }


        bw.close();
    }
}
