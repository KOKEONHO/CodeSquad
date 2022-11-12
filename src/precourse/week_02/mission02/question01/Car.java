package precourse.week_02.mission02.question01;

public class Car {

    private int carNum;     // 자동차 제조 번호

    Car() {

    }               // 기본 생성자

    public void setCarNum(int carNum) {
        this.carNum = carNum;
    }

    public int showCarNum() {
        return carNum;
    }
}
