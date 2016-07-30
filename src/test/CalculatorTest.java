package test;

import main.Calculator;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
	
	private Calculator classUnderTest;
	
	
	@BeforeClass
	public static void beforeClassExample() {
		System.out.println("Wykona siê przed wszystkimi testami");
	}
	
	@AfterClass
	public static void afterClassExample() {
		System.out.println("Wykona siê po wszystkich testach");

	}
	
	@Before    //adnotacje na junit
	public void setUp() {
		System.out.println("Metoda zostanie wykonana przed kazdym testem");
		classUnderTest = new Calculator();
	}
		
	@After
	public void tearDown() {
		System.out.println("Metoda zostanie wykonana po kazdym tescie");
	}
	
	@Test
	public void testSum() throws Exception {
		double z1 = 1.9;
		double z2 = 1.5;
		
		double wynik = classUnderTest.sum(z1, z2);
		
		Assert.assertEquals(3.4, wynik, 0.0000001);
	}
	
	@Test
	public void testSubstract() throws Exception {
		double z1 = 5.5;
		double z2 = 4.2;
		
		double wynik = classUnderTest.subtract(z1, z2);
		
		Assert.assertEquals(1.3, wynik, 0.0000001);
	
	}
	
	@Test
	public void testMultiply() throws Exception {
		double z1 = 2.25;
		double z2 = 5.56;
		
		double wynik = classUnderTest.multiply(z1, z2);
		
		Assert.assertEquals(12.51, wynik, 0.0000001);
	}
	
	@Test
	public void testDivide() throws Exception {
		double z1 = 15.0;
		double z2 = 5.0;
		
		double wynik = classUnderTest.divide(z1, z2);
		
		Assert.assertEquals(3.0, wynik, 0.00000001);
	}
	
	@Test (expected = Exception.class)
	public void testDivide0() throws Exception {
		double z1 = 15.0;
		double z2 = 0;
		
		double wynik = classUnderTest.divide(z1, z2);
		
		Assert.assertEquals(3.0, wynik, 0.00000001);
	}

}
