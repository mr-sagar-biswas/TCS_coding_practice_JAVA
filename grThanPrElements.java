import java.io.*;
public class grThanPrElements {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int array[] = new int[n];
        for(int i=0;i<n;i++){
            int temp= Integer.parseInt(br.readLine());
            array[i]=temp;
        }
        int count=1;
        for(int i=1;i<array.length;i++){
            int flag=0;
            for(int j=0;j<i;j++){
                if (array[i]<array[j]){
                    flag=1;
                    break;
                }    
            }
            if(flag==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
