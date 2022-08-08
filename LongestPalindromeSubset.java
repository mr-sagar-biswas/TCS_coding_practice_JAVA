public class LongestPalindromeSubset {
    static int max(int x,int y ){
        if(x>=y){
            return x;
        }
        return y;
    }
    static boolean isPalindrome(String str){
        if(str.length()==0){
            return false;
        }
        else if(str.length()==1){
            return true;
        }
        else{
            for(int i =0;i<str.length()/2;i++){
                if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                    return false;
                }
            }
            return true;
        }
    }

    static int Long(String ans,String str){
        if(str.length()==0){
            if(isPalindrome(ans)){
                return ans.length();
            }
            else return -1;
        }
        return max ( Long(ans+String.valueOf(str.charAt(0)),str.substring(1)),Long(ans,str.substring(1)));

    }



    public static void main(String[] args) {
        System.out.println(Long("","cbbd"));
    }
}
