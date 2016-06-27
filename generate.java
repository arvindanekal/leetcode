public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(numRows == 0) return result;
        List<Integer> input = new ArrayList<>();
        input.add(1);
        result.add(input);
        while(numRows>1){
            List<Integer> output = new ArrayList<>();
            output.add(input.get(0));
            for(int i=1;i<input.size();i++){
                output.add(input.get(i-1)+input.get(i));
            }
            output.add(input.get(input.size()-1));
            result.add(output);
            input = output;
            numRows--;
        }
        return result;
    }
}
