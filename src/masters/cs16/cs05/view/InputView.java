package masters.cs16.cs05.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public String globalReadLine() {
        String input = "";
        try {
            input = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return input;
    }
}
