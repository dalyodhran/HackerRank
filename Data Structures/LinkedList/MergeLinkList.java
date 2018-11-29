public class Solution {
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedList node = new SinglyLinkedList();

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                node.insertNode(head1.data);
                head1 = head1.next;
            } else {
                node.insertNode(head2.data);
                head2 = head2.next;
            }
        }

        if(head1 == null){
            node.tail.next = head2;
        }

        if(head2 == null){
            node.tail.next = head1;
        }


        return node.head;

    }
}
