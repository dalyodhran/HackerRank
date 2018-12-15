public class Solution {

    // Complete the minimumNumber function below.
    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        List<Boolean> myList = new ArrayList<Boolean>();

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasSpecial = false;
        boolean hasNumber = false;

        String special_characters = "!@#$%^&*()-+";
        int num = 0;

        for(int i = 0; i < password.length(); i++){
            if(!hasUpper && password.charAt(i) >= 65 && password.charAt(i) <= 90){
                myList.add(true);
                hasUpper = true;
                System.out.println("True upper");
            }else if(!hasLower && password.charAt(i) >= 97 && password.charAt(i) <= 122){
                myList.add(true);
                hasLower = true;
                System.out.println("True lower");
            } else if(!hasNumber && password.charAt(i) >= 48 && password.charAt(i) <= 57){
                myList.add(true);
                hasNumber = true;
                System.out.println("True number");
            } else if(!hasSpecial && special_characters.contains(""+password.charAt(i))){
                myList.add(true);
                hasSpecial = true;
                System.out.println("True special");
            }
        }

         if(n > 5){
            myList.add(true);
            System.out.println("True size");
            return 5 - myList.size();
        } else {
            if((6 - n) > 4 - myList.size()){
                return (6 - n);
            } else {
                return (4 - myList.size());
            }
             //-
        }
    }
}
