public class Solution {
    static void printLinkedList(SinglyLinkedListNode head) {
        if(head != null){
            do {
                System.out.println(head.data);
                head = head.next;
            } while(head != null);
        }
    }
}
