package de.mian;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestUtil 
{
	@Test
	public void testIstErstesHalbjahr()
	{
		int testwert = 3;
		int testwert1 = 7;
		int testwert2 = 15;

		
		assertTrue("Ist im ersten Halbjahr.",Util.istErstesHalbjahr(testwert) );
		//assertTrue("Ist nicht im ersten Halbjahr.",Util.istErstesHalbjahr(testwert1) );
		//assertTrue("ungültiger Wert.",Util.istErstesHalbjahr(testwert2) );

		
		
		
	}
	
	
	
	
}
