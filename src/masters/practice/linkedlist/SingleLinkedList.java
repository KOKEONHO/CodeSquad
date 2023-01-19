package masters.practice.linkedlist;

public class SingleLinkedList<Integer> {

    public Node<Integer> head = null;

    public void addNode(Integer data) {
        if (head == null) {
            head = new Node<>(data);
            return;
        }
        Node<Integer> node = head;
        while (node.next != null) {
            node = node.next;       // 현재 node를 다음 node로 지정
        }
        node.next = new Node<>(data);
    }

    public void printAll() {
        if (head == null) {
            System.out.println("List is empty !!");
            return;
        }
        Node<Integer> node = head;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
}
