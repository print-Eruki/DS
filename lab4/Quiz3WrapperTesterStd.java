import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Quiz3WrapperTesterStd {
	Quiz3AWrapper.List<String> L;
	
	@Before
	public void setUp() throws Exception {
		 L = new Quiz3AWrapper.ArrayList<String>();

	}
	
	@Test
	public void testCase1() {
		L.clear();
		L.add("Bob");
		L.reverse();
		assertEquals("On L = {Bob}, L.reverse() fails to produce L = {Bob} ", 
				true, L.size() == 1 && L.isMember("Bob"));
	}
	
	@Test
	public void testCase2() {
		L.clear();
		L.add("Bob");
		L.add("Jil");
		L.reverse();
		assertEquals("On L = {Bob, Jil}, L.reverse() fails to produce L = {Jil, Bob} ", 
				true, L.size() == 2 && L.get(0)=="Jil" && L.get(1)=="Bob");
	}
	
	/* TODO ADD AS MANY CASES AS YOU WANT HERE */	

}
