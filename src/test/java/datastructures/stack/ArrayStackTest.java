package datastructures.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayStackTest {

    @Test
    public void shouldCreateEmptyStack() {
        // when
        ArrayStack<String> stack = new ArrayStack<String>(String.class, 2);

        // then
        assertEquals(2, stack.size());
        assertFalse(stack.isFull());
        assertTrue(stack.isEmpty());
    }

    @Test
    public void shouldPush() {
        // given
        ArrayStack<String> stack = new ArrayStack<String>(String.class, 2);

        // when
        stack.push("s");

        // then
        assertEquals(0, stack.top());
        assertEquals("s", stack.peek());
    }

    @Test
    public void pushShouldThrowExceptionIfStackIsFull() {
        // given
        ArrayStack<String> stack = new ArrayStack<String>(String.class, 2);
        stack.push("a");
        stack.push("a");

        // then
        assertThrows(FullStackException.class, () ->
        {
            stack.push("a");
        });
    }

    @Test
    public void shouldPop() {
        // given
        ArrayStack<String> stack = new ArrayStack<String>(String.class, 2);
        stack.push("s");

        // when
       stack.pop();

        // then
        assertTrue(stack.isEmpty());
    }

    @Test
    public void popShouldThrowExceptionIfStackIsEmpty() {
        // given
        ArrayStack<String> stack = new ArrayStack<String>(String.class, 2);

        // then
        assertThrows(EmptyStackException.class, () ->
        {
            stack.pop();
        });
    }

    @Test
    public void peekShouldThrowExceptionIfStackIsEmpty() {
        // given
        ArrayStack<String> stack = new ArrayStack<String>(String.class, 2);

        // then
        assertThrows(EmptyStackException.class, () ->
        {
            stack.peek();
        });
    }

}