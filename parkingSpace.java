import java.io.*;

public class parkingSpace {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int r = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        String input[] = new String[r+c];
        input=br.readLine().split(" ");
        int parkingLot[][] = new int[r][c];
        int k =0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                parkingLot[i][j]=Integer.parseInt(input[k]);
                System.out.print(parkingLot[i][j]);
                k++;
            }
            System.out.println("");
        }
        int max=0;
        int max_row=0;
        for(int i=0;i<r;i++){
            int count=0;
            for(int j=0;j<c;j++){
                count=count+parkingLot[i][j];
            }
            if (count>max){
                max=count;
                max_row=i+1;
            }
        }
        System.out.print(max_row);
    }
}
