public class ArrayStack<E> implements Stack<E> {

	public static final int INITIAL_CAPACITY = 10;
	private E[] elems;
	private int top;


	@SuppressWarnings("unchecked")
	public ArrayStack() {
		elems = (E[]) new Object[INITIAL_CAPACITY];
		top = 0;
	}

	public boolean isEmpty() {
		return top == 0;
	}

	@SuppressWarnings("unchecked")
	public E push(E elem) {

		if (top == elems.length) {
			Object[] tmp = new Object[2 * elems.length];
			for (int i = 0; i < elems.length; i++) {
				tmp[i] = elems[i];
			}
			elems = (E[]) tmp;
		}

		elems[top] = elem;
		top++;

		return elem;
	}

	public E pop() {

		E saved;

		top--;
		saved = elems[top];
		elems[top] = null;

		return saved;
	}

	public E peek() {
		return elems[top - 1];
	}

	public String toString() {

		StringBuffer buffer = new StringBuffer();

		buffer.append("bottom->[");

		for (int i = 0; i < top; i++) {

			buffer.append(elems[i]);

			if (i < top - 1) {
				buffer.append(", ");
			}
		}

		buffer.append("]<-top");

		return buffer.toString();
	}
}