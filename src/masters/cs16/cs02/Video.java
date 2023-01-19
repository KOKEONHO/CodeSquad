package masters.cs16.cs02;

public class Video {

    String id;
    String title;
    int videoLength;
    Video nextVideo = null;

    public Video(String id, String title, int videoLength) {
        this.id = id;
        this.title = title;
        this.videoLength = videoLength;
    }
}
