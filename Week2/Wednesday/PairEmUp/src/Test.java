public class Test {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException{
		
		Pair pr1 = new Pair(new Integer(2), new Integer(3));
		Pair pr2 = new Pair(new Integer(2), new Integer(2));
		
		System.out.println(pr1.equals(pr2));
	}
}