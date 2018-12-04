import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the waiter function below.
     */
    static int[] waiter(int[] number, int q) {
        /*
         * Write your code here.
         */
        List<Stack> stackList = new ArrayList<Stack>();

        Stack<Integer> init = new Stack<Integer>();
        Stack<Integer> prime = new Stack<Integer>();
        Stack<Integer> nonPrime = new Stack<Integer>();

        int [] orderPrim = number;

        int iterator = 1;
        int index = 0;

        for(int i = 0; i < orderPrim.length; i++){
            init.push(orderPrim[i]);
        }


        while(iterator-1 != q){
            prime = new Stack<Integer>();
            nonPrime = new Stack<Integer>();

            int primeInt = getNthPrime(iterator);

            while(!init.empty()){
                int num = init.pop();
                if(num % primeInt == 0){
                    prime.push(num);
                }else {
                    nonPrime.push(num);
                }
            }

            stackList.add(prime);
            init = nonPrime;
            iterator++;
        }

        for(int i = 0; i < stackList.size(); i++){
            Stack<Integer> temp = stackList.get(i);
            while(!temp.empty()){
                int n = temp.pop();
                orderPrim[index] = n;
                //System.out.println(n);
                index++;
            }
        }

        while(!nonPrime.empty()){
            int n = nonPrime.pop();
            orderPrim[index] = n;
            //System.out.println(n);
            index++;
        }

        return orderPrim;
    }

    static int getNthPrime(int n){
        int count = 0;
        int index = 1;
        while(count != n){
            index++;
            if(isPrime(index)){
                count++;
            }
        }
        return index;
    }

    static boolean isPrime(int n){
        if(n < 2)
        return false;

        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nq = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nq[0].trim());

        int q = Integer.parseInt(nq[1].trim());

        int[] number = new int[n];

        String[] numberItems = scanner.nextLine().split(" ");

        for (int numberItr = 0; numberItr < n; numberItr++) {
            int numberItem = Integer.parseInt(numberItems[numberItr].trim());
            number[numberItr] = numberItem;
        }

        int[] result = waiter(number, q);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bufferedWriter.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
