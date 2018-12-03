import java.io.*;
import java.util.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Stack<Integer> stk = new Stack<Integer>();
        Stack<Integer> maxStk = new Stack<Integer>();

        int n = Integer.parseInt(scanner.nextLine().trim());

        for(int i = 0; i < n; i++){
            String[] operation = scanner.nextLine().split(" ");

            switch (Integer.parseInt(operation[0])){
                case 1:
                    int num = Integer.parseInt(operation[1]);
                    stk.push(num);
                    if(maxStk.isEmpty() || num >= maxStk.peek()) {
                        maxStk.push(num);
                    }
                break;
                case 2:
                    int pop = stk.pop();
                    if(pop == maxStk.peek())
                        maxStk.pop();

                break;
                case 3:
                    System.out.println(maxStk.peek());
                break;
            }
        }

    }
}
