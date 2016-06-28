public class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int oldx = x;
        while(x>0){
            rev = rev*10 + x%10;
            x /= 10;
        }
        return rev == oldx;
    }
}
