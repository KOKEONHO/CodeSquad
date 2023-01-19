package masters.cs16.cs02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public String globalReadLine() {
        String string = null;
        try {
            string = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return string;
    }

}
