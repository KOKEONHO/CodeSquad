package precourse.week03.mission01;

public class RedMember extends Member {

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
                + shoppedCost + " 원이고, 적립 포인트는"
                + shoppedCost * pointRatio + "점 입니다."
                + "\n주차 요금은 "
                + parkingFee * timeSpent + "원 입니다.";

        return information;
    }
}
