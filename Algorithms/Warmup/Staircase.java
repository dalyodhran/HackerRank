public class Solution {

    // Complete the staircase function below.
    static void staircase(int n) {
        int stair = n;
        for(int j = 0; j < n; j++){
            for(int i = 1; i <= n; i++){
                if(i >= stair){
                    System.out.print("#");
                }else {
                   System.out.print(" ");
                }
            }
            stair--;
            System.out.println();
        }

    }
}
