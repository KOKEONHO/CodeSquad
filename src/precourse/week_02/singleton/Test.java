package precourse.week_02.singleton;

public class Test {
    public static void main(String[] args) {

        CarFactory factory = CarFactory.getInstance();

        Car k5 = factory.createCar();

        Car sonata = factory.createCar();

        System.out.println(k5.getCarNum());
        System.out.println(sonata.getCarNum());
    }
}
