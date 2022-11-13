package precourse.week_02.mission02.inputpractice;

import java.util.StringTokenizer;

public class Car {

    private String carNum;
    private String carName;

    Print print = new Print();

    Car() {
    }

    public void setCarInfo() {
        print.globalPrint("차 정보 입력: ");
        Input input = new Input();
        String carInfo = input.globalInput();
        StringTokenizer st = new StringTokenizer(carInfo);
        carNum = st.nextToken();
        carName = st.nextToken();
    }

    public void showCarInfo() {
        print.globalPrint("차 번호: " + carNum);
        print.globalPrintln();
        print.globalPrint("차 이름: "+carName);
    }
}
