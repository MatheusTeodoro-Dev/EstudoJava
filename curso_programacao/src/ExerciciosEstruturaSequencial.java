import java.util.Scanner;

public class ExerciciosEstruturaSequencial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int questao;
		System.out.println("Digite a Questão desejada: ");
		questao = sc.nextInt();

		switch (questao) {
		case 1:
			int x, y, soma;
			System.out.println("Digite o primeiro valor: ");
			x = sc.nextInt();
			System.out.println("Digite o segundo valor: ");
			y = sc.nextInt();
			soma = x + y;
			System.out.println("O resultado da soma é: " + soma);
			break;
		case 2:
			double area, pi, raio;
			pi = 3.14159;
			System.out.println("Digite o raio: ");
			raio = sc.nextDouble();
			area = (pi * (Math.pow(raio, 2.0)));
			System.out.printf("A área é: %.4f%n", area);
			break;

		case 3:
			int A,B,C,D,DIFERENCA;
			System.out.println("Digite o valor de A: ");
			A = sc.nextInt();
			System.out.println("Digite o valor de B: ");
			B = sc.nextInt();
			System.out.println("Digite o valor de C: ");
			C = sc.nextInt();
			System.out.println("Digite o valor de D: ");
			D = sc.nextInt();
			DIFERENCA = (A*B) - (C*D);
			System.out.println("Diferença: " + DIFERENCA);
			break;
		case 4:
			int numero;
			double tempo, valor, salario;
			System.out.println("Digite o número do funcionário");
			numero = sc.nextInt();
			System.out.println("Digite o tempo de trabalho");
			tempo = sc.nextDouble();
			System.out.println("Digite o valor das horas trabalhadas");
			valor = sc.nextDouble();
			salario = valor*tempo;
			System.out.println("NUMBER = " + numero);
			System.out.println("SALARY = " + salario);
			break;
		case 5:
			break;
		case 6:
			break;
		default:
			System.out.println("Foi digitado uma opção inválida - Fim do programa");
		}

		sc.close();
	}

}
