public class Solution {

    // Complete the matchingStrings function below.
    static int[] matchingStrings(String[] strings, String[] queries) {
        Map<String, Integer> myMap = new HashMap<>();
        int [] results = new int[queries.length];

        for(int i = 0; i < strings.length; i++){
            if(!myMap.containsKey(strings[i]))
                myMap.put(strings[i], 1);
            else
                myMap.put(strings[i], (myMap.get(strings[i]) + 1));
        }

        for(int i = 0; i < queries.length; i++){
            if(!myMap.containsKey(queries[i]))
                results[i] = 0;
            else
                results[i] = myMap.get(queries[i]);
        }

        return results;
    }
}
