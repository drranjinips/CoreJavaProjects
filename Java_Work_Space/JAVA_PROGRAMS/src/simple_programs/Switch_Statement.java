package simple_programs;

public class Switch_Statement {

	public static void main(String[] args) {
		// Java Program to check the size of a paragraph is it big or small or medium by looking at the number of words
		// using the switch...case statement
		int number_of_words=21;
		String size;
		switch (number_of_words)
		{case 80:
			size="large";
			System.out.println(size);
			break;
		 case 78:	
			size="medium";
			System.out.println(size);
		    break;
		 case 10:	
			size="small";
			System.out.println(size);
			break;
		default:
			System.out.println("Entered Number is  not there in any of the switch statements");
			
		}

	}

}
