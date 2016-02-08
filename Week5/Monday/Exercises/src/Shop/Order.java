package Shop;

import java.util.HashMap;

public class Order {
	private HashMap<Integer, Integer> order = null;

	public Order(HashMap<Integer, Integer> order) {
		this();
		this.order.putAll(order);
	}

	public Order() {
		this.order = new HashMap<>();
	}
	
	public void addQuantity(int productId, int quantity){
		if(order.containsKey(productId)){
			order.replace(productId, order.get(productId) + quantity);
		}else{
			order.put(productId, quantity);
		}
	}
	
	public HashMap<Integer, Integer> getOrder() {
		return order;
	}

	public void removeQuantity(int productId, int quantity){
		if(order.containsKey(productId)){
			order.replace(productId, order.get(productId) - quantity);
		}
	}
	
	public void removeProduct(int productId){
		if(order.containsKey(productId)){
			order.remove(productId);
		}
	}
}