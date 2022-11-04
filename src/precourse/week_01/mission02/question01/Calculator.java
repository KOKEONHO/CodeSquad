package precourse.week_01.mission02.question01;

public class Calculator {

    Number number = new Number();   // Number 객체 생성

    public int sum() {
        return number.getTen() + number.getTen();
    }

    public int subtract() {
        return number.getTen() - number.getTwo();
    }

    public int divide() {
        return number.getTen() / number.getTwo();
    }

    public int multiply() {
        return number.getTen() * number.getTwo();
    }
}
