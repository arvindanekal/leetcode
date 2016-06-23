public class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sarr = new int[26];
        int[] tarr = new int[26];
        Arrays.fill(sarr, 0);
        Arrays.fill(tarr, 0);
        int avalue = (int)'a';
        if(s.length() != t.length()) return false;

        for(int i=0;i<s.length();i++){
            sarr[(int)s.charAt(i)-avalue]++;
            tarr[(int)t.charAt(i)-avalue]++;
        }

        for(int i=0;i<26;i++){
            if(sarr[i] != tarr[i])
                return false;
        }
        return true;
    }
}
