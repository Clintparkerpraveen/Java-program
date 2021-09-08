class Student2{
     int id;
     String name;
     Student2(){System.out.println("default constructor is invoked");}

     Student2(int id,String name){
     this ();//IT IS USED TO INVOKED CURRENT CLASS CONSTRUCTOR
     this.id = id;
     this.name = name;
     }
     void display(){System.out.println(id+" "+name);}

     public static void main(String args[]){
     Student2 e1 = new Student2 (222,"SENTHIL");
     Student2 e2 = new Student2 (333,"PRAVEEN");
     e1.display();
     e2.display();
  }
}