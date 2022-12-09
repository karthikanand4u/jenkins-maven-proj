package telecom.pact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Set Up Before Class - @BeforeAll");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Tear Down After Class - @AfterAll");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Set Up @BeforeEach");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Tear Down @AfterEach");
	}

	@Test
	void test_add() {
		assertEquals(2, Calculator.add(1, 1));
	}

}
