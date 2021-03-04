package test.java.cases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class javaProjectTest {
	
	javaProject jp;
		
	@BeforeAll
	static void beforeall() {
		System.out.println("This will run before all");
	}

	@AfterEach
	void cleanup() {
		System.out.println("Cleaning......");
	}
	
	
	
	@Nested
	class sqroot{
	@Test
	@Tag("Math")
	@DisplayName("Testing Squreroot")
	void testsquareRoot() {
		javaProject jp=new javaProject();
		assertEquals(4,jp.squareRoot(16),"Should show actual SqureRoot");
	}
	
	@Test
	@Tag("Math")
	@DisplayName("Testing wheter it null or not")
	void testsnullsquareRoot() {
		javaProject jp=new javaProject();
		assertNull(jp.squareRoot(0));
	}
	}
	
	
	
	@Test
	@Tag("Math")
	@DisplayName("Testing Reverse Number")
	void testReversenumber() {
			javaProject jp=new javaProject();
			int expected = 4321;
			int actual = jp.ReverseNumber(1234);
			assertEquals(actual,expected,"Should show actual reversed number");
	}
	@Test
	@Tag("String")
	@DisplayName("Testing String")
	void testString() {
			javaProject jp=new javaProject();
			String str="check";
			int index=3;
			char out = jp.stringcheck(str, index);
			assertEquals('c',out,"Check for the character in index " +index);
	}

}
