import java.io.*;

public class starHash {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String hash= br.readLine();
        int count1=0,count2=0;
        for(int i=0;i<hash.length();i++){
            if (hash.charAt(i)=='*'){
                count1++;
            }
            else{
                count2++;
            }
        }
        System.out.println(count1-count2);
    }
}
