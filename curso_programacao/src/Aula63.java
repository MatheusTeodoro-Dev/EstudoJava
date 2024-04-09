import java.util.Scanner;

public class Aula63 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite o lado a do triangulo x: ");
		double xA = sc.nextDouble();
		System.out.print("Digite o lado b do triangulo x: ");
		double xB = sc.nextDouble();
		System.out.print("Digite o lado c do triangulo x: ");
		double xC = sc.nextDouble();
		System.out.print("Digite o lado a do triangulo  y: ");
		double yA = sc.nextDouble();
		System.out.print("Digite o lado b do triangulo  y: ");
		double yB = sc.nextDouble();
		System.out.print("Digite o lado c do triangulo  y: ");
		double yC = sc.nextDouble();
		
		double pY = (yA + yB + yC) / 2;
		double pX = (xA + xB + xC) / 2;
		double areax = Math.sqrt(pX *((pX - xA) * (pX - xB) * (pX - xC)));
		System.out.printf("Triangle X Area: %.4f%n" , areax);

		double areay = Math.sqrt(pY *((pY - yA) * (pY - yB) * (pY - yC)));
		System.out.printf("Triangle Y Area: %.4f%n" , areay);
		
		if(areax > areay) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		sc.close();

	}

}
