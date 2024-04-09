import entities.Acount;
import entities.BusinessAcount;
import entities.SavingsAccount;

public class Aula157 {

	
	public static void main(String[] args) {
		
		Acount acc = new Acount(1001, "Alex", 0.0);
		BusinessAcount bacc = new BusinessAcount(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING
		
		Acount acc1 = bacc;
		Acount acc2 = new BusinessAcount(1003, "Bob", 0.0, 200.0);
		Acount acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		//DOWNCASTING
		
		BusinessAcount acc4 = (BusinessAcount)acc2;
		acc4.loan(100.0);
		
		//BusinessAcount acc5 = (BusinessAcount)acc3;
		if(acc3 instanceof BusinessAcount) {
			BusinessAcount acc5 = (BusinessAcount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update");
		}
		
		
		
	}
}