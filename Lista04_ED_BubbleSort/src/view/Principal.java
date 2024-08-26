package view;

import controller.OrdBubbleSort;

public class Principal {

	public static void main(String[] args) {

		int[] vetor1 = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		int[] vetor2 = {44, 43, 42, 41, 40, 39, 38};
		int[] vetor3 = {101, 102, 103, 125, 124, 123, 104, 105, 106, 122};
		OrdBubbleSort ordenacao = new OrdBubbleSort();
		ordenacao.Ordenacao(vetor1);
		System.out.println("");
		System.out.println("==========================================");
		for (int valor : vetor1) {
			System.out.print(valor + " ");
		}
		System.out.println("");
		System.out.println("==========================================");
		
		ordenacao.Ordenacao(vetor2);
		System.out.println("");
		System.out.println("==========================================");
		for (int valor : vetor2) {
			System.out.print(valor + " ");
		}
		System.out.println("");
		System.out.println("==========================================");
		
		ordenacao.Ordenacao(vetor3);
		System.out.println("");
		System.out.println("==========================================");
		for (int valor : vetor3) {
			System.out.print(valor + " ");
		}
		System.out.println("");
		System.out.println("==========================================");
	}
}



