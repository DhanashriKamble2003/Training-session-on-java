package dk.com;
	class Vehicle{  
		
		  void run(){System.out.println("Vehicle is running");}  
		}  
	
	
		//Creating a child class  
	
		class A3 extends Vehicle{  
			
		  public static void main(String args[]){  
		  //creating an instance of child class  
		 A3 obj = new A3();  
		  //calling the method with child class instance  
		  obj.run();  
		  }  
		}  