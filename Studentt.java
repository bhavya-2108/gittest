package exception;

 class Studentt {
	
	     int rollno;  
	     String name;  
	     static String college = "ITS";  
	     //static method to change the value of static variable  
	     static void change(){  
	     college = "BBDIT";  
	     }  
	     //constructor to initialize the variable  
	     Studentt(int r, String n){  
	     rollno = r;  
	     name = n;  
	     }  
	     //method to display values  
	     void display(){System.out.println(rollno+" "+name+" "+college);}  
	}  
	//Test class to create and display the values of object  
	 class TestStaticMethod{  
	    public static void main(String args[]){  
	    Studentt.change();//calling change method  
	    //creating objects  
	    Studentt s1 = new Studentt(111,"Karan");  
	    Studentt s2 = new Studentt(222,"Aryan");  
	    Studentt s3 = new Studentt(333,"Sonoo");  
	    //calling display method  
	    s1.display();  
	    s2.display();  
	    s3.display();  
	    }  
	}  
