package precourse.week02.mission02.question02.real;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class CarExample {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Printer printer = new Printer(bw);

        Car myCar = new Car("스포티지", "53누5726");

        printer.globalPrintln(myCar.showCarInfo());
    }
}
