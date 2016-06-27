public class Solution {
    public boolean isPowerOfThree(int n) {
        double x = Math.log(n)/Math.log(3);
        if(Math.abs(Math.round(x) - x) < 0.00000000000001 ) return true;
        return false;
    }
}
