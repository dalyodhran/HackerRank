public class Solution {
    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
       DoublyLinkedList list = new DoublyLinkedList();
       list.insertNode(head.data);
       DoublyLinkedListNode node = list.head;

       while(head.next != null){
           head = head.next;

           DoublyLinkedListNode temp = new DoublyLinkedListNode(head.data);
           temp.next = node;
           temp.prev = null;
           node.prev = temp;
           node = temp;
       }
       return node;
   }
}
