package Demo;

public class ExceptionHandlingDemo {

	public static void main(String[] args) 
	{
		try {
			demo();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}

	}
	public static void demo() throws Exception
	{
		System.out.println("Hello world");
		throw new ArithmeticException("not valid operation");
	}

}

