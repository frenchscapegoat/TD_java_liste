public class A {
	int na;
	
	public static void main (String args []){
		B b = new B();
		A a1 = new A();
		a1.na = 2;
		
		System.out.println ("Avant appel : " + a1.na);
		b.m(a1);
		System.out.println ("Après appel : " + a1.na);
		
	}
}

class B{
	void m(A a2) {
		a2.na = 10;
		a2 = new A();
	}
}