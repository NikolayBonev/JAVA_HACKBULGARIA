import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class OnOff<T> {
	
	private List<T> elements;
	
	public OnOff(){
		this.elements = new ArrayList<T>();
	}
	
	public OnOff(Collection<T> collection){
		this();
		this.elements.addAll(collection);
	}
	
	public void add(T element){
		if(elements.contains(element)){
			elements.remove(element);
		}else{
			elements.add(element);
		}
	}
}
