public class Solution {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int[] val = new int[16];
        int a = 0;
        int x = 0;
        int y = 0;
        int z = 0;
        int sum = 0;
        int max = 0;
        do {
            for(int i = 0; i < 3; i++){
                sum += arr[y][x];

                x++;
            }
            sum += arr[++y][x-=2];


            x-=1;
            y++;

            for(int i = 0; i < 3; i++){
                sum += arr[y][x];

                x++;
            }

            if(x > arr.length - 1){
                x = 0;
                y = ++z;
            }else {
                x-=2;
                y = y - 2;
            }
            val[a++] = sum;
            sum = 0;
        }while(y < arr.length - 2);

        max = val[0];
        for(int i = 1; i < val.length; i++){
            if(max < val[i]){
                max = val[i];
            }
        }
        return max;
    }
}
