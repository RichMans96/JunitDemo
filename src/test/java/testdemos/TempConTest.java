package testdemos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import temp.TemperatureConverter;

public class TempConTest {
	TemperatureConverter temp = new TemperatureConverter();

	@BeforeClass
	public static void init() {
		System.out.println("Test Starting");
	}

	@AfterClass
	public static void tearDown() {
		System.out.println("Test Finished");
	}

	@Test
	public void checkType() {
		assertTrue("Temp is of type temp!", temp instanceof TemperatureConverter);
	}

	@Test
	public void fToCTest() {
		assertEquals(-17, temp.convertFahrenheitToCelsius(0), 1);
	}

	@Test
	public void kToCTest() {
		assertEquals(-273, temp.convertKelvinToCelsius(0), 1);

	}

	@Test
	public void cToKTest() {
		assertEquals(273, temp.convertCelsiusToKelvin(0), 1);

	}

	@Test
	public void kToFTest() {
		assertEquals(-459, temp.convertKelvinToFahrenheit(0), 1);

	}

	@Test
	public void fToKTest() {
		assertEquals(258, temp.convertFahrenheitToKelvin(5), 1);

	}

	@Test
	public void cToFTest() {
		assertEquals(32, temp.convertCelsiusToFahrenheit(0), 1);

	}
}