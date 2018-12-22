public class Solution {

    // Complete the marsExploration function below.
    static int marsExploration(String s) {
        int count = 0;
        String check = "SOS";
        int index = 0;

        for(int i = 0; i < s.length(); i++){
            if(index > 0 && (index % 3) == 0){
                index = 0;
            }

            if(s.charAt(i) != check.charAt(index)){
                count++;
            }
            index++;
        }
        return count;
    }
}
