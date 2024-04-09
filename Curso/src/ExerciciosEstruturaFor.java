import java.util.Scanner;

public class ExerciciosEstruturaFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int questao;
		System.out.print("Digite a questão desejada: ");
		questao = sc.nextInt();
		int x;
		switch (questao) {
		case 1:
			x = sc.nextInt();
			for (int i = 1; i <= x; i++) {
				if (i % 2 != 0) {
					System.out.println(i);
				}
			}
			break;
		case 2:
			x = sc.nextInt();
			int num, in = 0, out = 0;
			for(int i =0; i < x; i++) {
				num = sc.nextInt();
				if(num >= 10 && num <= 20) {
					in = in + 1;
				} else {
					out = out + 1;
				}
			}
			System.out.println(in + " in");
			System.out.println(out + " out");
			break;
		case 3:
			x = sc.nextInt();
			double x1 = 0.0;
			double x2 = 0;
			double x3 = 0;
			double media;
			for (int i = 0; i < x; i++) {
				System.out.print("Digite o primeiro valor: ");
				x1 = sc.nextDouble();
				System.out.print("Digite o segundo valor: ");
				x2 = sc.nextDouble();
				System.out.print("Digite o terceiro valor: ");
				x3 = sc.nextDouble();
				media = (x1 * 2 + x2 * 3 + x3 * 5) / 10;
				System.out.printf("%.1f%n" , media);
			}
			break;
		}

		sc.close();
	}

}
