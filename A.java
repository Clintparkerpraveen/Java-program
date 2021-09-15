class A{  
A getA(){  
return this;  
}  
void msg(){System.out.println("Welcome home");}  
}  
  
class Test1{  
public static void main(String args[]){  
new A().getA().msg();  
}  
}  
