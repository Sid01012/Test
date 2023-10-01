package public_1;

import public_.A;
// Different package non sub class
public class D extends A{
	public static void main(String[] args) {
		D d1=new D();
		d1.test();
		System.out.println(d1.k);
	}

}
