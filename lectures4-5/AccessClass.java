public class AccessClass  {

	public int instanceMember = 0;
	public static int classMember = 0;

	public void instanceMethod(){
		instanceMember++;
		classMember++;
	}

	public static void classMethod() {
		//instanceMember++;
		classMember++;
	}
}
