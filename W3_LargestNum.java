/* Largest Number https://leetcode.com/problems/largest-number/description/*/
class Solution {
    public String largestNumber(int[] nums) {
         String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i] + "";
        }
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
        if (arr[0].equals("0")) {
            return "0";
        }
        String answer = "";
        for (String s : arr) {
            answer += s;
        }
        return answer;
        
    }
}