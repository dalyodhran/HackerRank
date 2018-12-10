public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        long max = 0;
        long min = 0;
        int skip = 0;
        long sum = 0;

        for(int x : arr){
            min += x;
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(j != skip){
                    sum += arr[j];
                }
            }
            if(sum > max){
                max = sum;
            }
            if(sum < min){
                min = sum;
            }
            sum = 0;
            skip++;
        }

        System.out.println(min + " " + max);
    }


}
