package precourse.week_02.mission02.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Input {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static String globalInput() {
        String string = null;
        try {
            string = br.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return string;
        }
    }
}
