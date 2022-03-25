import java.util.NoSuchElementException;

public class LinkedListIterator<E> implements Iterator<E> {


    private LinkedList.Node<E> currentIterator;
    private LinkedList<E> myList;

    public LinkedListIterator(LinkedList<E> myList) {
        this.myList = myList;
        currentIterator = null;
    }

    public E next() {
        if(currentIterator == null) {
            currentIterator = myList.head;
        } else {
            currentIterator = currentIterator.next;
        }
        if(currentIterator == null)
            throw new NoSuchElementException("Iterator at the end or list empty");
        return currentIterator.value;
    }

    public boolean hasNext(){
        if(currentIterator == null)
            return !myList.isEmpty();
        else
            return (currentIterator.next != null);
    }
}