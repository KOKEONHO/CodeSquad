package masters.cs16.cs02;

public class Application {
    public static void main(String[] args) {

        RandomIdGenerator randomIdGenerator = new RandomIdGenerator();
        RandomVideoLengthGenerator randomVideoLengthGenerator = new RandomVideoLengthGenerator();

        SingleLinkedList<Video> videoSingleLinkedList = new SingleLinkedList<>();

        String id, title;
        int videoLength;

        videoSingleLinkedList.startCreatingClip();
        for (int i = 0; i < 13; i++) {
            id = randomIdGenerator.generateRandomId();
            title = "제목" + String.format("%02d", i + 1);
            videoLength = randomVideoLengthGenerator.generateVideoLength();
            Video video = new Video(id, title, videoLength);
            videoSingleLinkedList.addVideo(video);
        }
        videoSingleLinkedList.showAll();


    }
}
