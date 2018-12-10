public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */


        String [] time = s.split(":");
        if(Integer.parseInt(time[0]) == 12){
            if(time[2].charAt(2) == 'P'){
                return s.substring(0, s.length() - 2);
            }else {
                return "00:" + time[1] + ":" + time[2].substring(0,2);
            }
        }

        if(time[2].charAt(2) == 'P'){
            int t = Integer.parseInt(time[0]) + 12;
            time[0] = String.valueOf(t);
            return time[0] + ":" + time[1] + ":" + time[2].substring(0,2);
        }

        return s.substring(0, s.length() - 2);
    }
}
