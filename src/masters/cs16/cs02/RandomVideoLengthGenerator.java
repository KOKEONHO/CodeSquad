package masters.cs16.cs02;

import java.util.Random;

public class RandomVideoLengthGenerator {

    public int generateVideoLength() {

        Random random = new Random();
        return random.nextInt(16) + 1;
    }
}
