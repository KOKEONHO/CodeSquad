package precourse.week03.mission01;

public class DiamondMember extends Member {

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
