package exercises;

public class BackPack<T> {
	private T item;
	
	public BackPack(T item){
		setItem(item);
	}

	public T getItem() {
		return this.item;
	}

	public void setItem(T item) {
		this.item = item;
	}
}
