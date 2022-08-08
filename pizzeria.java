import java.util.*;

public class pizzeria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int piz_count = sc.nextInt();
        int pizzeria[] = new int[piz_count];
        for(int i =0;i<piz_count;i++){
            pizzeria[i]= sc.nextInt();
        }
        int sum = pizzeria[0];
        for(int i =1;i<piz_count;i++){
            sum=sum+pizzeria[i];
            pizzeria[i]= sum;
            
        }

        for(int i =0;i<days;i++){
            int pocket_money = sc.nextInt();

            int start=0;
            int end = piz_count-1;
            int location=0;
            while(start<=end){
                int mid = (start+end)/2;
                if(pizzeria[mid]<=pocket_money){
                    location = mid;
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            System.out.println("\n\n"+ (pocket_money-pizzeria[location]));

        }
        sc.close();
    }
}
