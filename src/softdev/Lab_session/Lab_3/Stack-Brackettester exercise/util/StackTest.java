package be.kuleuven.groept.util;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This JUnit Testcase tests all methods of the Stack interface
 * 
 * @author Koen Pelsmaekers
 * 
 */
public class StackTest {

	private StackIntf<String> myStringStack;
	private StackIntf<Integer> myIntStack;

	/**
	 * Initializes a new Stack object
	 * 
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.myStringStack = new Stack<>();
		this.myIntStack = new Stack<>();
	}

	/**
	 * Test method for {@link be.kuleuven.groept.util.StackIntf#push()}.
	 */
	@Test
	public void testPush() {
		this.myStringStack.push("element1");
		assertEquals("Unable to push first element on the stack","element1", this.myStringStack.peek());
		this.myStringStack.push("element2");
		assertEquals("Unable to push more then one element on the stack","element2", this.myStringStack.peek());
	}

	/**
	 * Test method for {@link be.kuleuven.groept.util.StackIntf#pop()}.
	 */
	@Test
	public void testPop() {
		this.myStringStack.push("element1");
		this.myStringStack.push("element2");
		assertEquals("Unable to pop an element from the stack","element2", this.myStringStack.pop());
		assertEquals("Unable to pop last element from the stack","element1", this.myStringStack.pop());
		assertEquals("Stack is not empty after last element is popped",true, this.myStringStack.isEmpty());
		assertEquals("Popping an empty stack does not return null",null, this.myStringStack.pop());
	}

	/**
	 * Test method for {@link be.kuleuven.groept.util.StackIntf#peek()}.
	 */
	@Test
	public void testPeek() {
		this.myStringStack.push("element1");
		this.myStringStack.push("element2");
		assertEquals("Unable to peek at an element on the stack","element2", this.myStringStack.peek());
		this.myStringStack.pop();
		assertEquals("unable to peek at the last element on the stack","element1", this.myStringStack.peek());
		this.myStringStack.pop();
		assertEquals("Peeking to an empty stack does not return null",null, this.myStringStack.peek());
	}

	/**
	 * Test method for {@link be.kuleuven.groept.util.StackIntf#isEmpty()}.
	 */
	@Test
	public void testIsEmpty() {
		this.myStringStack.push("element1");
		this.myStringStack.push("element2");
		this.myStringStack.clear();
		assertEquals("After clearing the stack is not empty",true, this.myStringStack.isEmpty());
	}

	/**
	 * Test method for {@link be.kuleuven.groept.util.StackIntf#clear()}.
	 */
	@Test
	public void testClear() {
		assertEquals("The fresh initialised stack is not empty",true, this.myStringStack.isEmpty());
		this.myStringStack.push("element1");
		assertEquals("A one-element stack is indicated as being empty",false, this.myStringStack.isEmpty());
		this.myStringStack.push("element2");
		assertEquals("Some elements on the stack, but still it is indicated as being empty",false, this.myStringStack.isEmpty());
		this.myStringStack.pop();
		assertEquals("After popping a non empty stack is indicated as being empty",false, this.myStringStack.isEmpty());
		this.myStringStack.pop();
		assertEquals("Popping the last element on the stack does not make it empty",true, this.myStringStack.isEmpty());
	}
}
