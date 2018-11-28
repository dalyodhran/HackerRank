public class Solution {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {

        long [] indexs = new long[n];
        long max = 0;
        long sum = 0;

        for(int i = 0; i < queries.length; i++){
            int start = queries[i][0] - 1;
            int end = queries[i][1] - 1;
            int num = queries[i][2];

            indexs[start] += num;
            if(end + 1 < n)
                indexs[end+1] -= num;
        }


        for (int i = 0; i < n; i++) {
            sum += indexs[i];
            max = Math.max(max, sum);
        }

        return max;
    }
}
