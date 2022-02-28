package studentManagement;

import java.util.Scanner;

public class FeePayment {
    double Totalfees=1500;
    String date;
    Scanner Scan=new Scanner(System.in);
	public FeePayment(int totalfees, String date) {
		super();
		Totalfees = totalfees;
		this.date = date;
	}
	public FeePayment() {
		super();
	}
	@Override
	public String toString() {
		return "FeePayment [Totalfees=" + Totalfees + ", date=" + date + "]";
	}
    void TotalFee()
    {
  	  synchronized (this) {
  	  System.out.println("Course total fees:"+Totalfees);
  	  this.notify();
  	  }
  	  
    }
    void Instalment()
    {  synchronized(this) {
  	  System.out.println("Enter date");
         date=Scan.next();
  	   System.out.println("Enter amount of fees payment");
  	   int amount=Scan.nextInt();
  	   Totalfees=Totalfees-amount;
  	   System.out.println("Remaining Fees"+Totalfees);
  	   
  	   this.notify();
    }
    }
    
    
}

