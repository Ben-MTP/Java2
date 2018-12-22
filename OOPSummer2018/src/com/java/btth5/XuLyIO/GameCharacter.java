package com.java.btth5.XuLyIO;
/* Xay dung lop GameCharacter - gom nhung dac tinh cua game:
 * 
 */
public class GameCharacter {
	int health; //-->suc luc
	String type; //-->kieu/loai/
	Weapon weapon[];
	int weaponCount;
	
	//Constructor:
	public GameCharacter() {
		
	}
	public GameCharacter(int h, String t){
		health = h;
		type = t;
		weapon = new Weapon[10];
		weaponCount = 0;
	}
	
	void addWeapon(Weapon w) {
		weapon[weaponCount] = w;
		weaponCount++;
	}
	
	public String toString() {
		String s = health +", "+type;
		for(int i = 0; i < weaponCount; i++) {
			s = s +", "+weapon[i];
		}
		return s;
	}
}
