package com.java.btth4.bt2;

public class Multiplication extends BinaryExpression{
	Expression left;
	Expression right;
	public Multiplication(Expression l,Expression r){
//        System.out.println("Phep nhan");
        left = l;
        right = r;
        Expression right = r;
        System.out.println("Mul result = " + (((Numeral) l).value * ((Numeral) r).value));
    }
    public int evaluate() {
		return left.evaluate()*right.evaluate();
	}
}
