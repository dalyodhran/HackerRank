public class Solution{
    static int getNode(SinglyLinkedListNode head, int positionFromTail) {
        SinglyLinkedList node = new SinglyLinkedList();
        int size = 0;

        while(head != null){
            node.insertNode(head.data);
            head = head.next;
            size++;
        }


        for(int i = 1; i < size - positionFromTail; i++){
            if(node.head.next != null){
                node.head = node.head.next;
            }
        }



        return node.head.data;

    }
}
