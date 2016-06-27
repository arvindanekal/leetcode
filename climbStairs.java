public class Solution {
    public int comb(int n, int r){
        if((n-r)==0) return 1;
        double prod = 1;
        double div = 1;
        for(int i=1;i<=r;i++){
            prod *= (n-i+1);
            div *= i;
        }
        return (int)Math.round(prod/div);
    }

    public int climbStairs(int n) {
        int count = 0;
        if(n==0) return 0;
        count++;
        for(int i=1;i<=n/2;i++){
            int val = comb(n-i, i);
            count += val;
        }
        return count;
    }
}
