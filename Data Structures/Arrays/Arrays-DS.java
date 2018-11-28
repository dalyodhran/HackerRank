public class Solution {

    // Complete the reverseArray function below.
    static int[] reverseArray(int[] a) {
        int [] temp = new int[a.length];
        int index = 0;
        for(int i = a.length - 1; i >= 0; i--){
            temp[index] = a[i];
            index++;
        }
        return temp;
    }
}
