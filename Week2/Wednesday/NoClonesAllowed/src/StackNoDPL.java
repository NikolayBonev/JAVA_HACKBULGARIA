public class StackNoDPL<E> extends StackImpl<E>{
	@Override
	public void push(E obj){
		
		if(super.contains(obj)){
			try {
				throw new DuplicateElementExeption("Already there is this element!");
			} catch (DuplicateElementExeption e) {
				e.printStackTrace();
			}
		}
		
		super.push(obj);
	}
}
