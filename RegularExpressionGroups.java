package regularExpressions;

import org.testng.annotations.Test;

public class RegularExpressionGroups {
	@Test(groups= {"Include Animals"})  
	public void Animals()   
	{  
		System.out.println("This is TIGER!!!");  
	}  
	@Test(groups= {"Include Birds"})  
	public void Birds()   
	{  
		System.out.println("This is PEACOCK!!!");  
	}  
	@Test(groups= {"Exclude Flowers"})  
	public void Flowers()   
	{  
		System.out.println("This is JASMINE!!!");  
	}  

}
