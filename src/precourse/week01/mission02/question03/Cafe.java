package precourse.week01.mission02.question03;

public class Cafe {

    String menu;
    Customer customer;

    Cafe(Customer customer, String menu) {
        this.customer = customer;
        this.menu = menu;
    }

    public int getCost(String menu) {
        if (menu.equals("아메리카노")) {
            return 4000;
        }
        if (menu.equals("라떼")) {
            return 5000;
        }
        return 0;
    }

    @Override
    public String toString() {
        return customer.name
                + "님의 남은 돈은 "
                + (customer.getMoney() - getCost(customer.getMenu()))
                + "원 입니다. "
                + customer.getCafeName()
                + "에서 "
                + customer.getMenu()
                + "를 마셨습니다.";
    }
}
