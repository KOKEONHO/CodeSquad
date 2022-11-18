package precourse.week03.mission01;

import java.io.*;

public class FileExample {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedWriter fw;

        Input input = new Input(br);                // Input 객체를 main에서 생성
        Printer printer = new Printer(bw);          // Printer 객체를 main에서 생성

        File file = new File(input, printer);                     // File 객체 생성

    }
}
