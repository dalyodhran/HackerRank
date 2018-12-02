public class Solution{
    boolean checkBST(Node root) {
        if(root == null)
            return true;

        List<Integer> list = new ArrayList<>();
        inOrder(root, list);

        for(int i = 1; i<list.size(); i++){
            if(list.get(i-1) >= list.get(i))
                return false;
        }

        return true;
    }

    void inOrder(Node root, List<Integer> list){
        if(root == null)
            return;
        inOrder(root.left, list);
        list.add(root.data);
        inOrder(root.right, list);
    }
}
