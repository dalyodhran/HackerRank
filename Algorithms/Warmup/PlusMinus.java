public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int positive = 0;
        int negative = 0;
        int zero = 0;

        DecimalFormat df = new DecimalFormat("0.000000");


        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                zero++;
            }

            if(arr[i] > 0){
                positive++;
            }

            if(arr[i] < 0) {
                negative++;
            }
        }

        double pos = (double)positive/arr.length;
        double neg = (double)negative/arr.length;
        double zer = (double)zero/arr.length;

        System.out.println(df.format(pos));
        System.out.println(df.format(neg));
        System.out.println(df.format(zer));

    }


}
