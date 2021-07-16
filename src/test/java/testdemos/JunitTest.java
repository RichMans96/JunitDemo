package testdemos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitTest {

	@BeforeClass
	public static void init() {
		System.out.println("Before All");

	}

	@AfterClass
	public static void teardown() {
		System.out.println("After All");

	}

	@After
	public void after() {
		System.out.println("After Each");
	}

	@Before
	public void setup() {
		System.out.println("Before Each");

	}

	@Test
	public void test() {
		System.out.println("Test running");
	}

	@Ignore
	@Test
	public void noTest() {
		System.out.println("I wont run!");
	}

}
