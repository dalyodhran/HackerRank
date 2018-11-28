public class Solution {

    // Complete the dynamicArray function below.
    static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        List<List<Integer>> nSeq = new ArrayList<>();
        List<Integer> temp;
        List<Integer> tempSeq;
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < n; i++){
            nSeq.add(new ArrayList<Integer>());
        }

        int lastAnswer = 0;

        for(int i = 0; i < queries.size(); i++){

            temp = queries.get(i);

            if(temp.get(0) == 1){

                int seq = ((temp.get(1) ^ lastAnswer) % n);
                tempSeq = nSeq.get(seq);
                tempSeq.add(temp.get(2));
                //lastAnswer = 0;

            }else if(temp.get(0) == 2){

                int seq = ((temp.get(1) ^ lastAnswer) % n);
                tempSeq = nSeq.get(seq);
                lastAnswer = tempSeq.get((temp.get(2) % tempSeq.size()));
                result.add(lastAnswer);
                // if(seq == 0){
                //     lastAnswer = seq1.get((temp.get(2) % seq1.size()));
                //     result.add(lastAnswer);
                // }else {

                //     lastAnswer = seq2.get((temp.get(2) % seq2.size()));
                //     result.add(lastAnswer);
                // }
            }else {
                //Throw new IllegalStateArgument("Incorrect seq number");
            }
        }
        return result;

    }
}
