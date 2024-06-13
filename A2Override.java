package dk.com;

class A1 {
    void m1() {
        System.out.println("in method m1 of A1");
    }
}

public class A2Override extends A1 {
    void m1() {
        System.out.println("in method m1 of A2Override"); 
    }

    public static void main(String[] args) {

        A2Override x = new A2Override();
        x.m1(); 
    }
}
