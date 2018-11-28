public class Solution {

    private static int[] leftRotation(int n, int[] a){
        int[] temp = new int[a.length];

        for(int i = 0; i < a.length; i++){
            int pos = (((i + a.length) - n) % a.length);
            temp[pos] = a[i];
        }

        return temp;
    }
}
