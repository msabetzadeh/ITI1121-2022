public class Test{
	
	public static void main(String[] args){
		
		Stack<Integer> myStack = new ArrayStack<Integer>(100);
		
		for (int i = 0; i < args.length; i++)
			myStack.push(Integer.parseInt(args[i]));
		
		while (!myStack.isEmpty())
			System.out.print(myStack.pop()+" ");

		System.out.println();
	}
}