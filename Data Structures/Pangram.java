public class Solution {

    // Complete the pangrams function below.
    static String pangrams(String s) {
        Map<Character, Integer> myMap = new HashMap<Character, Integer>();

        s = s.toLowerCase();
        for(int i = 0; i < s.length(); i++){
            if(!myMap.containsKey(s.charAt(i))){
                System.out.println(s.charAt(i));
                myMap.put(s.charAt(i), 1);
            }
        }

        for(int i = 97; i <= 122; i++){
            if(!myMap.containsKey((char)i)){
                System.out.println(i);
                return "not pangram";
            }
        }

        return "pangram";

    }
}
