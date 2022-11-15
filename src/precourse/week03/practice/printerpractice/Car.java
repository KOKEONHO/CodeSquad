package precourse.week03.practice.printerpractice;

public class Car {

    String carName;
    String carNum;

    Car(String carName, String carNum) {
        this.carName = carName;
        this.carNum = carNum;
    }

    public String showCarInfo() {
        return carNum + " / " + carName;
    }
}
