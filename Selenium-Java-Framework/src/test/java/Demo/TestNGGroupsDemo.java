package Demo;

import org.testng.annotations.Test;

@Test(groups= {"AllClassTests"})
public class TestNGGroupsDemo {
	
		@Test(groups= {"windows.regression"})
		public void test1() {
			System.out.println("I am inside test1");
		}
		@Test(groups= {"sanity","smoke"})
		public void test2() {
			System.out.println("I am inside test2");
		}
		@Test(groups= {"sanity","regression"})
		public void test3() {
			System.out.println("I am inside test3");
		}
		@Test
		public void test4() {
			System.out.println("I am inside test4");
		}

	}
