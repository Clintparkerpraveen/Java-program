//MAINTAINS THE RECORDS OF STUDENTS
class students{
	int rollno;
	String name;
	void insertRecord(int r,String n){   //CREATING RECORD
		rollno=r;
		name=n;
	}
	void displayInformation(){System.out.println(rollno+" "+name);}  //DISPLAYS ALL THE VALUES IN RECORDS
	public static void main(String args[]){
		students s1=new students();
		students s2=new students();
		s1.insertRecord(101,"clint");	  //INSERT VALUES IN RECORD		
		s2.insertRecord(102,"parker");
		s1.displayInformation();
		s2.displayInformation();
	}
}
