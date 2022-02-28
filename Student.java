package studentManagement;

import java.util.Scanner;

public class Student {
long stud_id;
String Name;
	String Contact_no;
	String Email;
	String Address;

	public Student(long stud_id2, String name, String contact_no, String email, String address) {
		super();
		this.stud_id = stud_id2;
		this.Name = name;
		this.Contact_no = contact_no;
		this.Email = email;
		this.Address = address;
	}

	public long getstud_id() {
		return stud_id;
	}

	public void setstud_id(long stud_id) {
		this.stud_id = stud_id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getContact_no() {
		return Contact_no;
	}

	public void setContact_no(String contact_no) {
		Contact_no = contact_no;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public long stud_id() {
		return stud_id;
	

	}

	public Student() {
		super();
	}

	public Student(long stud_id) {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [stud_id=" + stud_id + ", Name=" + Name + ", Contact_no=" + Contact_no + ", Email=" + Email
				+ ", Address=" + Address + "]";
	}

	public Student AddData() {
		Scanner Scan = new Scanner(System.in);
		// System.out.println("Enter Student Enrollment Number");
				// long Enroll_No=(long) (Math.random()*100000);
		System.out.println("Enter Student Name");
		String Name = Scan.next();
		System.out.println("Enter Student Contact Number");
		String Contact_no = Scan.next();
		System.out.println("Enter Student email Id");
		String Email = Scan.next();
		System.out.println("Enter Student Address");
		String Address = Scan.next();
		return new Student(stud_id, Name, Contact_no, Email, Address);

	}

	public void Verification() {
		// TODO Auto-generated method stub
		
	}

	public void addInList() {
		// TODO Auto-generated method stub
		
	}

	public void Payment() {
		// TODO Auto-generated method stub
		
	}

	}

