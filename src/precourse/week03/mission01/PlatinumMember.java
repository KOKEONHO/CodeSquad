package precourse.week03.mission01;

public class PlatinumMember extends Member {

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
