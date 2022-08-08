import java.io.*;
import java.util.*;




public class BalancedParanthesis {

    static boolean isPair(char x,char y){
        if(  (x=='(' && y==')') || (x=='{' && y=='}') || x=='[' && y==']'  ){
            return true;
        }
        else return false;
    }

    static boolean isBalanced(String str){
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for(int i=0;i<str.length();i++){
            char bracket = str.charAt(i);
            if(bracket=='(' || bracket=='{' || bracket=='['){
                stack.push(bracket);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                else if(isPair(stack.peek(), bracket)){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(isBalanced(str));
    }
}
