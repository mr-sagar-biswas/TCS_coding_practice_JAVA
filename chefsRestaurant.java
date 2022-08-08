import java.util.*;

public class chefsRestaurant{
    static boolean isPossible(int[] scedule,int mid,int entry){
        if(entry<=scedule[mid]){
            return true;
        }
        else{
            return false;
        }
    }

    static int waiting(int[] scedule,int entry){

        int start = 0;
        int end = scedule.length-1;
        if(entry>=scedule[end]){
            return -1;
        }
        else if(entry<=scedule[start]){
            return(scedule[start]-entry);
        }
        int wait=0;
        while(start<=end){
            int mid = (start+end)/2;
            if(isPossible(scedule,mid,entry)){
                if(mid%2==0){
                    wait = scedule[mid]-entry;
                }
                else if (mid%2==1){
                    if(entry==scedule[mid]){
                        wait = scedule[mid+1]-entry;
                    }
                    else if(entry<scedule[mid] && entry>= scedule[mid-1]){
                        wait=0;
                    }
                    else{
                        wait=scedule[mid-1]-entry;
                    }
                }
                end=mid-1;
            }
            else{
                start = mid+1;
            }

        }
        return wait;  

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t=0;t<test;t++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int scedule[] = new int[2*n];
            int enter[] = new int[m];
            for(int i=0;i<2*n;i++){
                scedule[i]= sc.nextInt();
            }
            for(int i=0;i<m;i++){
                enter[i]= sc.nextInt();
            }
            Arrays.sort(scedule);

            for(int i=0;i<2*n;i++){
                System.out.print("  "+scedule[i]);
            }

            System.out.println("\n\n");
            for(int i=0;i<m;i++){
                System.out.println(waiting(scedule, enter[i]));
            }


        }
        sc.close();
    }
}
