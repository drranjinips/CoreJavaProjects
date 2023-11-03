package simple_programs;

public class MathOperations {

	public static void main(String[] args) {
		//Declare Variables
		int a=30;
		int b=12;
		// addition and Subtraction operator
		System.out.println("The sum is " + (a+b));
		System.out.println("The Difference  is " + (a-b));
		// multiplication and Diviision  operator
		System.out.println("The Product is  " + (a*b));
		System.out.println("The Quotient is  "  + (a/b));
		//  modulo operator -  It gives the Remainder
		System.out.println("The Modulo  is  " + (a%b));
		/*Division Operator

        Note the operation, a / b in our program. The / operator is the division operator.
        If we use the division operator with two integers, then the resulting quotient will also be an integer. 
        And, if one of the operands is a floating-point number, we will get the result will also be in floating-point.
		*/
		// UNDERSTANDING DIVISION OPERATOR PROPERLY WITH EXAMPLES
		System.out.println(5/2);
		System.out.println(5.0/2.0);
		//UNDERSTANDING MODULO OPERATOR - The modulo operator mainly used with Integers
		//ASSIGNMENT OPERATOR
		int c=10;
		int d;
		d=c;
		System.out.println("Th Value of c is assigned to d " + d);
		// ASSIGNING STRING OPERATORS
		String name;
		name=" Life is Beautiful";
		System.out.println("The String is " + name);
		
		
		//JAVA RELATIONAL OPERATORS == If numbers are qqual it will print true
		int num1=10;
		int num2=10;
		
		System.out.println(num1==num2);
		int num3=30;
		int num4=40;
		System.out.println(num3!=num4);
		System.out.println(num3>=num4);
		System.out.println(num3<=num4);
		
		/* DEMONSTRATION OF LOGICAL AND(&&) , LOGICAL OR(||), LOGICAL NOT - !(EXPRESSION)
		 * && LOGICAL AND 
		 * || LOGICAL OR 
		 * LOGICAL NOT - !(EXPRESSION) - iT WILL SHOW TRUE IF THE EXPRESSION IS FALSE AND VICE VERSA
		 */
		
		System.out.println( (10 >3) && (4>2)); // If both the conditions are true it will print true as the answer
		System.out.println( (10 >3) || (3>10)); //If one among  the conditions are true it will print true as the answer
		System.out.println( (10 <3) || (3>10)); // Since both the condition is false it will print as false
		System.out.println( !(10 >3)); // Here the expression inside the bracket is true , so give the output as false
		/* JAVA UNARY OPERATORS
		 * Unary plus: not necessary to use since numbers are positive without using it
		 * Unary minus: inverts the sign of an expression
		 * Increment operator: increments value by 1
		 * Decrement operator: decrements value by 1
		 * Logical complement operator: inverts the value of a boolean
		 */
		// DEMONSTRATION OF  UNARY OPERATORS - ++ will increase the value by 1 and -- will decrease the value by 1
		/*In the above program, we have used the ++ and -- operator as prefixes (++a, --b). 
		  We can also use these operators as postfix (a++, b++)*/
		int num5=20;
		int num6=10;
		System.out.println("++ will increase 20 to 21 , "  + (++num5));
		System.out.println("-- will decrease 10 to  9 , "  + (--num6));
		
		// DEMONSTRATION OF VARIOUS DATA TYPES
		 // Creating and initializing custom character 
          char letter = 'G'; 
          System.out.println("The alphabet is , " + letter); 
        // Integer data type is generally used for numeric values 
          int i = 89; 
          //int j=123456789
          /*System.out.println("The number is , " + j); // This will through the error Since int can store only 8 digits*/
          byte mynum = 12; 
          System.out.println("The number is , " + mynum); 
          byte mynum1 = 27; 
          System.out.println("The number is , " + mynum1); 
          // The below code will give error as number is larger than byte range 
          // byte b1 = 7888888955; 
          short s = 56;
          System.out.println("The number s is , " + s);
       // The below code will  give error as number is larger than short range 
          // short s1 = 87878787878; 
          // DEMONSTRATION OF DOUBLE AND FLOAT DATA TYPES
          double d1 = 4.355453532; 
          double d2 = 4.355453532d;
          System.out.println("The number d1 is , " + d1);
          System.out.println("The number d2 is , " + d2);
         // for float use 'f' as suffix as standard 
          float f2 = 4.355453532f;
          System.out.println("The number f2 is , " + f2);
          
          // DEMONSTRATION OF LEFT SHIFT AND RIGHT SHIFT
          int x = 5;
          int y1 = x<<1;
          int y2 = x << 2;
          int y3 = x << 3;
          int y4 = x << 4;
          System.out.println("The first left shift eqivallent number is , " + y1);
          System.out.println("The second left shift eqivallent number is , " + y2);
          System.out.println("The Third left shift eqivallent number is , " + y3);
          System.out.println("The forth left shift eqivallent number is , " + y4);
       // DEMONSTRATION OF RIGHT SHIFT 
          int Z = 80;
          int z1 = Z>>1;
          int z2 = Z >> 2;
          int z3 = Z >> 3;
          int z4 = Z >> 4;
          System.out.println("The first right shift eqivallent number is , " + z1);// answer 40
          System.out.println("The second right shift eqivallent number is , " + z2); // answer 20
          System.out.println("The Third right shift eqivallent number is , " + z3); // answer 10
          System.out.println("The forth right shift eqivallent number is , " + z4); // answer 5
          
          
          
 
        		  
          
		
		
		
		
		
	}

}
