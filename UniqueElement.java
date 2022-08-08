import java.util.*;

public class UniqueElement {

    static int getU(int[] list){
        int unique =0;
        for(int i=0;i<list.length;i++){
            unique = list[i];
            int count=0;
            for(int j=0;j<list.length;j++){
                if(list[j]==unique){
                    count++;
                }
            }
            if(count==1){
                return unique;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        for(int i=0;i<n;i++){
            list[i]= sc.nextInt();
        }
        int unique= getU(list);
        System.out.println(unique);
        sc.close();

    }
}
