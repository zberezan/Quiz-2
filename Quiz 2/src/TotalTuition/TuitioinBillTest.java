package TotalTuition;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TuitioinBillTest {

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
	public void testfulltuition() {
		TuitionBill testone = new TuitionBill(12000,0.10,0.05,20);
		assertTrue(testone.fullTuition()== 58476.6);
		TuitionBill testtwo = new TuitionBill(12000,0.04,0.25,35);
		assertTrue(testtwo.fullTuition()== 63696.96);
		TuitionBill testthree = new TuitionBill(24000,0.13,0.15,45);
		assertTrue(testthree.fullTuition()== 133854.39);
		TuitionBill testfour = new TuitionBill(13678,0.07,0.23,17);
		assertTrue(testfour.fullTuition()== 74697.33);
	}

}
