package masters.cs16.cs02;

public class SingleLinkedList<T> {

    public Video head = null;

    public void startCreatingClip() {
        System.out.println("--- 영상클립 생성 ---");
    }

    public void addVideo(Video video) {
        if (head == null) {
            head = video;
            return;
        }
        Video node = head;
        while (node.nextVideo != null) {
            node = node.nextVideo;
        }
        node.nextVideo = video;
    }

    public void showAll() {
        if (head == null) {
            System.out.println("List is empty !!!!");
            return;
        }
        Video node = head;
        while (node != null) {
            System.out.println(node.title+"("+node.id+"):"+ node.videoLength+"초");
            node = node.nextVideo;
        }
    }
}
