package precourse.week_02.mission02.question01;

public class HyundaiFactory {

    private static HyundaiFactory factory = new HyundaiFactory();

    private HyundaiFactory() {      // 생성자

    }

    private int serialNum = 1000;

    public Car createCar() {
        Car car = new Car();
        car.setCarNum(serialNum);
        serialNum++;
        return car;
    }

    public static HyundaiFactory getFactory() {
        if (factory == null) {
            return new HyundaiFactory();
        }
        return factory;
    }
}
