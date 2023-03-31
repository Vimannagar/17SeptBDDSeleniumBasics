package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class ApplicationHooks {
	
	@Before(order = 1)
	public void beforeHook1()
	{
		System.out.println("Before1 hook");
	}
	
	@BeforeStep
	public void beforeStep()
	{
		System.out.println("Before step");
	}
	
	@AfterStep
	public void afterStep()
	{
		System.out.println("After step");
	}
	
	@Before(order = 2)
	public void beforeHook2()
	{
		System.out.println("Before2 hook");
	}
	
	
	@After(order = 1)
	public void afterHook1()
	{
		System.out.println("After1 hook");
	}
	
	@After(order = 2)
	public void afterHook2()
	{
		System.out.println("After2 hook");
	}
	
	
	
	
	
	
	

}
