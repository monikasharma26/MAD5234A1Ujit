import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestClass {

	@Test
	public void TestAdd() {
		//fail("Not yet implemented");
		
		Calculator la= new Calculator();
		float expectedresult = la.add(12, 12);
		float result = 24;
		assertEquals(expectedresult, result);
		
		
	}
	
}
