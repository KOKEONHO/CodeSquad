package precourse.week02.mission02.question02.real;

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
