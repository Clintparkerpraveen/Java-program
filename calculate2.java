//EXAMPLE OF METHOD OVERLOADING BY CHANGING DATA TYPE OF ARUGUMENT 

class calculation2{
	void sum(int a,int b){System.out.println(a+b);}
	void sum(double a,double b){System.out.println(a+b);}
	public static void main(String args[]){
		calculation2 add=new calculation2();
		add.sum(12,17);
		add.sum(9.5,13.5);
	}
}