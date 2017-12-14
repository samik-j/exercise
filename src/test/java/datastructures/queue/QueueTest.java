package datastructures.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    public void shouldCreateEmptyQueue() {
        // when
        Queue<String> queue = new Queue<>(String.class, 5);

        // then
        assertTrue(queue.isEmpty());
    }

    @Test
    public void shouldInsert() {
        // given
        Queue<String> queue = new Queue<>(String.class, 5);

        // when
        queue.insert("a");

        // then
        assertEquals(1, queue.size());
        assertEquals("a", queue.peek());
    }

    @Test
    public void queueShouldWrapAroundWhenInsert() {
        // given
        Queue<String> queue = new Queue<>(String.class, 2);
        queue.insert("a");
        queue.insert("b");
        queue.remove();

        // when
        queue.insert("c");

        // then
        assertTrue(queue.isFull());
        assertEquals("b", queue.peek());
    }

    @Test
    public void insertShouldThrowExceptionWhenQueueIsFull() {
        // given
        Queue<String> queue = new Queue<>(String.class, 1);
        queue.insert("a");

        // then
        assertThrows(FullQueueException.class, () ->
        {
            queue.insert("a");
        });
    }

    @Test
    public void shouldRemove() {
        // given
        Queue<String> queue = new Queue<>(String.class, 2);
        queue.insert("a");
        queue.insert("b");

        // when
        String result = queue.remove();

        // then
        assertEquals("a", result);
        assertEquals(1, queue.size());
    }

    @Test
    public void RemoveShouldThrowExceptionWhenQueueIsFull() {
        // given
        Queue<String> queue = new Queue<>(String.class, 1);

        // then
        assertThrows(EmptyQueueException.class, () ->
        {
            queue.remove();
        });
    }

    @Test
    public void queueShouldWrapAroundWhenRemove() {
        // given
        Queue<String> queue = new Queue<>(String.class, 2);
        queue.insert("a");
        queue.insert("b");
        queue.remove();
        queue.insert("c");

        // when
        String result = queue.remove();

        // then
        assertEquals("b", result);
    }

    @Test
    public void peekShouldReturnFrontItem() {
        // given
        Queue<String> queue = new Queue<>(String.class, 5);
        queue.insert("a");
        queue.insert("b");
        queue.remove();

        // when
        String result = queue.peek();

        // then
        assertEquals("b", result);
    }

}