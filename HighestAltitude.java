/*Find the Highest Altitude – 
https://leetcode.com/problems/find-the-highest-altitude/ */
class Solution {
    public int largestAltitude(int[] gain) {
        int altitude = 0;
        int highest = 0;
        for(int i =0 ; i < gain.length;i++){
            altitude += gain[i];
            highest = Math.max(highest , altitude);
        }
        return highest;
    }
}