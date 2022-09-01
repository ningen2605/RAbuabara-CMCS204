package GradebookLAB;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


class GradebookTester {
	

 Gradebook gradebook1;
 Gradebook gradebook2;

@BeforeEach
 public void setUp() {
	gradebook1 = new Gradebook(5);
	gradebook2 = new Gradebook(5);
	gradebook1.addScore(80);
	gradebook2.addScore(60);
	gradebook1.addScore(20);
	gradebook2.addScore(24);
	gradebook1.addScore(76);
	gradebook2.addScore(38);

}@AfterEach
 public void tearDown() {
	gradebook1 = null;
	gradebook2 = null;
}



	@Test
	void testAddScore() {
	
		assertTrue(gradebook1.toString().equals("[80.0, 20.0, 76.0, 0.0, 0.0] ")); //this was expected because it the gradebook would copy an array.
		assertTrue(gradebook2.toString().equals("[60.0, 24.0, 38.0, 0.0, 0.0] "));
	
	assertEquals(3, gradebook1.getScoreSize(), .001);
	assertEquals(3, gradebook2.getScoreSize(), .001);
	
	
	
	
	}

	@Test
	void testSum() {
		
		assertEquals(176 ,gradebook1.sum(), .0001);
		assertEquals(122, gradebook2.sum(), .0001);
		
		
	}

	@Test
	void testMinimum() {
		assertEquals(20, gradebook1.minimum(), .001);
		assertEquals(24, gradebook2.minimum(), .001);
	}

	@Test
	void testFinalScore() {
		double g1final = 80 + 76;
		double g2final = 60 + 38;
		assertEquals(g1final ,gradebook1.finalScore(), .001);
		assertEquals(g2final, gradebook2.finalScore(), .001);
	}	
}

