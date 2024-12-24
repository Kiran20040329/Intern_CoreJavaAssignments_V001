package Interns_CoreJavaAssignments_V001;
import java.util.*;
class Account{
	private String AC_No,AHN;
	private int Balance;
	
	 public Account(String AC_No, String AHN, int Balance) {
        this.AC_No = AC_No;
        this.AHN= AHN;
        this.Balance = Balance;
    }
    
	public String getAC_No(){
		return AC_No;
	}
	public void setAC_No(String AC_No){
		this.AC_No=AC_No;
	}
	
	public  String getAHN(){
		return AHN;
	}
	public  void setAHN(String AHN){
		this.AHN=AHN;
	}
	
	public  int getBalance(){
		return Balance;
	}
	public void setBalance(int Balance)
	{
		this.Balance=Balance;
	}
}
	
class SavingAccount extends Account{
	private int IR;
	
	 public SavingAccount(String AC_No,String AHN, int Balance, int IR) {
        super(AC_No, AHN, Balance);
        this.IR = IR;
    }
	
	public int getIR() {
		return IR;
	}
	
	public void setIR(int IR){
		this.IR=IR;
	}
		public void Interest(){
			int newBalance=getBalance()+((getBalance()*IR)/100);
			setBalance(newBalance);
		}
	}

public class BankingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Account Number: " );
        String AC_No=sc.next();
        System.out.println("Account Holder: " );
        String AHN=sc.next();
        System.out.println("Initial Balance: " );
        int Balance=sc.nextInt();
        System.out.println("Enter Interest: ");
        int Interest=sc.nextInt();
        SavingAccount ob = new SavingAccount(AC_No,AHN,Balance,Interest);

             // Display initial details
        System.out.println("Account Number: " + ob.getAC_No());
        System.out.println("Account Holder: " + ob.getAHN());
        System.out.println("Initial Balance: " + ob.getBalance());

        // Apply interest
        ob.Interest();

        // Display updated balance
        System.out.println("Balance after interest: " + ob.getBalance());

	}

}
