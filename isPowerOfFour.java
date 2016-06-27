public class Solution {
    public boolean isPowerOfFour(int num) {
        double x = Math.log(num)/Math.log(4);
        if(Math.abs(Math.round(x) - x) < 0.00000000000001 ) return true;
        return false;
    }
}
