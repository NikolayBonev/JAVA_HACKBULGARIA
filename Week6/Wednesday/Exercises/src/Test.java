
public class Test {

	public static void main(String[] args) {
		BinarySearchTree<Integer> test = new BinarySearchTree<>();
		
		test.add(4);
		test.add(2);
		test.add(6);
		test.add(5);
		test.add(7);
		test.add(9);
		
		System.out.println(test.getHeight(9));
	}

}