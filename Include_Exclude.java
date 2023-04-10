package include_excludeGroups;

import org.testng.annotations.Test;

public class Include_Exclude {
	@Test(groups= {"Include Group"})  
	public void Flower()   
	{  
	System.out.println("This is Lily Flower!!!");  
	}  
	@Test(groups= {"Include Group"})  
	public void Colour()   
	{  
	System.out.println("This is Black colour!!!");  
	}  
	@Test(groups= {"Exclude Group"})  
	  
	public void Bird()   
	{  
	System.out.println("This is Peacock!!!");  
	}  

}
