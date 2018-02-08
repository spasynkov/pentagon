package pages;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_NG {
	@Test
	public void dfd(){
		System.out.println("method dft is running");
		sum(2,4);
	}
	@Test
	public void fff(){
		sum(5,7);
		System.out.println("method fff run");
	}

	public int sum(int a,int b){
		System.out.println("summing....");
		return  a+b;
	}

	@BeforeMethod
	public void ddd(){
		System.out.println("I'm befor method");
	}

	@BeforeTest
	public void r(){
		System.out.println("I'm befor test");
	}
}
