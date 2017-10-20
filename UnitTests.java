import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UnitTests
{

	@Before
	public void setUp() throws Exception
	{
		
	}

	@After
	public void tearDown() throws Exception
	{
		
	}

	@Test
	public void testEmailChecker()
	{
		EmailChecker checker = new EmailChecker();
		assertFalse(checker == null);
		
		assertFalse(checker.check("bademail"));
		assertFalse(checker.check("bad#email@"));
	}

}
