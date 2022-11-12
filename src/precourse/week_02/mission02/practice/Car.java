package precourse.week_02.mission02.practice;

import java.util.StringTokenizer;

public class Car {

    private int carNum;
    private String carName;

    Car() {}

    public void setCarInfo() {
        Print.globalPrintln("차 정보 입력: ");
        String carInfo = Input.globalInput();
        StringTokenizer st = new StringTokenizer(carInfo);
        carNum = Integer.parseInt(st.nextToken());
        carName = st.nextToken();
    }

    public void showCarInfo() {
        Print.globalPrintln("차 번호: " + carNum);
        Print.globalPrintln();
        Print.globalPrintln("차 이름: "+carName);
    }
}
