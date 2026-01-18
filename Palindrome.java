/*class Solution {
    public boolean isPalindrome(int x) {        
        int original =x;
        int rev = 0;
        while(x>0){
            int digit=x%10;
            x=x/10;
            rev = rev*10+digit;
            
        }

        if(original==rev) return true;
        return false;
    }
}
*/

class Solution{
    public boolean isPalindrome(int x){
        String s = Integer.toString(x);
 
        for(int i=0; i<s.length()/2; i++){
            if(!(s.charAt(i)==s.charAt(s.length()-i-1))){
                return false;
            }
            
        }
        return true;
    }
}