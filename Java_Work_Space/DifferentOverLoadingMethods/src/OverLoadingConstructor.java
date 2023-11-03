
public class OverLoadingConstructor {
 // Demonstrating three constructors made in overloading method	
	int length;
	int width;
	int bredth;
	//In below codes constructors used when all dimensions are specified
	OverLoadingConstructor(int l, int w, int b){
		length=l;
		width=w;
		bredth=b;
	}
	//constructors used when no dimensions are specified
	OverLoadingConstructor(){
		length=2;
		width=3;
		bredth=7;
	}
	//constructors used to calculate for a cube
	
	OverLoadingConstructor(int l){
		length=width=bredth=l;
	}
	int volume() {
		return (length*width*bredth);
	}
	
	public static void main(String[] args) {
		 OverLoadingConstructor Box1=new  OverLoadingConstructor(2,3,4);
		 OverLoadingConstructor Box2=new  OverLoadingConstructor();
		 OverLoadingConstructor Box3=new  OverLoadingConstructor(2);
		 System.out.println("Volume of box1 "+ Box1.volume()); 
		 System.out.println("Volume of box2 "+ Box2.volume()); 
		 System.out.println("Volume of box3 "+ Box3.volume()); 
		 
	

	}

}
