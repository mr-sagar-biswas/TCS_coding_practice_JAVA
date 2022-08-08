import java.util.*;

public class Series {
    static String nth(int n){
        String item= Integer.toString(2*n*(3+4*(n-1)));
        if(item.length()<5){
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<5-item.length();i++){
                sb.append(0);
            }
            sb.append(item);
            return sb.toString();
        }
        return item;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(nth(count)+" ");
                count++;
            }
            System.out.println("");
        }
        sc.close();
    }
}
