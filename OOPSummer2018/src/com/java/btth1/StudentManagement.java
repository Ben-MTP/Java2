package com.java.btth1;

import java.util.Scanner;

public class StudentManagement {
	public static int max = 4;
	public static Student student[] = new Student[max];
	
	public static void main(String [] args) {
		
		Student st4;
		
		Student st = new Student();
		
		//removeStudent1("uet123", student, 10);
		
		//tao thong tin sinh vien:
		st.setName("Minh Manh");
		st.setId("UET123456789");
		st.setGroup("k60T");
		st.setEmail("manh123@gmail.com");
		
		//in ra ten sinh vien:
		System.out.println("Name: "+st.getName());
		
		//in ra toan bo thong tin sinh vien
		System.out.println(st.getInfo());
		
		Student st1 = new Student();
		System.out.println(st1.getName()+" "+st1.getId()+" "+st1.getGroup()+" "+st1.getEmail());
		
		Student st2 = new Student("YourName", "YourId", "YourEmail");
		System.out.println(st2.getName()+" "+st2.getId()+" "+st2.getGroup()+" "+st2.getEmail());
		
		//yeu cau sao chep lai toan bo thong tin cua st1:
		Student st3 = new Student(st1);
		System.out.println("Day la st3: ");
		System.out.println(st3.getName()+" "+st3.getId()+" "+st3.getGroup()+" "+st3.getEmail());
		
		//kiem tra 2 doi tuong co cung lop:
		boolean kqkt = sameGroup(st1, st2);
		System.out.println(kqkt);
		
		//tao 3 sinh vien(2 sv thuoc K61CLC, 1 sv thuoc K61CB):
		Student sv1 = new Student("Manh", "uet123", "manh123@gmail.com");
		sv1.setGroup("K61CLC");
		
		Student sv2 = new Student("Minh", "uet132", "minh132@gmail.com");
		sv2.setGroup("K61CLC");
		
		Student sv3 = new Student("Hung", "uet321", "manh321@gmail.com");
		sv3.setGroup("K61CB");
		
		//kiem tra 1 va 2:
		System.out.println("Group(1, 2): "+sameGroup(sv1, sv2));
		//kiem tra 2 va 3:
		System.out.println("Group(2, 3): "+sameGroup(sv2, sv3));
		//kiem tra 1 va 3:
		System.out.println("Group(1, 3): "+sameGroup(sv1, sv3));
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter quantity size: "+max);
		/*
		max = input.nextInt();
		input.nextLine();
		*/
		
		/*nhap thong tin cho tung sinh vien:
		for(int i=0; i<max; i++) {
			System.out.println("Enter Name: ");
			String name = input.nextLine();
			System.out.println("Enter Id: ");
			String id = input.nextLine();
			System.out.println("Enter Group: ");
			String group = input.nextLine();
			System.out.println("Enter Email: ");
			String email = input.nextLine();
			
			student[i] = new Student(name, id, group, email);
			input.nextLine();
		}
		*/
		//fix du lieu sinh vien:
		student[0] = new Student("Manh", "uet123", "GroupA", "manh@gmail.com");
		student[1] = new Student("Minh", "uet124", "GroupB", "minhn@gmail.com");
		student[2] = new Student("Hung", "uet125", "GroupB", "hung@gmail.com");
		student[3] = new Student("Hai", "uet126", "GroupA", "hai@gmail.com");
		//In danh sach sinh vien trong lop:
		for(int i = 0; i<student.length; i++) {
			System.out.println(student[i].getName()+" "+student[i].getId()+" "+student[i].getGroup()+" "+student[i].getEmail());
		}
		
		//Gom nhom sinh vien theo lop:
		studentByGroup();
		
		//Enter idstudent:
		System.out.println("Enter id student remove: ");
		String _id = input.nextLine();
		removeStudent(_id);
		

	}
	
	//Kiem tra danh sinh vien co cung lop hay khong:
	public static boolean sameGroup(Student s1, Student s2) {
		if ((s1.getGroup()).equals(s2.getGroup()) == true)
			return true;
		else
			return false;
		
	}
	
	//in danh sach sinh vien theo tung lop:
	public static void studentByGroup() {
		//Dem so lop:
		String temp = student[1].getGroup();
		int dem = 0;
		for(int i = 0; i < student.length; i++) {
			if(temp.equals(student[i].getGroup()) == false) {
				dem++;
			}
		}
		System.out.println("So lop la: " + dem);
		//Lap mang danh sach lop:
		String listGroup[] = new String[dem];
		String _temp = student[1].getGroup();
		for(int i = 0; i<student.length; i++) {
			int j = 0;
			listGroup[j] = _temp;
			if(_temp.equals(student[i].getGroup()) == false) {
				j++;
				listGroup[j] = student[i].getGroup();
			}
		}
		
		//In mang danh sach lop:
		for(int i = 0; i<listGroup.length; i++) {
			System.out.println(listGroup[i]);
		}
		
		//In danh sinh vien theo lop:
		for(int i = 0; i<listGroup.length; i++) {
			System.out.println("Danh sach sinh vien lop: " + listGroup[i] );
			for(int j = 0; j<student.length; j++) {
				if((student[j].getGroup()).equals(listGroup[i]) == true) {
					System.out.println(student[j].getName());
					
				}
			}
		}
	}
	
	//Xoa sinh vien voi id ra khoi danh sach:
	public static void removeStudent(String id) {
		int size_st = student.length;
		int vi_tri = 0;
		//dua ra vi tri chu id:
		for(int i = 0; i < size_st; i++) {
			if((student[i].getId()).equals(id) == true) {
				vi_tri = i;
				break;
			}
		}
		System.out.println("vi tri can xoa la: " + vi_tri);
		//xoa phan tu khoi vi tri do:
		for(int i = vi_tri; i<size_st; i++) {
			student[i] = student[i+1];
			size_st--;
		}
		
		//in mang doi tuong:
		for(int i = 0; i < size_st; i++) {
			System.out.println(student[i].getName()+" "+student[i].getId()+" "+student[i].getGroup()+" "+student[i].getEmail());
		}
	}
	
	public static void removeStudent1(String id, Student[] st, int size) {
		st[1].setName("Google");
		st[1].setEmail("g@gmail.com");
		System.out.println(st[1].getName()+" "+st[1].getEmail());
	}
	
}
