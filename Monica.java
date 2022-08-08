import java.util.*;

public class Monica {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int b= sc.nextInt();
        int n= sc.nextInt();
        int m= sc.nextInt();
        int [] keyboard = new int[n];
        int[] drives = new int[m];
        for(int i = 0;i<n;i++){
            keyboard[i]=sc.nextInt();
        }
        for(int i = 0;i<m;i++){
            drives[i]=sc.nextInt();
        }

        int high =-1;
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                if(keyboard[i]+drives[j]>high && keyboard[i]+drives[j]<=b){
                    high = keyboard[i]+drives[j];
                }
            }
        }
        System.out.println(high);
        sc.close();
    }
}
