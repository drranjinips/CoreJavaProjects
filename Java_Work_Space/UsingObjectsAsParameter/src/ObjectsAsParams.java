
public class ObjectsAsParams {
	int a,b;
	ObjectsAsParams (int i, int j){
		a=i;
		b=j;
	}
	//Return true if O is Equal to the invoking object. With this O we have created a class object now
	boolean equalto(ObjectsAsParams O) {
		if((O.a==a) &&  (O.b==b)) {
			return true;
			}
		else {
			
			return false;
		
			
		}
		
	}
	public static void main(String[] args) {
		ObjectsAsParams object1=new ObjectsAsParams(3,4);
		ObjectsAsParams object2=new ObjectsAsParams(4,5);
		ObjectsAsParams object3=new ObjectsAsParams(3,4);
		System.out.println("object1 = object2  " +  object1.equalto(object2) );
		System.out.println("object2 = object3  " +  object2.equalto(object3) );
		System.out.println("object1 = object3  " +  object1.equalto(object3) );
		
		

	}

}
