public class Solution {
    static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
        SinglyLinkedList temp = new SinglyLinkedList();
        SinglyLinkedListNode node = head.next;


        while(head.next != null){
            if(head.data == head.next.data){
                if(head.next != null){
                    head = head.next;
                }
            }else {
                temp.insertNode(head.data);
                if(head.next != null){
                    head = head.next;
                }
            }
        }

        if(head != null){
            // if(head.data != temp.tail.data){
                temp.insertNode(head.data);
            // }
        }

        return temp.head;
    }
}
