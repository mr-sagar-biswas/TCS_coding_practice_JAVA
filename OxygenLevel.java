import java.io.*;


public class OxygenLevel {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int first=0;
        int second=0;
        int third=0;
        int flag=0;
        for(int i=0;i<9;i++){
            int input = Integer.parseInt(br.readLine());
            if(input>100 ||input<1){
                flag=1;
                break;
            }
            if(i%3==0){
                first=first+input;
            }
            else if(i%3==1){
                second=second+input;
            }
            else if (i%3==2){
                third=third+input;
            }
        }
        if(flag==1){
            System.out.println("INVALID INPUT");
        }
        first=first/3;
        second=second/3;
        third=third/3;
        int max=0;
        if(first>max){
            max=first;
        }
        if(second>max){
            max=second;
        }
        if(second>max){
            max=second;
        }
        if(max<70){
            System.out.println("All trainees are unfit.");
        }
        else{
            if(max==first){
                System.out.println("Trainee Number : 1");
            }
            if(max==second){
                System.out.println("Trainee Number : 2");
            }
            if(max==third){
                System.out.println("Trainee Number : 3");
            }
        }
    }
}
