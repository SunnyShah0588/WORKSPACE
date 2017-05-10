import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
         long[][] answer = new long [1][2];
      
      
        
        for(int direction_i=0; direction_i < 1; direction_i++){
            for(int direction_j=0; direction_j < 2; direction_j++){
                answer[direction_i][direction_j] = in.nextLong();
            }
        }
 
        int n = in.nextInt();
        long[][] direction = new long[n][2];
        for(int direction_i=0; direction_i < n; direction_i++){
            for(int direction_j=0; direction_j < 2; direction_j++){
                direction[direction_i][direction_j] = in.nextLong();
            }
        }
        
      
        // your code goes here
        for(int direction_i=n-1; direction_i >-1; direction_i--){
              answer[0][0] = answer[0][0] - direction[direction_i][0];
              answer[0][1] = answer[0][1] - direction[direction_i][1];  
           
              System.out.print(answer[0][0]+" ");
              System.out.println(answer[0][1]);
            
            }
        
        

        System.out.print(answer[0][0]+" ");
        System.out.print(answer[0][1]);
    }
}
