import java.util.*;

public class AgressiveCows {
    //checks if the allowcation is possible.
    static boolean isPossible(int lowest,int[] barns,int c){
        int cow =1;
        int pos=barns[0];
        for(int i=1;i<barns.length;i++){
            if(barns[i]-pos>=lowest){
                pos=barns[i];
                cow++;
                if(cow==c){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test=sc.nextInt();
        for(int t=0;t<test;t++){

            int n=sc.nextInt();
            int c = sc.nextInt();
            int[] barns = new int[n];
            for(int i=0;i<n;i++){
                barns[i]=sc.nextInt();
            }
            Arrays.sort(barns); //sorting array
            int start=0;
            int end = barns[n-1];
            int largestMinimum=0;
            while(start<=end){ //binary search
                int mid=(start+end)/2;
                if(isPossible(mid,barns,c)){
                    start=mid+1;
                    largestMinimum=mid;
                }
                else{
                    end=mid-1;
                }
            }
            System.out.println(largestMinimum);
        }
        sc.close();
    }
}
