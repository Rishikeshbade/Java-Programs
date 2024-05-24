package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SqaureTest {

	@Test
	void test() {
		Methods obj = new Methods();
		int result = obj.sqaure(2);
		
		assertEquals(4, result);
	}
	

}
