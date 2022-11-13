package precourse.week02.mission01.presentation;

public class Recursion {
    public static void main(String[] args) {

        int number = 0;
        recursion(number);

    }

    public static void recursion(int num) {

        if (num < 10) {
            System.out.println(num);
            recursion(num + 1);
        } else {
            System.out.println("끝" + num);
        }
    }
}
