public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().reverseString("Hello World!"));
    }

    public String reverseString(String s) {
        char[] res = new char[s.length()];
        for(int i=s.length()-1;i>=0;i--)
            res[s.length()-1-i] += s.charAt(i);
        return new String(res);
    }
}
