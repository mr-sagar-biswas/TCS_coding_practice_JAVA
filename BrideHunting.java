import java.util.*;


public class BrideHunting {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int row= sc.nextInt();
       int col = sc.nextInt();
       int[][] arr = new int[row][col];
       for(int i = 0;i<row;i++){
        for(int j =0;j<col;j++){
            arr[i][j]= sc.nextInt();
        }
       }
       int ftGret=0;
       int brow=0;
       int bcol=0;
       for(int i = 0;i<row;i++){
        for(int j =0;j<col;j++){
            if(i==0 && j==0){
                continue;
            }
            if(arr[i][j]==1){
                int ft = 0;
                if(i-1>=0){ //prev row
                    if(arr[i-1][j]==1){
                        ft++;
                    }
                    if(j-1>=0){ // prev row prev col
                        if(arr[i-1][j-1]==1){
                            ft++;
                        }
                    }
                    if(j+1<col){ // prev row next col
                        if(arr[i-1][j+1]==1){
                            ft++;
                        }
                    }
                }
                if(j-1>=0){ //prev col
                    if(arr[i][j-1]==1){
                        ft++;
                    }
                }
                if(j+1<col){ //next col
                    if(arr[i][j+1]==1){
                        ft++;
                    }
                }
                if(i+1<row){ //next row
                    if(arr[i+1][j]==1){
                        ft++;
                    }
                    if(j-1>=0){ // next row prev col
                        if(arr[i+1][j-1]==1){
                            ft++;
                        }
                    }
                    if(j+1<col){ // next row next col
                        if(arr[i+1][j+1]==1){
                            ft++;
                        }
                    }
                }
                if(ftGret<ft){
                    ftGret=ft;
                    brow=i;
                    bcol=j;
                }
                if(ftGret==ft){
                    if(brow+bcol>i+j){
                        ftGret=ft;
                        brow=i;
                        bcol=j;
                    }
                }
            }
        }
       }
       System.out.println((brow+1)+" : "+(bcol+1)+" : "+ftGret);
       sc.close();
    }
}
