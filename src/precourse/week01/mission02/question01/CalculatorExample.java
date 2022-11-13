package precourse.week01.mission02.question01;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class CalculatorExample {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Calculator calculator = new Calculator();

        bw.write("덧셈: " + calculator.sum());
        bw.newLine();

        bw.write("뺄셈: "+calculator.subtract());
        bw.newLine();

        bw.write("곱셈: "+calculator.multiply());
        bw.newLine();

        bw.write("나눗셈: "+calculator.divide());
        bw.newLine();

        bw.flush();
        bw.close();
    }
}
