public class Solution {
    public static Node insert(Node root,int data) {
        Node newNode = new Node(data);
        if (root == null)
            return newNode;

        addNode(root, newNode);
        return root;
    }

    static void addNode(Node root, Node newNode) {
        if (newNode.data < root.data) {
            if (root.left == null) {
                root.left = newNode;
            } else
                addNode(root.left, newNode);
        } else {
            if (root.right == null)
                root.right = newNode;
            else
                addNode(root.right, newNode);
        }
    }


}
