import java.util.*;

public class ForestFire {


    static boolean isBurnt(char[][] forrest,int m,int n){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(forrest[i][j]=='T'){
                    return false;
                }
            }
        }
        return true;
    }
    static boolean isPossible(char[][] forrest,int row,int col){
        int r= forrest.length-1;
        int c = forrest[0].length-1;
        if(row>r || col>c || row<0 || col<0){
            return false;
        }
        else if(forrest[row][col]=='W' || forrest[row][col]=='B'){
            return false;
        }
        else return true;
    }

    static void burn(char[][] forrest,int m,int n){

        boolean[][] thiscycle = new boolean [m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                thiscycle[i][j]= false;;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(forrest[i][j]=='B' && thiscycle[i][j]!=true){
                    if(isPossible(forrest, i-1, j)){
                        forrest[i-1][j]='B';
                        thiscycle[i-1][j]=true;
                    }
                    if(isPossible(forrest, i, j-1)){
                        forrest[i][j-1]='B';
                        thiscycle[i][j-1]=true;
                    }
                    if(isPossible(forrest, i+1, j)){
                        forrest[i+1][j]='B';
                        thiscycle[i+1][j]=true;
                    }
                    if(isPossible(forrest, i, j+1)){
                        forrest[i][j+1]='B';
                        thiscycle[i][j+1]=true;
                    }
                    if(isPossible(forrest, i-1, j-1)){
                        forrest[i-1][j-1]='B';
                        thiscycle[i-1][j-1]=true;
                    }
                    if(isPossible(forrest, i+1, j+1)){
                        forrest[i+1][j+1]='B';
                        thiscycle[i+1][j+1]=true;
                    }
                    if(isPossible(forrest, i+1, j-1)){
                        forrest[i+1][j-1]='B';
                        thiscycle[i+1][j-1]=true;
                    }
                    if(isPossible(forrest, i-1, j+1)){
                        forrest[i-1][j+1]='B';
                        thiscycle[i-1][j+1]=true;
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int rowl= sc.nextInt();
        int coll = sc.nextInt();
        char[][] forrest = new char[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                forrest[i][j]= sc.next().charAt(0);
            }
        }
        
        int time =1;
        forrest[rowl-1][coll-1]='B';

        while(!isBurnt(forrest, m, n)){
            burn(forrest,m,n);
            time++;
        }

        System.out.println(time);
        sc.close();
    }
}
