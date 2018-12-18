public class Solution {

    // Complete the hackerrankInString function below.
    static String hackerrankInString(String s) {
        String check = "hackerrank";
        int sIndex = 0;
        int cIndex = 0;

        while(sIndex < s.length() && cIndex < check.length()){
            if(s.charAt(sIndex) == check.charAt(cIndex)){
                cIndex++;
                //sIndex++;
            }
            sIndex++;
        }

        System.out.println(cIndex);
        System.out.println(sIndex);

        if(cIndex == check.length() ){
            return "YES";
        } else {
            return "NO";
        }

    }
}
