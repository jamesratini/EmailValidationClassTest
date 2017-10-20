import static org.junit.Assert.*;


import org.junit.Test;

public class tests {

	@Test
	public void test() {
		EmailChecker ec = new EmailChecker("test@mail.com");
		assertEquals("test@mail.com",ec.getEmail());
		//
		if(!ec.hasAt())
		{
			fail("u suc");
		}
		if(!ec.hasPeriodAfterAt())
		{
			fail("no period after @");
			
		}
		
		
	}

}
