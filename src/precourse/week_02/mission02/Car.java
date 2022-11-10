package precourse.week_02.mission02;

public class Car {

    private static int carNum = 1000;
    private static int carNumber;

    Car() {
        carNumber = carNum;
        this.carNum++;
    }

    public int showCarNumber() {
        return this.carNumber;
    }
}
