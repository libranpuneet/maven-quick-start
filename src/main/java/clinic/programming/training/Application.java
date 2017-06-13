package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;
public class Application {
    
    public Application() {
        System.out.println ("Inside Application constructor");
    }

	
	public void greet(){
	List<String> greetings= new ArrayList<String>();
	greetings.add("hello you");
	
	for (String s: greetings ){
		System.out.println("Greetings : >> " + s);
	}
		
	}
	
	
    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	   Application app = new Application();
	   app.greet();
    }
}