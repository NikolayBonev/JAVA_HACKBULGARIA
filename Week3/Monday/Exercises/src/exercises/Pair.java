package exercises;

public class Pair<T,E> {
	private T item1;
	private E item2;
	
	public Pair(T item1, E item2){
		setItem1(item1);
		setItem2(item2);
	}
	
	public T getItem1() {
		return this.item1;
	}
	public void setItem1(T item1) {
		this.item1 = item1;
	}
	public E getItem2() {
		return this.item2;
	}
	public void setItem2(E item2) {
		this.item2 = item2;
	}
	
	
}
