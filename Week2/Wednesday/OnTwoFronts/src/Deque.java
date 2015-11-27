import java.util.NoSuchElementException;

public class Deque<E> implements DoubleLinkedList<E>{
	private class Node<E>{
		Node<E> left, right;
		E item;
		
		public Node() {
			this.left = null;
			this.right = null;
			this.item = null;
		}
		public Node(E item) throws NullPointerException{
			this();
			
			if (item == null) { 
		    	  throw new NullPointerException();
		    }
			
			this.item = item;
		}
		public Node(E item, Node<E> nextElem) throws NullPointerException{
			this(item);
			this.right = nextElem;
			nextElem.left = this;
		}
		public Node(Node<E> prevElem, E item) throws NullPointerException{
			this(item);
			this.left = prevElem;
			prevElem.right = this;
		}
	}
	
	private Node head;
	private Node tail;
	private int count;
	
	public Deque() {
		this.head = null;
		this.tail = null;
		this.count = 0;
	}
	
	@Override
	public void offerFirst(E item) {
		if(head == null){
			head = new Node(item);
			tail = head;
		}else{
			head = new Node(item, head);	
		}
		
		count++;
	}
	@Override
	public void offferLast(E item) {
		if(head == null){
			head = new Node(item);
			tail = head;
		}else{
			tail = new Node(tail, item);
		}
		
		count++;
	}
	@Override
	public void offer(E item){
		offferLast(item);
	}
	@Override
	public void removeFirst() {
		E item = pollFirst();
		
		if(item == null){
			throw new NoSuchElementException();
		}	
	}
	@Override
	public void removeLast() {
		E item = pollLast();
		
		if(item == null){
			throw new NoSuchElementException();
		}
	}
	@Override
	public void remove() {
		removeLast();
	}
	@Override
	public E pollFirst() {
		if(isEmpty()){
			return null;
		}
		
		E item = (E) head.item;
		count--;
		
		if (count==0) {
			head = null;
		    tail = null;
		} else {
			head = head.right;
			head.left = null;
		}
		
		return item;
	}
	@Override
	public E pollLast() {
		if(isEmpty()){
			return null;
		}
		
		Node correntNode = tail;
		count --;
		 
		if (count==0) {
			head = null;
		    tail = null;
		} else {
			tail = correntNode.left;
			tail.right = null;
		}
		
		return (E) correntNode.item;
	}
	@Override
	public E poll() {
		return pollLast();
	}
	@Override
	public E peekFirst() {
		return (E) head.item;
	}
	@Override
	public E peekLast() {
		return (E) tail.item;
	}
	@Override
	public E peek() {
		return peekLast();
	}
	@Override
	public boolean isEmpty() {
		if(head == null){
			return true;
		}
		
		return false;
	}
	@Override
	public int size() {
		return count;
	}
	@Override
	public int indexOf(E item) {
		int index = 0;
		Node currentNode = head;
		 
		while (currentNode != null) {
			if (currentNode.item.equals(item)) {
				return index;
		    }
			 
			currentNode = currentNode.right;
		    index++;   
		}
		 
		return -1;
	}
	@Override
	public boolean contains(E item) {
		int index = indexOf(item);
		boolean found = (index != -1);
		 
		return found;   
	}

}