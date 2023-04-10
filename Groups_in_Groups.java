package groupswithingroups;

import org.testng.annotations.Test;

public class Groups_in_Groups {
	 @Test(groups= {"Smoke"})  
	 public void Name1()  
	 {  
	     System.out.println("Dora");  
	 }  
	 @Test(groups= {"Regression"})  
	 public void Name2()  
	 {  
	     System.out.println("Bujii");  
	 }  
	 @Test  
	 public void Name3()  
	 {  
	     System.out.println("Diago");  
	 }

}
