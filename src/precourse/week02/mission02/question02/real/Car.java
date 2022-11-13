package precourse.week02.mission02.question02.real;

import java.io.BufferedWriter;
import java.io.IOException;

public class Car {

    private BufferedWriter bw;
    String carName;
    String carNum;

    Car(BufferedWriter bw, String carName, String carNum) {
        this.bw = bw;
        this.carName = carName;
        this.carNum = carNum;
    }


}
