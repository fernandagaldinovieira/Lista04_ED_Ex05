package controller;

import br.edu.fateczl.calc.Operacoes;

public class Ordenacao {

	public Ordenacao() {
		super();
	}

	public int[] OrdenaVetor(int[] vetor, int inicio, int fim) {
		Operacoes operacoes = new Operacoes();
		int[] OrdMergeSort = operacoes.mergeSort(vetor, inicio, fim);
		System.out.println(OrdMergeSort);
		return OrdMergeSort;
	}	
}
