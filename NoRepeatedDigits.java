import java.util.*;

public class NoRepeatedDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1= sc.nextInt();
        int n2 = sc.nextInt();
        int Rep_count=0;

        for(int i=n1;i<=n2;i++){
            int x =i;
            boolean visited[] = new boolean[10];
            while(x>0){
                if(visited[x%10]==true){
                    Rep_count++;
                    break;
                }
                visited[x%10]=true;
                x=x/10;
            }
        }
        System.out.println("\n\n"+ (n2-n1+1-Rep_count));
        sc.close();

    }
}
