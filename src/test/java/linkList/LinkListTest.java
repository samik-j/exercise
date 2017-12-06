package linkList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LinkListTest {

    @Test
    public void shouldAddFirst() {
        //given
        LinkList<String> list = new LinkList<>();

        //when
        list.addFirst("a");

        //then
        assertEquals(1, list.size());
    }

    @Test
    public void shouldDeleteFirst() {
        //given
        LinkList<String> list = new LinkList<>();
        list.addFirst("a");

        //when
        list.deleteFirst();

        //then
        assertTrue(list.isEmpty());
    }

    @Test
    public void shouldBeEmpty() {
        //when
        LinkList<String> list = new LinkList<>();

        //then
        assertEquals(0, list.size());
    }

    @Test
    public void sizeShouldBeTwo() {
        //given
        LinkList<String> list = new LinkList<>();

        //when
        list.addFirst("a");
        list.addFirst("b");

        //then
        assertEquals(2, list.size());
    }

}