package aaaaa;

import java.util.Stack;

public class secondprograme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack  mystack1= new Stack();
		Stack mystack2= new Stack();
		for (int i=0; i<10; i++) mystack1.push(i);
		for (int i=0; i<10; i++) mystack2.push(i);
		    System.out.println("mystack1");
		for (int i=0; i<10; i++) 
			System.out.println(mystack1.pop());
		
		for (int i=0; i<10; i++) 
		   System.out.println(mystack2.pop());
	} 

}
