package com.java.btth4.bt2;

public class ExpressionTest {
	public static void main(String[] args) {
		Expression a = new Numeral(10);
		Expression b = new Numeral(2);
		
//		System.out.println("left = " + a);
//        System.out.println("right = " +b);
        
        Addition add = new Addition();
        Subtraction sub = new Subtraction(a, b);
        Multiplication mul = new Multiplication(a, b);
        Division div = new Division(a, b);
        
        Expression tmp = new Numeral(10);
        Expression exp = new Square((tmp));
        exp = new Numeral((exp.evaluate() - 1 + 2 * 3));
        exp = new Square(exp);
        System.out.print("(10^2 - 1 + 2*3)^2 = ");
        System.out.println(exp.evaluate());
	}
}
