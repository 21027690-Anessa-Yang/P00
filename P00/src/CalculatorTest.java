import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		int expected = 9999;
		assertEquals (expected, actual);	
		
	}
	
	@Test
	public void testAddBoundary() {
		int a = 6739;
		int b = 3259; // maximum of 4 digits
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		int expected = 9998;
		boolean isTrue;
		if(a > 9999 || b > 9999) {
			isTrue = false;
		} else {
			isTrue = true;
		}
		assertTrue("Inputs should not contain more than 4 digits", isTrue);
		assertEquals (expected, actual);
	}
	
	@Test
	public void testAddError() {
		int a = 6789;
		int b = 2345;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		int expected = 9134;
		boolean isTrue;
		if (a + b != expected) {
			isTrue = false;
		} else {
			isTrue = true;
		}
		assertTrue("The actual result should be the same as the expected result.", isTrue);
		assertEquals (expected, actual);
	}
	
	@Test
	public void testSubtract() {
		int a = 9876;
		int b = 4321;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);	
		int expected = 5555;			
		assertEquals (expected, actual);
	}
	
	@Test
	public void testSubtractBoundary() {
		int a = 8173;
		int b = 1825;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		int expected = 6348;
		boolean isTrue;
		if(a > 9999 || b > 9999) {
			isTrue = false;
		} else {
			isTrue = true;
		}
		assertTrue("Inputs should not contain more than 4 digits", isTrue);
		assertEquals (expected, actual);
	}
	
	@Test 
	public void testSubtractError() {
		int a = 999;
		int b = 555;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		int expected = 444;
		boolean isTrue;
		if (a - b != expected) {
			isTrue = false;
		} else {
			isTrue = true;
		}
		assertTrue("The actual result should be the same as the expected result.", isTrue);
		assertEquals (expected, actual);
		
	}
	
	@Test
	public void testMultiple() {
		int a = 450;
		int b = 10;
		
		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b);		
		int expected = 4500;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testMultipleBoundary() {
		int a = 645;
		int b = 320;
		
		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b);		
		int expected = 206400;			
		boolean isTrue;
		if(a > 9999 || b > 9999) {
			isTrue = false;
		} else {
			isTrue = true;
		}
		assertTrue("Inputs should not contain more than 4 digits", isTrue);
		assertEquals (expected, actual);
	}
	
	@Test
	public void testDivide() {
		int a = 540;
		int b = 60;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);		
		int expected = 9;
		assertEquals (expected, actual);
	}
	
	@Test 
	public void testDivideBoundary() {
		int a = 9360;
		int b = 30;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);		
		int expected = 312;
		boolean isTrue;
		if(a > 9999 || b > 9999) {
			isTrue = false;
		} else {
			isTrue = true;
		}
		assertTrue("Inputs should not contain more than 4 digits", isTrue);
		assertEquals (expected, actual);
	}
}
