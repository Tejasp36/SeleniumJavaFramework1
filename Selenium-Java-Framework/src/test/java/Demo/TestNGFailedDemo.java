package Demo;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGFailedDemo {
	
	@Test
	public void test1()
	{
		System.out.println("I am inside test 1");
	}
	@Test
	public void test2()
	{
		System.out.println("I am inside test 2");
		//Assert.assertTrue(0>1);

	}
	@Test(retryAnalyzer=Listeners.MyRetry.class)
	public void test3()
	{
		System.out.println("I am inside test 3");
		Assert.assertTrue(false);
	}
}
