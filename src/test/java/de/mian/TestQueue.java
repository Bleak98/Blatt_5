package de.mian;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class TestQueue 
{	
	

	@Test
    public void testDequeue() 
    {
		Queue snake = new Queue(3);
		
		int a = 1;
		int b = 2;
		
		snake.enqueue(a);
		snake.enqueue(b);
		snake.enqueue(3);
		
		assertEquals("Dequeue gibt das älteste Element.",a,snake.dequeue());
		assertEquals("Dequeue gibt das älteste Element.",b,snake.dequeue());


    }
	
	@Test (expected=IllegalArgumentException.class, timeout = 1000)
	public void testQueueEx()
	{
		Queue snake = new Queue(0);
		
	}
	
	@Test (expected = IllegalStateException.class, timeout = 1000)
    public void testDequeueEx() 
    {
		Queue snake = new Queue(3);
		snake.dequeue();
    }
	

	
	
	
	
	
	
	
	
	
	
	
}
