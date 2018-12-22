package com.java.btth3test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.java.btth3.bt2.Rectangle;
import com.java.btth3.bt2.Square;

public class TestJunit2 {
	Square square = new Square(15.2, "yellow", false);
	Rectangle rectangle = new Rectangle(15.2, 15.2, "red", true);
	
	@Test
	public void testCanh() {
		double canh = square.getSide();
		assertEquals((double)15.3, canh);
	}
	
	@Test
	public void testMauSac() {
		String mau = square.getColor();
		assertEquals("yellow", mau);
	}
	
	@Test
	public void testMauSacRec() {
		String mau = rectangle.getColor();
		assertEquals("red", mau);
	}
	
	public void testChieuRong() {
		double chieuRong = rectangle.getWidth();
		assertEquals((double)15.3, chieuRong);
	}
	
	public void testChieuDai() {
		double chieuDai = rectangle.getLength();
		assertEquals((double)15.3, chieuDai);

	}
	
	
}
