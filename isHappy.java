public class Solution {
    public boolean isHappy(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(n);
        while(n!=1){
            int sum = 0;
            while(n>0){
                int d = n%10;
                sum += d*d;
                n=n/10;
            }
            n = sum;
            if(list.contains(n)) return false;
            list.add(n);
        }
        return true;
    }
}
