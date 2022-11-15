package precourse.week03.mission01;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class FileExample {
    public static void main(String[] args) {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Printer printer = new Printer(bw);


    }
}
