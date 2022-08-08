import java.util.*;
public class MrString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int num[] = new int[n];
        for(int  i =0; i<n;i++){
            num[i]=sc.nextInt();
            if(num[i]==2 || num[i]==6){
                sum=sum+1;
            }
            else{
                sum=sum+2;
            }
        }
        int count =0;
        for(int i =0;i<n;i++){
            for(int j =i;j<n;j++){
                if(num[i]+num[j]==sum){
                    count=count+1;
                }
            }
        }
        String[] digits = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        System.out.println(Arrays.toString(num)+" "+sum+" "+digits[count]);
        sc.close();
    }
}
