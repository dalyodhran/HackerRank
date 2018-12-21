public class Solution {

    // Complete the caesarCipher function below.
    static String caesarCipher(String s, int k) {

        StringBuilder str = new StringBuilder("");

        for(int i = 0; i < s.length(); i++){
            int a = (int)s.charAt(i);

            if(a >= 65 && a <= 90){
                a -= 65;
                int t = (((a + k) + 26) % 26);
                t += 65;
                str.append((char)t);
                System.out.println(t);
            }else if(a >= 97 && a <= 122){
                a -= 97;
                int t = (((a + k) + 26) % 26);
                t += 97;
                str.append((char)t);
                System.out.println(t);
            }else {
                str.append((char)a);
            }
        }
        return str.toString();
    }
}
