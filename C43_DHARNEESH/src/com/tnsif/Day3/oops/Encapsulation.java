package com.tnsif.Day3.oops;

public class Encapsulation {
		String Name; // this is called as instance variable.
		int Age;
		String Dept;
		
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public int getAge() {
			return Age;
		}
		public void setAge(int age) {
			Age = age;
		}
		public String getDept() {
			return Dept;
		}
		public void setDept(String dept) {
			Dept = dept;
		}
		
		
		
		public static void main(String[] args) {
			Encapsulation obj = new Encapsulation();
			obj.setName("Dharaneesh");
			obj.setAge(19);
			obj.setDept("ECE");
			System.out.println(obj.getName());
			System.out.println(obj.getAge());
			System.out.println(obj.getDept());
		}
		// TODO Auto-generated method stub

	

}
