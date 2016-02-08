import java.util.*;

public class ReverseCollection{
	public static <E> void reverse (Collection<E> collection){
		List<E> arrList = new ArrayList<E>();
		
		for(int i = 0 ; i <= collection.size() ; i++){
			int current = 0;
			
			for(E element : collection){
				if(current == collection.size() - i){
					arrList.add(element);
					break;
				}
				
				current++;
			}
		}
		
		collection.clear();
		
		for(E element : arrList){
			collection.add(element);
		}
	}
	
	public static void main(String[] args){
		Queue<Integer> list = new LinkedList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		for(Integer i : list){
			System.out.println(i);
		}
		
		reverse(list);
		
		for(Integer i : list){
			System.out.println(i);
		}
	}
}