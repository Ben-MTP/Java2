package com.java.btth3test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.java.btth3.bt1.CamNamPhong;

public class TestJunit1 {
	CamNamPhong cam1 = new CamNamPhong(12000, "Thai Binh", "12/12/2017", 1000);
	//TestCamNamPhong:
	@Test
	public void testGiaBanCamNamPhong() {
		int giaBan = cam1.getGiaBan();
		assertEquals(12000, giaBan);
	}
	
	@Test
	public void testXuatXuCamNamPhong() {
		String xuatXu = cam1.getXuatXu();
		assertEquals("Hai Phong", xuatXu);
	}
	
	@Test
	public void testSoLuong() {
		int soLuong = cam1.getSoLuong();
		assertEquals(1000, soLuong);
	}
	
	@Test
	public void testNgayNhap() {
		String ngayNhap = cam1.getNgayNhap();
		assertEquals("12/12/2017", ngayNhap);
	}
}
