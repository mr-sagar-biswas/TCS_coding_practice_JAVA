import java.util.*;

public class NQueen {

    static boolean isPossible(int[][] board,int row,int col){
        // verticle up
        int r = row-1;
        int c = col;
        while(r>=0){
            if(board[r][c]==1){
                return false;
            }
            r--;
        }

        //horizontal left
        r=row;
        c=col-1;
        while(c>=0){
            if(board[r][c]==1){
                return false;
            }
            c--;
        }

        //diagonaly left
        r=row-1;
        c=col-1;
        while(r>=0 && c>=0){
            if(board[r][c]==1){
                return false;
            }
            r--;
            c--;
        }
        
        //diagnally right
        r=row-1;
        c=col+1;
        while(r>=0 && c<board[0].length){
            if(board[r][c]==1){
                return false;
            }
            r--;
            c++;
        }
        return true;

    }

    static void nQueen(int[][] board,int row,int col,int queens,int placed){
        
        if(queens==placed){
            System.out.println("\n\n");
            for(int i =0;i<queens;i++){
                for(int j=0;j<queens;j++){
                    System.out.print(board[i][j]);
                }
                System.out.println("");
            }
            return;
        }

        if(col==board[0].length){
            row++;
            col=0;
        }
        if(row==board.length){
            return;
        }

        if(isPossible(board,row,col)){
            board[row][col]=1;
            nQueen(board, row, col+1, queens, placed+1);
            board[row][col]=0;

        }
        nQueen(board, row, col+1, queens, placed);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]=0;
            }
        }
        nQueen(board,0,0,n,0);
        sc.close();   
    }
}
