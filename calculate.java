//EXAMPLE OF METHOD OVERLOADING BY CHANGING THE NO.OF ARGUMENTS 

class calculation{
	void sum(int a,int b){System.out.println(a+b);}
	void sum(int a,int b,int c){System.out.print(a+b+c);}
	public static void main(String args[]){
		calculation add=new calculation();
		add.sum(40,60);
		add.sum(20,30,40);
	}
}