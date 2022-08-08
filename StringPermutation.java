import java.io.*;


public class StringPermutation {

    private static void strPermutation(String str, int start, int end) {
        if(start==end){
            System.out.println(str);
        }
        for(int i =start;i<=end;i++){
            str=swap(str,start,i);
            strPermutation(str, start+1, end);
            str=swap(str,i,start);
        }

    }


    private static String swap(String str, int x, int y) {
        char strArray[] = str.toCharArray();
        char temp=strArray[x];
        strArray[x]=strArray[y];
        strArray[y]=temp;
        return String.valueOf(strArray);
    }


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        strPermutation(str,0,str.length()-1);
    }
}
