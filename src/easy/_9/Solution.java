package easy._9;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int res = 0;
        int old = x;
        for(;x!=0;x/=10){
            res = res * 10 + x %10;
        }
        return old == res ? true:false;
    }
}
