package creatingClass_assigning_cassobjects;

public class ParameterizedClassConstruction {
	int length;
	int width;
	int bredth;
	ParameterizedClassConstruction(int l, int w, int b){
		length = l;
		 width =w;
		 bredth = b;
	}
	int volume() {
	 return (length * width * bredth);
	}
	public static void main(String[] args) {
		ParameterizedClassConstruction Box1=new ParameterizedClassConstruction(2,3,4);
		ParameterizedClassConstruction Box2=new ParameterizedClassConstruction(3,4,5);
		System.out.println("Volume of box1 is " +  Box1.volume());
		System.out.println("Volume of box2 is " +  Box2.volume());
		
	}

}
