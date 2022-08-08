import java.io.*;

public class SplitPalindrome {

    static boolean isPalindrome(String str){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    static boolean split(String str){
        for(int i=0;i<str.length();i++){
            String sub1 = str.substring(0, i);
            if(isPalindrome(sub1)){
                for(int j=i;j<str.length();j++){
                    String sub2=str.substring(i,j);
                    if(isPalindrome(sub2)){
                        if(isPalindrome(str.substring(j))){
                            System.out.println(sub1);
                            System.out.println(sub2);
                            System.out.println(str.substring(j));
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if(!split(str)){
            System.out.println("Impossible");
        }
    }
}
