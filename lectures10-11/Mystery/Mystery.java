public class Mystery{
	
	public static void main(String[] args){
		
		Stack myStack = 
			new StackImplementation(10);
		
		for (int i = 0; i < args.length; i++)
			myStack.push(args[i]);
		
		while (!myStack.isEmpty())
			System.out.print((String)myStack.pop()+" ");

		System.out.println();
	}
}
