
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
