import java.io.*;

class WashingMachine{
    static void time(int x){
        if(x>7000){
            System.out.println("OVERLOADED");
        }
        else if(x<0){
            System.out.println("INVALID INPUT");
        }
        else if(x==0){
            System.out.println("Time Estimated: 0 minutes");
        }
        else{
            if(x>4000){
                System.out.println("Time Estimated: 45 minutes");
            }
            else if(x>2000){
                System.out.println("Time Estimated: 35 minutes");
            }
            else if(x>0){
                System.out.println("Time Estimated: 25 minutes");
            }
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        time(x);
    }
}