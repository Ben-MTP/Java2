package com.java.btth4.bt2;

public class Division extends BinaryExpression{
	Expression left;
	Expression right;
	Division(Expression l, Expression r){
//		System.out.println("Phep chia");
		left=l;
		right=r;
        System.out.println( "Div result = " + (((Numeral) l).value / ((Numeral) r).value));

	}
}
