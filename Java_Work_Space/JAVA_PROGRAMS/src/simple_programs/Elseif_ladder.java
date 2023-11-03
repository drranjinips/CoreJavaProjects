package simple_programs;

public class Elseif_ladder {

	public static void main(String[] args) {
		int per=81;
		if (per>=70)
		{
		System.out.println("Distinction");
		}
		else if(per>=60)
		{
		System.out.println("First Class");
		}
		else if(per>=50)
		{
		System.out.println("Second Class");
		}
		else if(per>=40)
		{
		System.out.println("Pass");
		}
		else
		{
		System.out.println("Failed");
		}
		// DEMONSTRATION OF IF ELSE LADDER - TO CHECK THA TAX PAYER IN WHICH SLAB	
		long sal=7400000000l;
		if (sal>=70000)
		{
		 System.out.println("Tax Third Slab");
		}
		else if(sal>=60000) 
		{
			System.out.println("Tax Second Slab");
		}
		else
		{
			System.out.println("Tax no Slab");
		}
	}

}
