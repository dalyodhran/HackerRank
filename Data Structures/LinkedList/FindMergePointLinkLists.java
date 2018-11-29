public class Solution {
    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        HashSet<SinglyLinkedListNode> mySet = new HashSet<SinglyLinkedListNode>();

        while (head1 != null){
            mySet.add(head1);
            head1 = head1.next;
        }

        while(head2 != null){
            if(mySet.contains(head2))
                break;
            head2 = head2.next;
        }

        return head2.data;
    }
}
