import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	
	private GradeBook grade1, grade2;

	@BeforeEach
	void setUp() throws Exception {
		grade1 = new GradeBook(5);
		grade2 = new GradeBook(5);
		
		grade1.addScore(95);
		grade1.addScore(99);
		
		grade2.addScore(67);
		grade2.addScore(87);
	}

	@AfterEach
	void tearDown() throws Exception {
		grade1=grade2=null;
	}

	@Test
	void testAddScore() {
		assertTrue(grade1.toString().equals("95.0 99.0 "));
		assertTrue(grade2.toString().equals("67.0 87.0 "));
	}

	@Test
	void testSum() {
		assertEquals(194, grade1.sum());
		assertEquals(154, grade2.sum());
	}

	@Test
	void testMinimum() {
		assertEquals(95, grade1.minimum());
		assertEquals(67, grade2.minimum());
	}

	@Test
	void testFinalScore() {
		assertEquals(99.0, grade1.finalScore());
		assertEquals(87.0, grade2.finalScore());
	}

	@Test
	void testGetScoreSize() {
		assertEquals(2, grade1.getScoreSize());
		assertEquals(2, grade2.getScoreSize());
	}
}
