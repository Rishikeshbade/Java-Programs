package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestApple {

	@Test// +ve test case
	void testCorrectColor() {
		Apple apple = new Apple();
		apple.setColor("Green");
		assertTrue(apple.checkColor());
	}
	@Test// -ve test case
	void testWrongColor() {
		Apple apple = new Apple();
		apple.setColor("Blue");
		assertFalse(apple.checkColor());;
	}
	
	

}
