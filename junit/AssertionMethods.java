package junit;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class AssertionMethods {
	@Test
	public void testAssertions() {
		int a = 10;
		int b = 20;
		String s1 = "Welcome";
		String s2 = "welcome";
		String s3 = null;
		
		assertSame(a, b);
		
		assertNotSame(a, b);
		
		assertTrue(a==b);
		
		assertTrue(a<b);
		
		assertSame(s1, s2);
		
		assertNull(s1);
		
		assertNotNull(s2);
		assertNull(s3);
	}
}
