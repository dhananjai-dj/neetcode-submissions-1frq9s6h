class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            if( !(s.charAt(left) > 64 && s.charAt(left) < 91) && !(s.charAt(left) > 93 && s.charAt(left) < 123) && !(s.charAt(left) > 47 && s.charAt(left) < 58) ){
                left++;
                continue;
            }
            if( !(s.charAt(right) > 64 && s.charAt(right) < 91) && !(s.charAt(right) > 93 && s.charAt(right) < 123) && !(s.charAt(right) > 47 && s.charAt(right) < 58) ){
                right--;
                continue;
            }
            if(isNotValid(left, right, s)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private boolean isNotValid(int left, int right, String s){
        if(Character.toUpperCase(s.charAt(left)) == Character.toUpperCase(s.charAt(right))){
            return false;
        }
        return true;
    }


}
