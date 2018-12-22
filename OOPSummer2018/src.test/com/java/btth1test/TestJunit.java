package com.java.btth1test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.java.btth2.Junit;

public class TestJunit {
	//Cau 1: 
	@Test
	public void testMaxHaiSo1() {
		Junit jun1 = new Junit();
		int ketQua1 = jun1.maxHaiSo(12, 101);
		assertEquals(101, ketQua1);
	}
	
	@Test
	public void testMaxHaiSo2() {
		Junit jun2 = new Junit();
		int ketQua2 = jun2.maxHaiSo(99, 10);
		assertEquals(99, ketQua2);
	}
	
	@Test
	public void testMaxHaiSo3() {
		Junit jun3 = new Junit();
		int ketQua3 = jun3.maxHaiSo(999, 10);
		assertEquals(999, ketQua3);
	}
	
	@Test
	public void testMaxHaiSo4() {
		Junit jun4 = new Junit();
		int ketQua4 = jun4.maxHaiSo(99, 100);
		assertEquals(100, ketQua4);
	}
	
	@Test
	public void testMaxHaiSo5() {
		Junit jun5 = new Junit();
		int ketQua5 = jun5.maxHaiSo(99, 200);
		assertEquals(200, ketQua5);
	}
	
	//Cau 2:
	@Test
	public void testMinArray1() {
		Junit jun2 = new Junit();
		assertEquals(11, jun2.minArray());
	}
	
	@Test
	public void testMinArray2() {
		Junit jun2 = new Junit();
		assertEquals(12, jun2.minArray());
	}
	
	@Test
	public void testMinArray3() {
		Junit jun2 = new Junit();
		assertEquals(13, jun2.minArray());
	}
	
	@Test
	public void testMinArray4() {
		Junit jun2 = new Junit();
		assertEquals(14, jun2.minArray());
	}
	
	@Test
	public void testMinArray5() {
		Junit jun2 = new Junit();
		assertEquals(15, jun2.minArray());
	}
	
	//Cau 3:
	@Test
	public void testBMITest1() {
		Junit jun3 = new Junit();
		assertEquals("Thieu Can",jun3.BMITest(50, (float) 1.8));
	}
	
	@Test
	public void testBMITest2() {
		Junit jun3 = new Junit();
		assertEquals("Binh Thuong",jun3.BMITest(65, (float) 1.8));
	}
	
	@Test
	public void testBMITest3() {
		Junit jun3 = new Junit();
		assertEquals("Thua Can",jun3.BMITest(75, (float) 1.8));
	}
	
	@Test
	public void testBMITest4() {
		Junit jun3 = new Junit();
		assertEquals("Beo Phi",jun3.BMITest(80, (float) 1.6));
	}
	
	@Test
	public void testBMITest5() {
		Junit jun3 = new Junit();
		assertEquals("Thieu Can",jun3.BMITest(50, (float) 1.7));
	}
}
