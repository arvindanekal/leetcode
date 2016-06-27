public class Solution {
    public boolean isPowerOfTwo(int n) {
        double x = Math.log(n)/Math.log(2);
        if(Math.abs(Math.round(x) - x) < 0.00000000000001 ) return true;
        return false;
    }
}
