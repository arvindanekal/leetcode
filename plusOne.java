public class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> list = new ArrayList<Integer>();
        int c = 1;
        for(int i=digits.length-1;i>=0;i--){
            int d = (digits[i]+c)%10;
            c = (digits[i]+c)/10;
            list.add(0, d);
        }
        if(c>0){
            list.add(0, c);
        }
        int[] result = new int[list.size()];
        for(int i=0;i<list.size();i++)
            result[i] = list.get(i);
        return result;
    }
}
