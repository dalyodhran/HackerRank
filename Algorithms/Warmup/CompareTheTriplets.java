public class Solution {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> myList = new ArrayList<Integer>();
        int apoint = 0;
        int bpoint = 0;

        for(int i = 0; i < a.size(); i++){
            if(a.get(i) == b.get(i)){
                continue;
            }

            if(a.get(i) > b.get(i)){
                apoint++;
            }else {
                bpoint++;
            }
        }

        myList.add(apoint);
        myList.add(bpoint);
        return myList;
    }
}
