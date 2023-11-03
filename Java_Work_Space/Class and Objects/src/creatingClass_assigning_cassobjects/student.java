package creatingClass_assigning_cassobjects;

public class student {
    int id;
    String name;
	public static void main(String[] args) {
		//DEMONSTRATING HOW TO CREATE A CLASS CALLED STUDENTS. AND HOW TO ADD 3 STUDENTS DATA TO THAT CLASS
		student student1= new student();
		student1.id=100;
		student1.name="Rani";
		System.out.println(student1.id  + " " + student1.name );
		student student2 = new student();
		student2.id=101;
		student2.name="Ravi";
		System.out.println(student2.id  + " " + student2.name );
		student student3= new student();
		student3.id=102;
		student3.name="Ramu";
		
		System.out.println(student3.id  + " " + student3.name );

	}

}
