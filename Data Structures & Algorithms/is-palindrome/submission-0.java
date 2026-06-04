class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
         s = s.replaceAll("[^a-z0-9]", "");
        for(int i = 0; i < s.length() / 2; i++){
            int j = s.length() - 1 - i;
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
