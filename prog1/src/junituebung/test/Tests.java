package junituebung.test;
import static org.junit.Assert.*;
import junituebung.src.TestObject;

import org.junit.*;


public class Tests {

	TestObject testy = new TestObject();
	@Test
	public void haelfteGleich2() {
		
		assertEquals(2, testy.gibHaelfte(4));
	}
	
}
