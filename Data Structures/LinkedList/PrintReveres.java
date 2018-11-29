public class Solution {
    static void reversePrint(SinglyLinkedListNode head) {
        if(head.next != null){
            reversePrint(head.next);
        }
        System.out.println(head.data);
    }
}
