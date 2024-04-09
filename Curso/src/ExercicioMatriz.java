import java.util.Scanner;

public class ExercicioMatriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o número de linhas: ");
		int m = sc.nextInt();
		System.out.println();
		System.out.print("Digite o número de colunas: ");
		int n = sc.nextInt();
		System.out.println();
		int[][] mat = new int[m][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		System.out.print("Digite o número a ser encontrado: ");
		int found = sc.nextInt();
		System.out.println();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == found) {
					System.out.println("\nPosition " + i + "," + j + ":");
					if (j > 0 ) {
						System.out.print("Esquerda: " + mat[i][j - 1]);
					}
					if (j < mat[i].length-1) {
						System.out.print("\nDireita: " + mat[i][j + 1]);
					}
					if (i > 0) {
						System.out.print("\nAcima: " + mat[i - 1][j]);
					}
					if (i < mat.length-1) {
						System.out.print("\nAbaixo: " + mat[i + 1][j]);
					}
				}
			}
		}
		sc.close();
	}

}
