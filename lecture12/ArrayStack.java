public class ArrayStack<E> implements Stack<E> {

	private E[] elems;
	private int top; // designates the first free cell
	
	@SuppressWarnings("unchecked")
	public ArrayStack(int capacity) {
		this.elems = (E[]) new Object[capacity];
		top = 0;
	}
	
	public boolean isEmpty() {
		return (top == 0);
	}
	public void push (E o) {
		// pre-condition: ! isFull()
		elems[top] = o;
		top++; // top = top + 1;
	}
	
	public E pop() {
		// pre-codition: ! isEmpty()
		E saved;
		top--;
		saved = elems[top];
		elems[top] = null; // scrub the memory location
		return saved;
	}
	
	public E peek() {
		// pre-codition: ! isEmpty()
		return elems[top - 1];
	}

}