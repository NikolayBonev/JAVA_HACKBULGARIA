package exercises;

public class Triple<T, E, K> {
	private T item1;
	private E item2;
	private K item3;
	
	public Triple(T item1, E item2, K item3){
		setItem1(item1);
		setItem2(item2);
		setItem3(item3);
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
	public K getItem3() {
		return this.item3;
	}
	public void setItem3(K item3) {
		this.item3 = item3;
	}
	
	
}
