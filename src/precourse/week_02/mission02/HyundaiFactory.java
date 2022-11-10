package precourse.week_02.mission02;

public class HyundaiFactory {

    HyundaiFactory() {

    }

    public static HyundaiFactory getFactory() {
        HyundaiFactory factory = new HyundaiFactory();
        return factory;
    }

    public static Car createCar() {
        Car car = new Car();
        return car;
    }
}
