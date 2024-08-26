package controller;

import br.edu.fateczl.calc.Operacoes;

public class OrdBubbleSort {

	public OrdBubbleSort() {
		super();
	}

	public int[] Ordenacao(int[] vetor) {
		Operacoes operacoes = new Operacoes();
		int[] vetorBubbleSort = operacoes.bubbleSort(vetor);
		System.out.println(vetor);
		return vetorBubbleSort;
	}
}
