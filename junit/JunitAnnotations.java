package junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitAnnotations {
	
	@BeforeClass
	public static void beforClass() {
		System.out.println("In Before Class");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("In After Class");
	}
	
	
	@Before
	public  void befor() {
		System.out.println("In Befor ");
	}
	
	@After
	public  void after() {
		System.out.println("In after ");
	}
	
	
	@Test
	public  void Test1() {
		System.out.println("In Test1 ");
	}
	
	
	@Test
	public  void Test2() {
		System.out.println("In Test2 ");
	}
	
	@Ignore
	public  void ignore() {
		System.out.println("In Ignore ");
	}
	

}
