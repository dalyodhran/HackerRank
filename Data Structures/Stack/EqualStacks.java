import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the equalStacks function below.
     */
    static int equalStacks(int[] h1, int[] h2, int[] h3) {
        /*
         * Write your code here.
         */

        int stack = 0;

        h1 = reverse(h1);
        h2 = reverse(h2);
        h3 = reverse(h3);

        int [] h1Sort = getAddition(h1);
        int [] h2Sort = getAddition(h2);
        int [] h3Sort = getAddition(h3);

        Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();

        addElements(myMap, h1Sort);
        addElements(myMap, h2Sort);
        addElements(myMap, h3Sort);

        int key = 0;

        Iterator it = myMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            if((int)pair.getValue() == 3){
                if(key < (int)pair.getKey()){
                    stack = (int)pair.getKey();
                    key = (int)pair.getKey();
                }
            }
        }
        return stack;
    }

    static void addElements(Map<Integer, Integer> map, int [] arr){
        for(int i = 0; i < arr.length; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
    }

    static int[] getAddition(int [] arr){
        for(int i = 1; i < arr.length; i++){
            arr[i] = arr[i] + arr[i-1];
        }
        return arr;
    }

    static int[] reverse(int[] arr){
        int [] temp = new int[arr.length];
        int index = 0;
        for(int i = arr.length - 1; i >= 0; i--){
            temp[index] = arr[i];
            index++;
        }
        return temp;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] n1N2N3 = scanner.nextLine().split(" ");

        int n1 = Integer.parseInt(n1N2N3[0].trim());

        int n2 = Integer.parseInt(n1N2N3[1].trim());

        int n3 = Integer.parseInt(n1N2N3[2].trim());

        int[] h1 = new int[n1];

        String[] h1Items = scanner.nextLine().split(" ");

        for (int h1Itr = 0; h1Itr < n1; h1Itr++) {
            int h1Item = Integer.parseInt(h1Items[h1Itr].trim());
            h1[h1Itr] = h1Item;
        }

        int[] h2 = new int[n2];

        String[] h2Items = scanner.nextLine().split(" ");

        for (int h2Itr = 0; h2Itr < n2; h2Itr++) {
            int h2Item = Integer.parseInt(h2Items[h2Itr].trim());
            h2[h2Itr] = h2Item;
        }

        int[] h3 = new int[n3];

        String[] h3Items = scanner.nextLine().split(" ");

        for (int h3Itr = 0; h3Itr < n3; h3Itr++) {
            int h3Item = Integer.parseInt(h3Items[h3Itr].trim());
            h3[h3Itr] = h3Item;
        }

        int result = equalStacks(h1, h2, h3);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
