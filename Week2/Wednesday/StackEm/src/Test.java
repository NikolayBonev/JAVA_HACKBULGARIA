public class Test {

	public static void main(String[] args) {
		StackImpl<Integer> test = new StackImpl<Integer>();

		Integer int1 = new Integer(4);
		test.push(int1);
		test.push(new Integer(5));
		test.push(new Integer(6));
		
		System.out.println(test.contains(new Integer(6)));
		
		System.out.println(test.peek());
		System.out.println(test.pop());
		System.out.println(test.peek());
	}

}
