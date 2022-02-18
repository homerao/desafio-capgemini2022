package com.capgemini.desafio;

import java.util.Scanner;

//questão 1 do desafio capgemini 2022 
public class Questao_1 {

	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		int tamanho = s.nextInt();
		escreverEscada(tamanho);
	}
	/*
	 * método para escrever a escada no console
	 * 
	 * */
	public static void escreverEscada(int N) {
		String space = " ".repeat(N);
		for(int i = 1; i <= N ; i++  ) {
			space = space.substring(0, N - i).concat("*".repeat(i));
			System.out.println(space);
		}
	}
}
