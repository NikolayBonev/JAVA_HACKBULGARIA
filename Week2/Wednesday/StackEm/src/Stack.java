public interface Stack<E> {
	public abstract void push(E obj);
	public abstract E pop();
	public abstract int size();
	public abstract void clear();
	public abstract boolean isEmpty();
	public abstract E peek();
	public abstract boolean contains(E item);
}
