public class Solution {
    static boolean hasCycle(SinglyLinkedListNode head) {
        if(head == null)
            return false;

        HashSet<SinglyLinkedListNode> mySet = new HashSet<SinglyLinkedListNode>();
        while(head != null){
            if(mySet.contains(head))
                return true;

            mySet.add(head);
            head = head.next;
        }

        return false;
    }
}
