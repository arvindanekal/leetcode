public class Solution {
    public int titleToNumber(String s) {
        int Avalue = (int)'A';
        int titlenum = 0;
        int pow = 0;
        for(int i=s.length()-1;i>=0;i--){
            titlenum += ((int)s.charAt(i)-Avalue+1)*Math.pow(26, pow);
            pow++;
        }
        return titlenum;
    }
}
