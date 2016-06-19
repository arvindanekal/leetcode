public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().canWinNim(7));
    }

    public boolean canWinNim(int n) {
        if(n%4 == 0) return false;
        return true;
    }
}
