public class AccessClassTest {

	public static void main(String[] args){

		AccessClass tc = new AccessClass();

		tc.instanceMember++;
		tc.classMember++;
		tc.instanceMethod();
		tc.classMethod();

		AccessClass.classMember++;
		AccessClass.classMethod();
		//AccessClass.instanceMember++;
		//AccessClass.instanceMethod();

		AccessClass tc2 = new AccessClass();

		System.out.println(" For tc, instanceMember is " 
			+ tc.instanceMember + " and classMember is "
			+ tc.classMember);
		System.out.println(" For tc2, instanceMember is " 
			+ tc2.instanceMember + " and classMember is "
			+ tc2.classMember);

		tc2.instanceMember++;
		tc2.classMember++;

		System.out.println(" For tc, instanceMember is " 
			+ tc.instanceMember + " and classMember is "
			+ tc.classMember);
		System.out.println(" For tc2, instanceMember is " 
			+ tc2.instanceMember + " and classMember is "
			+ tc2.classMember);
	}
}
