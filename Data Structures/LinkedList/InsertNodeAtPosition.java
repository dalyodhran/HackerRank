public class Solution {
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode firstHead = head;
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        for(int i = 0; i < position - 1; i++){
            head = head.next;
        }

        SinglyLinkedListNode temp = head.next;
        head.next = node;
        node.next = temp;
        return firstHead;

    }
}
