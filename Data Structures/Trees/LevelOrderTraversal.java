public class Solution {
    public static void levelOrder(Node root) {
        Queue<Node> myQueue = new LinkedList<Node>();
        myQueue.add(root);

        while(!myQueue.isEmpty()){
            Node temp = myQueue.poll();
            System.out.print(temp.data + " ");
            if(temp.left != null){
                myQueue.add(temp.left);
            }
            if(temp.right != null){
                myQueue.add(temp.right);
            }
        }

    }
}
