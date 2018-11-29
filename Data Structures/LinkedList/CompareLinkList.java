public class Solution {
    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        boolean isMatch = false;
        while(head1 != null && head2 != null){
            if(head1.data != head2.data){
                return isMatch;
            }
            head1 = head1.next;
            head2 = head2.next;
        }

        if(head1 != null){
            return isMatch;
        }

        if(head2 != null){
            return isMatch;
        }

        isMatch = true;
        return isMatch;

    }
}
