public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> input = new ArrayList<>();
        input.add(1);
        while(rowIndex>0){
            List<Integer> output = new ArrayList<>();
            output.add(input.get(0));
            for(int i=1;i<input.size();i++){
                output.add(input.get(i-1)+input.get(i));
            }
            output.add(input.get(input.size()-1));
            input = output;
            rowIndex--;
        }
        return input;
    }
}
