package simple_programs;

public class Break_COntinue {

	public static void main(String[] args) {
		int i;
		for (i=1; i<=5; i++)
		{if (i==5)
		{continue;
		
		}
			
			System.out.println(i);
		}
		// DEMONSTRATE HOW TO PRINT NUMBERS WITHOUT PRINTNG 12 TO 15
		for (i=1; i<=20; i++)
		{
			if ((i>=12) && (i<=15))
					{continue;
					}
			System.out.println(i);
		}
		//DEMONTRATING BREAK STATEMENT -  WHILE PRINTING 1 TO 10 BREAK IT WHEN WE REACH THE NUMBER 8
		for (i=1; i<=10; i++)
		{
			if (i==5)
			{
				break;
			}
			System.out.println(i);
		}
 }
}
