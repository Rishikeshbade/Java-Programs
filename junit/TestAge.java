package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class TestAge {


	@Test
	void testPostiveCase() {
		Age obj = new Age();
		obj.setAge(20);
		assertTrue(obj.ageChecker());
	}
	@Test
	void testNegativeCase() {
		Age obj = new Age();
		obj.setAge(15);
		assertFalse(obj.ageChecker());
	}
	

}
