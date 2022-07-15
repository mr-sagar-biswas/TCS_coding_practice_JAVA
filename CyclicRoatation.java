/*Problem Description -: Given an array Arr[ ] of N integers and a positive integer K. 
The task is to cyclically rotate the array clockwise by K.

Note : Keep the first of the array unaltered.

 

Example 1:

5  —Value of N
{10, 20, 30, 40, 50}  —Element of Arr[ ]
2  —–Value of K
Output :

40 50 10 20 30

Example 2:

4  —Value of N
{10, 20, 30, 40}  —Element of Arr[]
1  —–Value of K
Output :

40 10 20 30 */
import java.util.*;

public class CyclicRoatation {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            int n = sc.nextInt();
            for(int i=0;i<n;i++){
                arr.add(sc.nextInt());
            }
            int k = sc.nextInt();
            ArrayList<Integer> arrCopy = new ArrayList<Integer>();
            int threshold = n-k;
            for(int i=0;i<arr.size();i++){
                if(threshold+i<n){
                    arrCopy.add(arr.get(threshold+i));
                }
                else if (threshold+i>=n-1){
                    arrCopy.add(arr.get(threshold+i-n));
                }
            }
            System.out.println("/n/n");
            for(int i=0;i<n;i++){
                System.out.println(arrCopy.get(i));
            }
        }

    }
}
