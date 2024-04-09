
import java.util.Scanner;

public class ExercíciosEstruturaCondicional1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int questao;
		System.out.println("Digite a Questão desejada: ");
		questao = sc.nextInt();

		switch (questao) {
		case 1:
			int valor2;
			System.out.println("Digite o número: ");
			valor2 = sc.nextInt();
			if (valor2 < 0) {
				System.out.println("Negativo");
			} else {
				System.out.println("Não negativo");
			}
			break;
		case 2:
			System.out.println("Digite o numero: ");
			valor2 = sc.nextInt();
			if (valor2 % 2 == 0) {
				System.out.println("PAR");
			} else {
				System.out.println("IMPAR");
			}
			break;
		case 3:
			int A,B;
			System.out.println("Digite o valor de A: ");
			A = sc.nextInt();
			System.out.println("Digite o valor de B: ");
			B = sc.nextInt();
			if ((A % B == 0) || (B % A == 0) ) {
				System.out.println("São multiplos");
			}else {
				System.out.println("Não são multiplos");
			}
				break;
		case 4:
			int horaI, horaF, duracao;
			System.out.println("Digite a hora inicial: ");
			horaI = sc.nextInt();
			System.out.println("Digite a hora final: ");
			horaF = sc.nextInt();
			if (horaI < horaF) {
				duracao = horaF - horaI;
			} else {
				duracao = 24 - horaI + horaF;
			}
			System.out.println("O jogo durou " + duracao + " horas.");
				break;
		case 5:
			int quantidade;
			double totalPagar;
			System.out.println("Digite o código do item: ");
			valor2 = sc.nextInt();
			System.out.println("Digite a quantidade: ");
			quantidade = sc.nextInt();
			if (valor2 == 1) {
				totalPagar = quantidade * 4.0;
			} else if (valor2 == 2) {
				totalPagar = quantidade * 4.50;
			} else if (valor2 == 3) {
				totalPagar = quantidade * 5.0;
			} else if(valor2 == 4){
				totalPagar = quantidade * 2.0;
			} else {
				totalPagar = quantidade * 1.50;
			}
			
			System.out.println("Total: R$ " + totalPagar);
			break;
		case 6:
			double valor21;
			System.out.println("Digite o número: ");
			valor21 = sc.nextDouble();
			if(valor21 >= 0 && valor21 <= 25) {
				System.out.println("Intervalo ([0,25])");
			} else if (valor21 > 25 && valor21 <= 50) {
				System.out.println("Intervalo ([25,50])");
			}else if (valor21 > 50 && valor21 <=75 ){
				System.out.println("Intervalo ([50,75])");
			} else if (valor21 > 75 && valor21 <= 100){
				System.out.println("Intervalo ([75,100])");
			} else {
				System.out.println("Fora do Intervalo");
			}
			break;
		case 7:
			
			double x, y;
			System.out.println("Digite o valor de x: ");
			x = sc.nextDouble();
			System.out.println("Digite o valor de y: ");
			y = sc.nextDouble();
			if(x == 0 && y == 0) {
				System.out.println("Origem");
			} else if(x > 0  && y > 0){
				System.out.println("Q1");
			} else if (x < 0 && y > 0) {
				System.out.println("Q2");
			} else if ( x > 0 && y < 0) {
				System.out.println("Q4");
			} else {
				System.out.println("Q3");
			}
			break;
		case 8:
			double renda, taxa;
			System.out.println("Digite o valor da renda: ");
			renda = sc.nextDouble();
			if (renda < 2000) {
				System.out.println("Isento");
			} else if (renda > 2000 && renda <3000) {
				taxa = (renda - 2000) * 0.08;
				System.out.println(taxa);
			} else if (renda > 3000 && renda < 4500) {
				taxa = ((renda - 3000) * 0.18) + 1000 * 0.08;
				System.out.println(taxa);
			} else {
				taxa = ((renda - 4500) * 0.28) + 1500 * 0.18 + 1000 * 0.18;
				System.out.println(taxa);
			}
			
			break;
		default:
			System.out.println("Foi digitado uma opção inválida - Fim do programa");
		}

		sc.close();
	
	}

}
