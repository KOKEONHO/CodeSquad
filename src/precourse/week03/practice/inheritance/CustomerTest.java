package precourse.week03.practice.inheritance;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class CustomerTest {
    public static void main(String[] args) {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Printer printer = new Printer(bw);


    }
}
