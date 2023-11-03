
public class OvereLoadingOne {
	void Test(){
		System.out.println("Just Printing is Happening");
	}
	void Test(int i)
	{
		System.out.println("The Square of the number is " + (i*i));
	}
	void Test(int i, int j)
	{
		System.out.println("The sum  of the numbers is " + (i + j));
	}
	void Test(int i, int j, int k)
	{
		System.out.println("The product   of the numbers is " + (i*j*k));
	}
	public static void main(String[] args) {
		
		OvereLoadingOne Object = new OvereLoadingOne();// We are creating a class object in the main class
		//Using the next line of codes we are calling all the 4 functions we want to do through Tet
		//Here Test function is overloaded 4 times
		Object.Test();
		Object.Test(3);
		Object.Test(2,3);
		Object.Test(2,3,4);
		
		

	}

}
