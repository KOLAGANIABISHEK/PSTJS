/* https://leetcode.com/problems/determine-if-string-halves-are-alike/ 
*/
class Solution {
    public boolean halvesAreAlike(String s) {
        int mid = s.length()/2;
        int count = 0;
        for(int i=0;i<s.length();i++){
            char  c = s.charAt(i);
            if("aeiouAEIOU".indexOf(c) >= 0){
                if(i<mid){  
                    count ++;
                }else {
                    count --;
                } 
            }
        }
        return count == 0;   
    }
}
