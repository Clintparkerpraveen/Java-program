	//PROGRAM OF CHANGING THE COMMON PROPERTY OF ALL OBLECTS(STATIC FIELD)
	  
	class Student9{  
	     int rollno;  
	     String name;  
	     static String college = "ITS";  
	       
	     static void change(){  
	     college = "BBDIT";  
	     }  
	  
	     Student9(int r, String n){  
	     rollno = r;  
	     name = n;  
	     }  
	     void display (){System.out.println(rollno+" "+name+" "+college);} 
	    public static void main(String args[]){  
	    Student9.change();  
	    Student9 s1 = new Student9 (234,"PRAVEEN RAJ");  
	    Student9 s2 = new Student9 (334,"PRIYA");  
	    Student9 s3 = new Student9 (432,"RAM");  
	  
	    s1.display();  
