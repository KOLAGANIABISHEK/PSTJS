import java.util.*;
import java.io.*;

class Result{
    Public static long stringSimilarity(String s){
        int n = s.lenght();
        int[] z = new int ;
        z[0] = n;
        int left = 0;
        int right = 0;
        for(unt i = 1; i < n; i++){
            if ( i <= right){
                z[i] =  Math.min(right - i + 1,z[i - left]);


            }
            while(i + z[i] < n && s.chatAt(z[i]) == s.charAt(i + z[i])){
                z[i]++
            }
            if(i + z[i] - 1 > right)}{
                left = i;
                right = i + z[i] - 1;

             }        
    }
    long ans = 0;
    for(int value : z){
        ans += valiue;
    }
    return ans;

}