/*
Problem Statement – Given a string S(input consisting) of ‘*’ and ‘#’. The length of the string is variable. 
The task is to find the minimum number of ‘*’ or ‘#’ to make it a valid string. 
The string is considered valid if the number of ‘*’ and ‘#’ are equal. The ‘*’ and ‘#’ can be at any position in the string.
Note : The output will be a positive or negative integer based on number of ‘*’ and ‘#’ in the input string.

(*>#): positive integer
(#>*): negative integer
(#=*): 0
Example 1:
Input 1:

###***   -> Value of S
Output :

0   → number of * and # are equal */


import java.io.*;

public class starHash {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String hash= br.readLine();
        int count1=0,count2=0;
        for(int i=0;i<hash.length();i++){
            if (hash.charAt(i)=='*'){
                count1++;
            }
            else{
                count2++;
            }
        }
        System.out.println(count1-count2);
    }
}
