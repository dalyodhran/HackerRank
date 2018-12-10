public class Solution {

    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
        Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
        int max = 0;

        for(int i = 0; i < ar.length; i++){
            if(max < ar[i]){
                max = ar[i];
            }
            if(!myMap.containsKey(ar[i])){
                myMap.put(ar[i], 1);
            }else {
                myMap.put(ar[i], myMap.get(ar[i]) + 1);
            }
        }

        return myMap.get(max);

    }

}
