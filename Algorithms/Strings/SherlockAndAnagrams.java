public class Solution {

    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {
        int count = 0;

        List<String> subsets = new ArrayList<String>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 1; j <= s.length() - i; j++) {
                subsets.add(s.substring(i, i + j));
            }
        }

        for (int i = 0; i < subsets.size(); i++) {
            for (int j = i + 1; j < subsets.size(); j++) {
                String s1 = subsets.get(i);
                String s2 = subsets.get(j);
                if (i != j &&
                    s1.length() == s2.length() &&
                    isAnagram(s1, s2)) {
                    count++;
                }
            }
        }
        return count;

    }

    private static boolean isAnagram(String a, String b) {
        int []countA = new int[26];
        int []countB = new int[26];

        for (char c : a.toCharArray()) {
            countA[c - 'a']++;
        }

        for (char c : b.toCharArray()) {
            countB[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (countA[i] != countB[i]) {
                return false;
            }
        }

        return true;
    }
}
