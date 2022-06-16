package Listeners;

import org.testng.ITestContext;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class TestngListeners implements ITestNGListener
{
    public void onTestStart(ITestResult result)
    {
    	System.out.println("Test started:" + result.getName());
    }
    
    public void onTestSuccess(ITestResult result)
    {
    	System.out.println("Test is successful:" + result.getName());
    }
    
    public void onTestFailure(ITestResult result)
    {
    	System.out.println("Test failed:" + result.getName());
    }
    
    public void onTestSkipped(ITestResult result)
    {
    	System.out.println("Test skipped:" + result.getName());
    }
    
    public void onFinish(ITestContext context)
    {
    	System.out.println("Test finished" + context.getName());
    }
}