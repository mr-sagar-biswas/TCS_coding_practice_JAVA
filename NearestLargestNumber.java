import java.util.*;

public class NearestLargestNumber {
    private static String swap(String str, int x, int y) {
        char strArray[] = str.toCharArray();
        char temp=strArray[x];
        strArray[x]=strArray[y];
        strArray[y]=temp;
        return String.valueOf(strArray);
    }

    static void permutation(String str,int start,int end,int valid, int[] ans){
        if(start==end){
            if(Integer.parseInt(str)>valid){
                if(Integer.parseInt(str)<=ans[0]){
                    ans[0]=Integer.parseInt(str);
                }
            }
            return ;
        }
        for(int i =start;i<=end;i++){
            str=swap(str,start,i);
            permutation(str, start+1, end,valid,ans);
            str=swap(str,i,start);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int [] ans = new int[1];
        ans[0] = Integer.MAX_VALUE;
        
        permutation( Integer.toString(a),0,Integer.toString(a).length()-1, b,ans);

        if(ans[0]==Integer.MAX_VALUE){
            System.out.println("-1");
        }
        else System.out.println(ans[0]);

        sc.close();

    }
}
