package be.kuleuven.groept.application;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BracketParserTest {

	BracketParserIntf parser;
	
	@Before
	public void setUp() throws Exception {
		parser = new BracketParser();
	}

	@Test
	public void testCheckBrackets() {
		assertTrue(parser.checkBrackets("()"));
		assertTrue(parser.checkBrackets("([])"));
		assertTrue(parser.checkBrackets("([]{}<>)"));
		assertFalse(parser.checkBrackets("({)}"));
		assertFalse(parser.checkBrackets("(()"));
		assertTrue(parser.checkBrackets("(a + {5 - 8})-3"));
		assertFalse(parser.checkBrackets("())"));
	}

}
