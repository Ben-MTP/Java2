package com.java.btth5.XuLyIO;
/* Xay dung mot class Weapon -- vu khi:
 * 
 * 
 */
import java.io.Serializable;

public class Weapon implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	//Constructor:
	public Weapon(String n){
		name = n;
	}
	public String toString() {
		return name;
	}
}
