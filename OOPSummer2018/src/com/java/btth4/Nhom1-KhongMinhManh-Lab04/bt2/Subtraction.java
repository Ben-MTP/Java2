package com.java.btth4.bt2;

public class Subtraction extends BinaryExpression{
	Expression left;
    Expression right;
	public Subtraction(Expression l, Expression r) {
//        System.out.println("Phep tru");
        left = l;
        right = r;
        System.out.println( "Sub result = " + (((Numeral) l).value - ((Numeral) r).value));

    }

    public int evaluate() {
        return left.evaluate() - right.evaluate();
    }

}
