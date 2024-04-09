package aplication;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFixacaoVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a Questão: ");
		int opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			System.out.print("Quantos números vai digitar? ");
			int n = sc.nextInt();
			sc.hasNextLine();

			int[] vect1 = new int[n];

			for (int i = 0; i < vect1.length; i++) {
				System.out.print("Digite um número: ");
				vect1[i] = sc.nextInt();
			}
			System.out.println("NUMEROS NEGATIVOS:");

			for (int i = 0; i < vect1.length; i++) {
				if (vect1[i] < 0) {
					System.out.println(vect1[i]);
				}
			}
			break;
		case 2:
			System.out.print("Quantos números você vai digitar? ");
			n = sc.nextInt();

			double[] vect2 = new double[n];

			for (int i = 0; i < vect2.length; i++) {
				System.out.print("Digite o número: ");
				vect2[i] = sc.nextDouble();
			}
			double soma = 0.0;

			for (int i = 0; i < vect2.length; i++) {
				soma += vect2[i];
			}
			double media = soma / vect2.length;

			System.out.print("Valores = ");

			for (int i = 0; i < vect2.length; i++) {
				System.out.printf("%.1f ", vect2[i]);
			}
			System.out.println("\nSoma = " + String.format("%.1f", soma));
			System.out.println("Media = " + String.format("%.1f", media));
			break;
		case 3:
			System.out.print("Quantas pessoas? ");
			n = sc.nextInt();
			sc.nextLine();
			String[] nome = new String[n];
			int[] idade = new int[n];
			double[] altura = new double[n];

			for (int i = 0; i < nome.length; i++) {
				System.out.println("Dados da " + (i+1) + "ª pessoa");
				System.out.print("Nome: ");
				nome[i] = sc.nextLine();
				System.out.print("Idade: ");
				idade[i] = sc.nextInt();
				sc.nextLine();
				System.out.print("Altura: ");
				altura[i] = sc.nextDouble();
				sc.nextLine();
			}

			soma = 0.0;

			for (int i = 0; i < altura.length; i++) {
				soma += altura[i];
			}
			media = soma / altura.length;
			System.out.println("Altura média: " + String.format("%.2f", media));
			int menores = 0;
			for (int i = 0; i < idade.length; i++) {
				if (idade[i] < 16) {
					menores++;
				}
			}
			double porcentagem = (menores * 100) / idade.length;
			System.out.println("Pessoas com menos de 16 anos: " + String.format("%.1f", porcentagem) + "%");
			for (int i = 0; i < idade.length; i++) {
				if (idade[i] < 16) {
					System.out.println(nome[i]);
				}
			}
			break;
		case 4:
			System.out.print("Quantos números você vai digitar? ");
			n = sc.nextInt();
			int[] vect4 = new int[n];
			int contador = 0;
			sc.nextLine();

			for (int i = 0; i < vect4.length; i++) {
				System.out.print("Digite um número: ");
				vect4[i] = sc.nextInt();
				sc.nextLine();
			}

			System.out.println("Numeros Pares: ");
			for (int i = 0; i < vect4.length; i++) {
				if (vect4[i] % 2 == 0) {
					System.out.print(vect4[i] + " ");
					contador++;
				}
			}
			System.out.println("\nQuantidade de pares = " + contador);

			break;
		case 5:
			System.out.print("Quantos números você vai digitar? ");
			n = sc.nextInt();
			sc.nextLine();
			double[] vect5 = new double[n];

			for (int i = 0; i < vect5.length; i++) {
				System.out.print("Digite um número: ");
				vect5[i] = sc.nextDouble();
				sc.nextLine();
			}

			double holder = 0;

			for (int i = 0; i < vect5.length; i++) {
				if (holder < vect5[i]) {
					holder = vect5[i];
				}
			}
			System.out.println("Maior Valor = " + holder);
			for (int i = 0; i < vect5.length; i++) {
				if (holder == vect5[i]) {
					System.out.println("Posição do maior valor = " + i);
				}
			}

			break;
		case 6:
			System.out.print("Quantos valores por vetor? ");
			n = sc.nextInt();
			sc.hasNextLine();
			int[] vectA = new int[n];
			int[] vectB = new int[n];
			int[] vectC = new int[n];

			System.out.println("Digite os valores de A: ");
			for (int i = 0; i < vectA.length; i++) {
				vectA[i] = sc.nextInt();
				sc.nextLine();
			}

			System.out.println("Digite os valores de B: ");
			for (int i = 0; i < vectB.length; i++) {
				vectB[i] = sc.nextInt();
				sc.nextLine();
			}
			System.out.println("Vetor Resultante: ");
			for (int i = 0; i < vectC.length; i++) {
				vectC[i] = vectA[i] + vectB[i];
				System.out.println(vectC[i]);
			}
			break;
		case 7:
			System.out.print("Quantos elementos vai ter o vetor? ");
			n = sc.nextInt();
			sc.nextLine();
			double[] vect7 = new double[n];
			soma = 0;
			for (int i = 0; i < vect7.length; i++) {
				System.out.print("Digite um número: ");
				vect7[i] = sc.nextDouble();
				sc.nextLine();
				soma += vect7[i];
			}

			media = soma / vect7.length;
			System.out.println("Media do vetor: " + String.format("%.3f", media));
			System.out.println("Elementos abaixo da média:");
			for (int i = 0; i < vect7.length; i++) {
				if (vect7[i] < media) {
					System.out.println(vect7[i]);
				}
			}
			break;
		case 8:
			System.out.print("Digite o número de elementos do vetor: ");
			n = sc.nextInt();
			sc.nextLine();
			int npares = 0;
			int[] vect8 = new int[n];
			soma = 0;
			for (int i = 0; i < vect8.length; i++) {
				System.out.print("Digite o número: ");
				vect8[i] = sc.nextInt();
				sc.nextLine();
				if (vect8[i] % 2 == 0) {
					soma += vect8[i];
					npares++;
				}
			}

			media = soma / npares;

			if (soma == 0) {
				System.out.println("NENHUM NÚMERO PAR");
			} else {
				System.out.println("MEDIA DOS PARES: " + media);
			}
			break;
		case 9:
			System.out.print("Digite o numero de pessoas: ");
			n = sc.nextInt();
			sc.nextLine();
			String[] pessoa = new String[n];
			int[] idade8 = new int[n];
			int contIdade = 0;
			String nomeVelho = "";
			for (int i = 0; i < pessoa.length; i++) {
				System.out.print("Nome: ");
				pessoa[i] = sc.nextLine();
				System.out.print("Idade: ");
				idade8[i] = sc.nextInt();
				sc.nextLine();
				if (contIdade < idade8[i]) {
					contIdade = idade8[i];
					nomeVelho = pessoa[i];
				}
			}
			System.out.print("PESSOA MAIS VELHA: " + nomeVelho);
			break;
		case 10:
			System.out.print("Digite quantos alunos: ");
			n = sc.nextInt();
			sc.nextLine();
			String[] aluno = new String[n];
			double[] nota1 = new double[n];
			double[] nota2 = new double[n];

			for (int i = 0; i < aluno.length; i++) {
				System.out.print("Nome: ");
				aluno[i] = sc.nextLine();
				System.out.print("Nota 1: ");
				nota1[i] = sc.nextDouble();
				sc.nextLine();
				System.out.print("Nota 2: ");
				nota2[i] = sc.nextDouble();
				sc.nextLine();
			}

			System.out.println("Alunos aprovados: ");

			for (int i = 0; i < aluno.length; i++) {
				soma = nota1[i] + nota2[i];
				media = soma / 2;
				if (media >= 6.0) {
					System.out.println(aluno[i]);
				}
			}
			break;
		case 11:
			System.out.print("Quantas pessoas serão digitadas? ");
			n = sc.nextInt();
			sc.nextLine();
			double[] alturaG = new double[n];
			char[] genero = new char[n];
			int countM = 0, countH = 0;
			double somaAlturaMulher = 0, mediaAlturaMulher = 0, menorAltura = 3.0, maiorAltura = 0;
			for (int i = 0; i < alturaG.length; i++) {
				System.out.print("Altura: ");
				alturaG[i] = sc.nextDouble();
				sc.nextLine();
				System.out.print("Genero: ");
				genero[i] = sc.next().toUpperCase().charAt(0);

				if (genero[i] == 'F') {
					countM++;
					somaAlturaMulher += alturaG[i];
				} else {
					countH++;
				}
				if (menorAltura > alturaG[i]) {
					menorAltura = alturaG[i];
				} else if (maiorAltura < alturaG[i]) {
					maiorAltura = alturaG[i];
				}
			}
			mediaAlturaMulher = somaAlturaMulher / countM;
			System.out.print("Menor altura = " + menorAltura);
			System.out.print("\nMaior altura = " + maiorAltura);
			System.out.print("\nMedia das alturas das mulheres = " + String.format("%.2f%", mediaAlturaMulher));
			System.out.print("\nNumero de Homens = " + countH);
			break;
		default:
			System.out.println("Opção inválida");
		}

		sc.close();
	}

}
