package com.a210;

import java.io.IOException;

class M {
	void m() throws IOException {
		System.out.println("M exe");
	}
}

class N extends M {
	void n() throws IOException {
		System.out.println("N exe");
	}
}

class P extends N {
	void p() {
		System.out.println("P exe");
	}
}

public class ThrowsEx {
	
	public static void main(String[] args) throws IOException {
		
		P p = new P();
		
		p.m();
		p.n();
		p.p();
		
	}
	
	
}
