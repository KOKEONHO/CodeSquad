package precourse.week02.singleton;

public class CarFactory {
    private static CarFactory instance = new CarFactory();
    private CarFactory() {};
    private static int serialNum = 10001;

    public Car createCar() {
        Car temp = new Car();
        temp.setCarNum(serialNum);
        serialNum++;
        return temp;
    }

    public static CarFactory getInstance() {
        if(instance == null) {
            return new CarFactory();
        }
        return instance;
    }
}