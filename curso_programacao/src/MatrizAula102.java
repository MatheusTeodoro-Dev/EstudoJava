import java.util.Scanner;

public class MatrizAula102 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o tamanho da matriz: ");
		int n = sc.nextInt();
		sc.nextLine();

		int[][] matriz = new int[n][n];
		int count =0 ;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Digite o número a ser adicionado: ");
				matriz[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					System.out.print("Main diagonal: \n" + matriz[i][n] + " ");
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (matriz[i][j] < 0) {
					count++;
				}
			}
		}
		
		System.out.print("Negative numbers = " + count);

		sc.close();
	}

}
