package masters.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String string = "";
        while (!string.equals("exit")) {
            string = br.readLine();
            System.out.println(string);
        }
    }
}
