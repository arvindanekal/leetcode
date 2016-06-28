public class Solution {
    public String getHint(String secret, String guess) {
        int b = 0;
        int a = 0;
        int[] digits_secret = new int[10];
        int[] digits_guess = new int[10];
        Arrays.fill(digits_secret, 0);
        Arrays.fill(digits_guess, 0);
        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i) == guess.charAt(i)){
                a++;
            }else{
            digits_secret[secret.charAt(i)-'0']++;
            digits_guess[guess.charAt(i)-'0']++;
            }
        }
        
        for(int i=0;i<10;i++){
            b += Math.min(digits_secret[i], digits_guess[i]);
        }
        return a+"A"+b+"B";
    }
}
