package linkList;

public class LinkList<T> {

    private Link firstLink;
    private int size;

    public LinkList() {
        firstLink = null;
        size = 0;
    }

    public void addFirst(T t) {
        Link newLink = new Link(t);
        newLink.nextLink = firstLink;
        firstLink = newLink;

        size++;
    }

    public boolean isEmpty() {
        return firstLink == null;
    }

    public Link deleteFirst() {
        Link tempLink = firstLink;
        firstLink = firstLink.nextLink;

        size--;

        return tempLink;
    }

    public int size() {
        return size;
    }

    public void display() {
        Link currentLink = firstLink;

        while (currentLink != null) {
            System.out.println(currentLink.toString());

            currentLink = currentLink.nextLink;
        }
    }

    private class Link {

        private T t;
        private Link nextLink;

        Link(T t) {
            this.t = t;
        }

        @Override
        public String toString() {
            return t.toString();
        }
    }
}
