import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferInPut {
	public static String getString() {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			String g=br.readLine();
			return g;
		}catch(IOException e) {
			return null;
		}catch( java.lang.NumberFormatException e){
			return null;
		}
	}
	public static int getInteger(){
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try{
			int y=Integer.parseInt(br.readLine());
			return y;
		}catch(IOException e){
			return 0;
		}catch( java.lang.NumberFormatException e){
			return 0;
		}
	}
	public static double getDouble(){
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try{
			double x=Double.parseDouble(br.readLine());		
			return x;
		}catch(IOException e){
			return 0.0;
		}catch( java.lang.NumberFormatException e){
			return 0.0;
		}
	}
}
