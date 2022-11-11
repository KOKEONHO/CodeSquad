package precourse.week_02.mission02;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class CarTest {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HyundaiFactory factory = HyundaiFactory.getFactory();

        Car myCar = factory.createCar();
        Car yourCar = factory.createCar();

        bw.write("첫번째 차 번호는 " + myCar.showCarNum());
        bw.newLine();
        bw.write("두번째 차 번호는 " + yourCar.showCarNum());
        bw.newLine();

        bw.flush();
        bw.close();
    }
}
