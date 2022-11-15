package precourse.week03.mission01;

public class Member {

    protected String customerName;          // 고객 이름
    protected int shoppedCost;              // 쇼핑 금액
    protected int timeSpent;                // 머문 시간
    protected double discountRatio;         // 할인률
    protected int parkingFee;               // 주차 요금 (시간당)
    protected double pointRatio;            // 포인트 적립률
    protected boolean personalConsultant;   // 전문 상담원 배정 여부
    protected String information;           // 조합하여 넘겨줄 String

    public String showCustomerInfo() {
        return information;
    }
}

class RedMember extends Member {

    RedMember(String customerName, int shoppedCost, int timeSpent) {
        this.customerName = customerName;
        this.shoppedCost = shoppedCost;
        this.timeSpent = timeSpent;
        pointRatio = 0.01;
        parkingFee = 3000;
    }

    @Override
    public String showCustomerInfo() {
        information = customerName + "님의 지불 금액은 "
                + shoppedCost + " 원이고, 적립 포인트는 "
                + (int)(shoppedCost * pointRatio) + "점 입니다."
                + "\n주차 요금은 "
                + parkingFee * timeSpent + "원 입니다.";

        return information;
    }
}

class PlatinumMember extends Member {

    PlatinumMember(String customerName, int shoppedCost, int timeSpent) {
        this.customerName = customerName;
        this.shoppedCost = shoppedCost;
        this.timeSpent = timeSpent;
        discountRatio = 0.05;
        pointRatio = 0.05;
        parkingFee = 1000;
    }

    @Override
    public String showCustomerInfo() {
        information = customerName + "님의 지불 금액은 "
                + (shoppedCost - (int) (shoppedCost * discountRatio)) + " 원이고, 적립 포인트는 "
                + (int)(shoppedCost * pointRatio) + "점 입니다."
                + "\n주차 요금은 "
                + parkingFee * timeSpent + "원 입니다.";

        return information;
    }
}

class DiamondMember extends Member {

    DiamondMember(String customerName, int shoppedCost, int timeSpent) {
        this.customerName = customerName;
        this.shoppedCost = shoppedCost;
        this.timeSpent = timeSpent;
        discountRatio = 0.1;
        pointRatio = 0.1;
        parkingFee = 0;
        personalConsultant = true;
    }

    @Override
    public String showCustomerInfo() {
        information = customerName + "님의 지불 금액은 "
                + (shoppedCost - (int) (shoppedCost * discountRatio)) + " 원이고, 적립 포인트는 "
                + (int)(shoppedCost * pointRatio) + "점 입니다."
                + "\n주차 요금은 "
                + parkingFee * timeSpent + "원 입니다.";

        return information;
    }
}