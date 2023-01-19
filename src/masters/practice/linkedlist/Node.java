package masters.practice.linkedlist;

public class Node<Integer> {

    Integer data;

    Node<Integer> next = null;        // 다음 객체를 저장하는 필드

    public Node(Integer data) {
        this.data = data;
    }
}
