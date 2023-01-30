package masters.cs16.cs07;

import java.util.regex.Pattern;

public class RegexPractice {
    public static void main(String[] args) {

        String text1 = "123123";
        String text2 = "123이것은숫자입니다00";

        boolean result = Pattern.matches("^[0-9]*$", text1);
        System.out.println(result);

        boolean result2 = Pattern.matches("^[0-9*$]", text2);
        System.out.println(result2);
    }
}
