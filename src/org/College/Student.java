package org.College;


	public class Student extends Hostel {
		public void studenName() {
			System.out.println("student name is charan");
		}public void studentId() {
			System.out.println("student id is 1456");

		}public void studentdept() {
			System.out.println("student dept is computer science");
		}public static void main(String[] args) {
			Student a =new Student();
			a.collegeName();
			a.collegeRank();
			a.collgeCode();
			a.hostelName();
			a.studenName();
			a.studentdept();
			a.studentId();
		}
	}

