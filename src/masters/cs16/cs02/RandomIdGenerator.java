package masters.cs16.cs02;

import java.util.ArrayList;
import java.util.UUID;

public class RandomIdGenerator {

    ArrayList<String> videoIdList = new ArrayList<>();

    public String generateRandomId() {
        String id;
        while (true) {
            id = UUID.randomUUID().toString();
            id = id.substring(0, 8);
            if (checkIdRepetition(id)) {
                break;
            }
        }
        videoIdList.add(id);
        return id;
    }

    private boolean checkIdRepetition(String id) {
        if (videoIdList.contains(id)) {
            return false;
        }
        return true;
    }

    public void showIdList() {
        for (int i = 0; i < videoIdList.size(); i++) {
            System.out.println(videoIdList.get(i).toString());
        }
    }
}
