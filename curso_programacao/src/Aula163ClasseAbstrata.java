import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAcount;
import entities.SavingsAccount;

public class Aula163ClasseAbstrata {

	public static void main(String[] args) {
		
		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001,  "Alex", 1000.0, 0.01));
		list.add(new BusinessAcount(1002, "Maria", 100.0, 400.0));
		list.add(new SavingsAccount(1003, "Bob", 300.0, 0.01));
		list.add(new BusinessAcount(1004, "Anna", 500.0, 500.0));
		
		double soma = 0.0;
		
		for(Account acc : list) {
			soma += acc.getBalance();
		}
		
		System.out.println("Total balance: " + String.format("%.2f", soma));
		
		for(Account acc : list) {
			acc.deposit(10.0);
		}
		
		for(Account acc : list) {
			System.out.println("Saldo atualizado para conta " + acc.getNumber() + ": " + String.format("%.2f", acc.getBalance()));
		}

	}

}
