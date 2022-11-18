package precourse.week03.mission01;

import java.io.BufferedReader;
import java.io.IOException;

public class Input {

    BufferedReader br;

    Input(BufferedReader br) {
        this.br = br;
    }

    public String globalInput() {
        String string = null;
        try {
            string = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return string;
    }
}
