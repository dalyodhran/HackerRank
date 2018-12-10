public class Solution {

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) {
        int sumLR = 0;
        int sumRL = 0;

        int indexLR = 0;
        int indexRL = arr.length - 1;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(j == indexLR){
                    sumLR += arr[i][j];
                }
                if(j == indexRL){
                    sumRL += arr[i][j];
                }

            }
            indexLR++;
            indexRL--;
        }

        return Math.abs(sumLR - sumRL);
    }
}
