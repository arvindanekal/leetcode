public class Solution {
    public int trailingZeroes(int n) {
        long num = 5;
        long res = 0;
        while(num <= n){
            res += n/num;
            num *= 5;
        }
        return (int)res;
    }
}
