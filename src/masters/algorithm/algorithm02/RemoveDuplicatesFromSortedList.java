package masters.algorithm.algorithm02;

public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {

        if (head.next == null) {
            return head;
        }
        ListNode listNode = new ListNode(head.val,null);
        ListNode pointer = head;
        while (true) {
            if (pointer.next == null) {
                break;
            }
            pointer = pointer.next;
            while (listNode.next != null) {
                listNode = listNode.next;
            }
            if (listNode.val == pointer.val) {
                continue;
            }
            listNode.next = pointer;
        }
        return listNode;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {

    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}