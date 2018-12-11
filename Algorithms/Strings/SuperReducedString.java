public class Solution {

    // Complete the superReducedString function below.
    static String superReducedString(String s) {
        StringBuilder str = new StringBuilder(s);
        boolean isDup = true;
        while(isDup){
            isDup = false;
            for(int i = 1; i < str.length(); i++){
                if(str.charAt(i - 1) == str.charAt(i)){
                    str.delete((i-1), i+1);
                    isDup = true;
                }
            }
        }
        if(str.length() > 0)
            return str.toString();
        else
            return "Empty String";
    }
}
