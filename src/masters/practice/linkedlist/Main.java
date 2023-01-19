package masters.practice.linkedlist;

public class Main {
    public static void main(String[] args) {

        SingleLinkedList<Integer> singleLinkedList = new SingleLinkedList<>();

        singleLinkedList.addNode(1);
        singleLinkedList.addNode(2);
        singleLinkedList.addNode(3);
        singleLinkedList.addNode(4);
        singleLinkedList.addNode(5);

        singleLinkedList.printAll();
    }
}
