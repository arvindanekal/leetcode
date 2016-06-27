public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        long n1 = n & 0xffffffffl;
        int count = 0;
        while(n1>0){
            if(n1%2==1) count++;
            n1=n1/2;
        }
        return count;
    }
}
