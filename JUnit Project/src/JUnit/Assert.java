package JUnit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Assert {
	@Test
	public void testAssertions() {
		String str1 = new String("siva");
		String str2 = new String("siva");
		String str3 = null;
		String str4 = "siva";
		String str5 = "siva";
		int a = 10;
		int b = 12;
		String[] expectedArray = {"siva","sai","kavi","eswar"};
		String[] resultArray = {"siva","sai","kavi","eswar"};
		assertEquals(str1, str2);
		assertTrue(a<b);
		assertFalse(a>b);
		assertNotNull(str1);
		assertNull(str3);
		assertSame(str4,str5);
		assertNotSame(str1,str2);
		assertArrayEquals(expectedArray, resultArray);
		
		
		
	}

}
