package studentManagement;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main extends Thread {
	public void run() {

	}

	HashMap<Integer, Student> Map = new HashMap<>();
	Course course=new Course();
	void addInList() {
	 Student obj = new Student().AddData();
		int flag = 0;

		for (Entry<Integer, Student> i : Map.entrySet()) {
			if (i.getKey() == obj.getstud_id()) {
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			Map.put((int) obj.getstud_id(), obj);
			System.out.println(Map);

		} else
			System.out.println("Student is already registered");
	}
	void Verification() {
		System.out.println("enter stud_id for verification");
		int num = new  Scanner(System.in).nextInt();//101
		int flag=0;

	for( Entry<Integer, Student> i : Map.entrySet()) {
		if(i.getKey() == num){//101
		 flag =1;
		 break;
		}
	}		
		if(flag == 0) {
			System.out.println("stud_id is NOt registered");
		}
		else
		{
		System.out.println("stud_id is registered");
		course.AddCourse();
		//System.out.println(Map1);
		}
	}
	void Payment() {
		System.out.println("enter enrollment number for verification");
		int num = new  Scanner(System.in).nextInt();//101
		int flag=0;

	for( Entry<Integer, Student> i : Map.entrySet()) {
		if(i.getKey() == num){//101
		 flag =1;
		 break;
		}
	}		
		if(flag == 0) {
			System.out.println("stud_id is NOt registered");
		}
		else
		{
		System.out.println("stud_id is registered");
		//fee.TotalFee();
		Thread t1 = new Thread() {
			public void run() {
				FeePayment fee=new FeePayment();
				fee.TotalFee();
			}

		};
		t1.start();
		synchronized (t1) {
			try {
				t1.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				t1.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Thread t2 = new Thread() {
			public void run() {
				FeePayment fee1=new FeePayment();
				fee1.Instalment();
			}

		};
		t2.start();
		synchronized (t2) {
			try {
				t2.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				t2.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Student std = new Student();
		char choice;
		do {
			System.out.println("1 - Enroll The Student Details");
			System.out.println("2 - Enroll Cource Details of Student");
			System.out.println("3 - Enroll Fees Details of Student");
			System.out.println("0 - Exit");
			int option = scanner.nextInt();

			switch (option) {
			case 1:
				std.addInList();
				break;
			case 2:
				// member.addInList();
				std.Verification();
				break;
			case 3:
				std.Payment();
				break;
			}

			System.out.println("want more operation?(y/n)");
			choice = scanner.next().charAt(0);

		} while (choice == 'Y' || choice == 'y');

		
		  HashMap<Integer,Student> Map=new HashMap<>(); Student obj = new
		  Student().AddData(); Map.put((int) obj.getstud_id(), obj);
		 System.out.println(Map);
		 

	}

}