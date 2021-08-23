//EXAMPLE OF METHOD OVERLOADING WITH TYPEPROMOTION

class Overload2{  
	  void sum(int a,long b){System.out.println(a+b);}  
	  void sum(int a,int b,int c){System.out.println(a+b+c);}  
	  
	  public static void main(String args[]){  
	  Overload2 obj=new Overload2();  
	  obj.sum(10,20);//now second int literal will be promoted to long  
	  obj.sum(10,20,30);  	  	  
	  }  
}  