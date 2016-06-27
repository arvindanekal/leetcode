public class Solution {
    public String reverseVowels(String s) {
        
        List<Integer> pos = new ArrayList<Integer>();
        List<Character> chars = new ArrayList<Character>();
        for(int i=0;i<s.length();i++){
            if("aeiouAEIOU".indexOf(s.charAt(i))>=0){
                pos.add(i);
                chars.add(s.charAt(i));
            }
        }
        char[] sarr = s.toCharArray();
        for(int i=0;i<pos.size();i++){
            sarr[pos.get(i)] = chars.get(pos.size()-i-1);
        }
        return new String(sarr);
    }
}
