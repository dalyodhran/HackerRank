public class Solution{
    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(head.data);
        SinglyLinkedListNode newest = null;



        while(head.next != null){
            newest = new SinglyLinkedListNode(head.next.data);
            newest.next = node;
            node = newest;
            head = head.next;
        }



        return node;
    }
}
