package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;
//import entities.Rectangle;

public class MainEx {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/* 	Rectangle rect = new Rectangle();
			System.out.println("Enter rectangle width and height: ");
			rect.widght = sc.nextDouble();
			rect.height = sc.nextDouble();
			
			double area = rect.area();
			double perimetro = rect.perimeter();
			double diagonal = rect.diagonal();
			
			System.out.println("AREA = " + String.format("%.2f", area));
			System.out.println("PERIMETRO = " + String.format("%.2f", perimetro));
			System.out.println("DIAGONAL = " + String.format("%.2f", diagonal));
			break;
			Employee emp = new Employee();
			
			System.out.print("Name: ");
			emp.name = sc.nextLine();
			
			System.out.print("Gross Salary: ");
			emp.grossSalary = sc.nextDouble();
			System.out.print("Tax: ");
			emp.tax = sc.nextDouble();
			System.out.println();
			System.out.println("Employee: " + emp);
			System.out.println("Which percentage to increase salary? ");
			emp.increaseSalary(sc.nextDouble());
			System.out.println("Updated Data: " + emp);
			*/
			
		Aluno aluno = new Aluno();
		aluno.nome = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", aluno.calculaNota());
		if(aluno.calculaNota()< 60) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", aluno.validaAprovacao());	
		} else {
			System.out.println("PASS");
		}
		
		sc.close();
	}

}
