package dk.com;

public class Second extends First {
	int c;
	Second(int m, int n, int o){
		super(m,n);
		c=o;
		
	}

	void display() {
		super.display();
		System.out.println("C from class Second:"+c);
	}
}
