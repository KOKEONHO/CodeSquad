package precourse.week03.practice.printerpractice;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class CarExample {
    public static void main(String[] args) {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Printer printer = new Printer(bw);

        Car myCar = new Car("스포티지", "53누 5726");
        Car yourCar = new Car("G80", "58러 3484");

        printer.globalPrintln(myCar.showCarInfo());
        printer.globalPrintln(yourCar.showCarInfo());

        printer.globalClose();
    }
}
