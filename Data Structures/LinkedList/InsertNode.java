public class Solution{
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
       if(llist == null){
           llist = new SinglyLinkedListNode(data);
       }else {
           SinglyLinkedListNode temp = llist;
           llist = new SinglyLinkedListNode(data);
           llist.next = temp;
       }
       return llist;
   }
}
