import java.io.*;


class twoFourWheeler{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int v=Integer.parseInt(br.readLine());
		int w=Integer.parseInt(br.readLine());
		int tw=0;
		int fw=0;
		if (w<2 || w%2!=0 || v>w){
			System.out.println("INVALID INPUT");
		}
		else{
			for(int i=0;i<=v;i++){
				tw=i;
				fw=v-i;
				if (2*tw+4*fw==w){
					break;
				}
			}
			System.out.println("TW ="+tw+ "FW="+fw);
		}
		
	}
}