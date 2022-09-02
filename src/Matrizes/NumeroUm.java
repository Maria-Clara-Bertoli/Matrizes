package Matrizes;

import java.util.Scanner;

public class NumeroUm {

	public static void main(String[] args) {

		Scanner valor = new Scanner(System.in);

		Matriz matriz = new Matriz();

		int numero = 0;
		System.out.println("Informe um valor entre 3 e 11: ");
		int tamanho = valor.nextInt();
		while (tamanho < 3 || tamanho > 11) {
			System.out.println("Tamanho inválido, tente novamente!");
			tamanho = valor.nextInt();
		}
		int mat[][] = new int[tamanho][tamanho];
		System.out.println("Informe os valores para a matriz: ");
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {
				mat[i][j] = valor.nextInt();
			}
		}
		matriz.CalculoMatriz(mat, tamanho);
	}

}
