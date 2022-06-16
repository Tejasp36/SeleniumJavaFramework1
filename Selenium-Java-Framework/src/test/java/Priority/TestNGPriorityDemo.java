package Priority;

import org.testng.annotations.Test;

public class TestNGPriorityDemo
{
	@Test
	public void one()
	{
		System.out.println("Inside test1 method");
	}
	
	@Test(priority = 1)
	public void two()
	{
		System.out.println("Inside test2 method");
	}

	@Test(priority = 2)
	public void three()
	{
		System.out.println("Inside test3 method");
	}
}