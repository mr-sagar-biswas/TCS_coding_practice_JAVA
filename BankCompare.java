import java.util.*;

public class BankCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p= sc.nextInt();
        int t = sc.nextInt();
        int n1= sc.nextInt();
        int[] year1=new int[n1];
        double[] rate1= new double[n1];
        for(int i = 0;i<n1;i++){
            year1[i]= sc.nextInt();
            rate1[i]=sc.nextDouble();
        }
        int n2 = sc.nextInt();
        int[] year2=new int[n2];
        double[] rate2= new double[n2];
        for(int i = 0;i<n2;i++){
            year2[i]= sc.nextInt();
            rate2[i]=sc.nextDouble();
        }

        double sum1  = 0;

        for(int i=0;i<n1;i++){
            double pow1 = Math.pow(1+rate1[i], year1[i]*12);
            double emi1 = (p*rate1[i])/(1-1/pow1);
            System.out.println(emi1);
            sum1=sum1+emi1;
        }
        double sum2=0;

        for(int i=0;i<n2;i++){
            double pow2 = Math.pow(1+rate2[i], year2[i]*12);
            double emi2 = (p*rate1[i])/(1-1/pow2);
            sum2=sum2+emi2;
        }
        if(sum1<sum2){
            System.out.println("Bank A");

        }
        else{
            System.out.println("Bank A");
        }
        sc.close();
    }
}
