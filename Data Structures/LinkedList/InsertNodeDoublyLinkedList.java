public class Solution {
    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
        DoublyLinkedListNode node = new DoublyLinkedListNode(data);
        DoublyLinkedListNode temp = head;
        boolean isInserted = false;

        if(head.data > data){
            node.next = head;
            node.prev = null;
            head.prev = node;
            head = node;
            isInserted = true;
        }

        while(!isInserted & temp.next != null){
            temp = temp.next;
            if(temp.data > data){
                DoublyLinkedListNode prev = temp.prev;
                prev.next = node;
                node.next = temp;

                temp.prev = node;
                node.prev = prev;

                isInserted = true;

            }

        }

        if(!isInserted){
            node.prev = temp;
            temp.next = node;
            node.next = null;
        }
        return head;

    }
}
