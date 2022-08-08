import java.util.*;

public class MaxSubarraySum {
    static int max(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=max){
                max = arr[i];
            }
        }
        return max;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];
        for(int i =0;i<size;i++){
            array[i]=sc.nextInt();
        }
        int bestList[] = new int[size];
        int best = array[0];
        bestList[0]=best;
        for(int i=1;i<size;i++){
            if(array[i]>=array[i]+best){
                best = array[i];
            }
            else{
                best = array[i]+best;
            }
            bestList[i]=best;
        }
        System.out.println(max(bestList));
        sc.close();
    }
}
