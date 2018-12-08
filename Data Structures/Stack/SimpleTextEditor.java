import java.io.*;
import java.util.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        StringBuilder str = new StringBuilder("");
        int n = Integer.parseInt(scanner.nextLine().trim());
        Stack<String[]> stk = new Stack<String[]>();

        for(int i = 0; i < n; i++){
            String[] operation = scanner.nextLine().split(" ");
            switch (Integer.parseInt(operation[0])){
                case 1:
                    str.append(operation[1]);
                    stk.push(operation);
                break;
                case 2:
                    String remove = str.substring((str.length() - Integer.parseInt(operation[1])));
                    str.delete((str.length() - Integer.parseInt(operation[1])), str.length());
                    operation[1] = remove;
                    stk.push(operation);
                break;
                case 3:
                    System.out.println(str.charAt(Integer.parseInt(operation[1]) - 1));
                break;
                case 4:

                    String[] op = stk.pop();


                    switch(Integer.parseInt(op[0])){
                        case 1:
                            int size = op[1].length();
                            str.delete((str.length() - size), str.length());
                        break;
                        case 2:
                            str.append(op[1]);
                        break;
                    }

                break;
            }
        }
    }
}
