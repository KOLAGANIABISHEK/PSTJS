/* Sort the People- https://leetcode.com/problems/sort-the-people/*/
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
         
        for(int i = 0 ; i < n-1 ; i++){
            for(int j = i+1; j < n;j++){
                if(heights[i] < heights[j]){
                    int tempHeight = heights[i];
                    heights[i] = heights[j];
                    heights[j] = tempHeight;

                    String TempName = names[i];
                    names[i] = names[j];
                    names[j] = TempName;
                }
            }
        }
        return names;
        
    }
}
