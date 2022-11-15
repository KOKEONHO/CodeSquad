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
