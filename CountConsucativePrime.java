import java.util.*;

public class CountConsucativePrime {
    static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        if(n<2 || n%2==0){
            return false;
        }
        for(int i = 3;i<=n/2;i=i+2){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    static int[] primeList(int n){
        ArrayList<Integer> prime = new ArrayList<>();
        for(int i=0;i<=n;i++){
            if(isPrime(i)){
                prime.add(i);
            }
        }
        int arr[] = new int[prime.size()];
        for(int i =0;i<prime.size();i++){
            arr[i]= prime.get(i);
        }
        return arr;
    }

    static int countPrime(int n){
        int [] prime = primeList(n);
        int count=0;
        for(int i =1;i<prime.length;i++){
            int checking = prime[i];
            int sum=0;
            int j = 0;
            while(sum<=checking){
                sum=sum+prime[j];
                if(sum==checking){
                    count++;
                }
                j++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(4));
        System.out.println(Arrays.toString(primeList(50)));
        System.out.println(countPrime(21542222));
    }
}
