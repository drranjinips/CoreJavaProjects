package creatingClass_assigning_cassobjects;

public class ThisKeyWord {
		int length;
		int width;
		int bredth;
		ThisKeyWord(int l, int w, int b){
			this.length= l;
			this.width=w;
			this.bredth=w;
			
		}
		int volume(){
		 return (length*width*bredth);	
		}
		
	public static void main(String[] args) {
		ThisKeyWord Box1= new ThisKeyWord(2,3,4);
		ThisKeyWord Box2= new ThisKeyWord(5,6,7);
		System.out.println("The volume of Box1 is  " + Box1.volume());
		System.out.println("The volume of Box2 is  " + Box2.volume());
		

	}

}
/* It is illegal in Java to declare two local variables with the same inside the same class.
 * So we can use "this"  to assaign the value to the varable.
 */
*/