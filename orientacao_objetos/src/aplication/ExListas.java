package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionarios;

public class ExListas {

	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.println("How many employees will be registered? ");
	int count = sc.nextInt();
	List<Funcionarios> func = new ArrayList<>();
	
	
	for(int i = 0; i<count; i++) {
		System.out.println("Employee #" +(i+1) +":");
		System.out.print("ID: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Salario: ");
		double salario = sc.nextDouble();
		sc.nextLine();
		
		Funcionarios fun = new Funcionarios(id, nome, salario);
		
		func.add(fun);
	}	
	
	System.out.print("Enter the employee id that will have salary increase: ");
	int idSalary = sc.nextInt();
	sc.nextLine();
	Funcionarios fun = func.stream().filter(x -> x.getID() == idSalary).findFirst().orElse(null);
	  
	if (fun == null) {
		System.out.println("Employee do not exists");
	} else {
		System.out.print("Enter the percentage upgrade: ");
		double percent = sc.nextDouble();
		fun.aumentaSalario(percent);
	}
	
	System.out.println();
	System.out.println("List of employeers: ");
	for(Funcionarios fun1 : func) {
		System.out.println(fun1);
	}
	
	sc.close();
	}
}
