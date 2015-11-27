
public interface DoubleLinkedList<E> {
	public abstract void offerFirst(E item);
	public abstract void offferLast(E item);
	public abstract void offer(E item);
	public abstract void removeFirst();
	public abstract void removeLast();
	public abstract void remove();
	public abstract E pollFirst();
	public abstract E pollLast();
	public abstract E poll();
	public abstract E peekFirst();
	public abstract E peekLast();
	public abstract E peek();
	public abstract boolean isEmpty();
	public abstract int size();
	public abstract int indexOf(E item);
	public abstract boolean contains(E item);
}