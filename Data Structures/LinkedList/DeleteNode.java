public class Solution {
    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        SinglyLinkedListNode firstHead = head;
        SinglyLinkedListNode before = null;
        SinglyLinkedListNode after = null;
        if(position < 1){
            firstHead = head.next;
        } else {
            for(int i = 0; i < position; i++){
                if(i == position - 1){
                    before = head;
                }
                head = head.next;
            }

            after = head.next;

            before.next = after;
        }

        return firstHead;

    }
}
