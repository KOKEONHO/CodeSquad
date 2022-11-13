package precourse.week01.mission02.question03;

public class Customer {

    public String name;
    public int money;   // 구매자가 가지고 있던 금액
    public String cafeName; // 구매자가 간 카페
    public String menu; // 구매자가 마시려는 음료

    Customer(String name, int money, String cafeName, String menu) {
        this.name = name;
        this.money = money;
        this.cafeName = cafeName;
        this.menu = menu;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public String getCafeName() {
        return cafeName;
    }

    public String getMenu() {
        return menu;
    }
}
