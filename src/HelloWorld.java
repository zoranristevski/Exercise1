import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloWorld {

	public static void main(String[] args) {
		HelloUser user = new HelloUser();
		InputStreamReader isr = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(isr);
	    
	    
	    System.out.println("Hello ASE2017 - How are you now? :)");
	    System.out.print("Please enter your name: ");
	    try{
	    	user.setUsername(br.readLine());
	    }
	    catch(IOException e){
			e.printStackTrace();
		}
	    user.greetUser();
	}

}
