package precourse.week_02.mission02.question02.real;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Car {

    String carNum;
    String carName;

    Car(String carName, String carNum) {
        this.carName = carName;
        this.carNum = carNum;
    }

    public void showCarNum() throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(carNum);
        bw.newLine();

        bw.flush();
        bw.close();     // 버퍼라이터를 닫아주면 showCarName 출력이 안 됨 (주석처리하면 잘 출력 됨)
    }

    public void showCarName() throws  IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(carName);
        bw.newLine();

        bw.flush();
        bw.close();
    }
}
