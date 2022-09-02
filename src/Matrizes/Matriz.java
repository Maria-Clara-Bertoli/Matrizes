package Matrizes;

public class Matriz {

	private int soma;
	private float media;
	private int maior;
	private int menor;
	private int contapar;
	private int contaimpar;
	private int somaprincipal;
	private int somasecundaria;

	public void CalculoMatriz(int mat[][], int tamanho) {
		int tamanho2 = tamanho;
		tamanho = tamanho - 1;
		int vet[] = new int [tamanho2];
		maior = mat[0][0];
		menor = mat[0][0];
		for (int i = 0; i < tamanho2; i++) {
			for (int j = 0; j < tamanho2; j++) {
				soma += mat[i][j];
				if (mat[i][j] > maior) {
					maior = mat[i][j];
				}
				if (mat[i][j] < menor) {
					menor = mat[i][j];
				}
				if (mat[i][j] % 2 == 0) {
					contapar += 1;
				} else {
					contaimpar += 1;
				}
				if (i == j) {
					somaprincipal += mat[i][j];
				}
			}
		}
		media = (float) soma / ((float) tamanho2 * (float) tamanho2);
		for (int a = 0; a < tamanho2; a++) {
			vet[a] = mat[a][tamanho];
			tamanho = tamanho - 1;
		}
		for (int b = 0; b < vet.length; b++) {
			somasecundaria += vet[b];
		}
		System.out.println("A soma dos valores é: " + soma );
		System.out.println("A média dos elementos é: " + media);
		System.out.println("O maior valor é: " + maior);
		System.out.println("O menor valor é: " + menor);
		System.out.println("A quantidade de números pares é: " + contapar);
		System.out.println("A quantidade de números ímpares é: " + contaimpar);
		System.out.println("A soma da diagonal principal é: " + somaprincipal);
		System.out.println("A soma da diagonal secundária é: " + somasecundaria);
		System.out.println();
		System.out.println("MOSTRANDO A MATRIZ");
		for (int c  = 0; c < tamanho2; c++) {
			for (int d  = 0; d < tamanho2; d++) {
				System.out.println(mat[c][d]);
			}
		}
	}
}
