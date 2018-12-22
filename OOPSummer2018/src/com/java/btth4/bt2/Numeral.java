package com.java.btth4.bt2;

public class Numeral extends Expression{
	public int value;

    Numeral() {
        this.value = 0;
    }

    Numeral(int x) {
        this.value = x;
    }

	@Override
	int evaluate() {
		// TODO Auto-generated method stub
		return value;
	}


}
