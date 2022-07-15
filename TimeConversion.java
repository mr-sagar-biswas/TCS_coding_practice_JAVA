/*convert time from 12hour format to 24 hour format */
import java.io.*;

public class TimeConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        String time = br.readLine();
        System.out.println("Time in 12 Hour Format:  "+ time);
        String index = time.substring(8);
        System.out.println(index);
        if(index.equals("PM")){
            int hour = Integer.parseInt(time.substring(0,2));
            if(hour==12){
                System.out.println("12"+time.substring(2,8));
            }
            else{
                hour = hour+12;
                System.out.println(hour+time.substring(2,8));
            }
        }
        else if (index.equals("AM")){
            int hour = Integer.parseInt(time.substring(0,2));
            if(hour==12){
                System.out.println("00"+time.substring(2,8));
            }
            else{
                time = time.substring(0,8);
                System.out.println(time);
            }       
        }
    }
}
