package com.capgemini.desafio;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Questao_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		StringTokenizer token = new StringTokenizer(s.next());
        String anagramaBruto = token.nextToken();
        
        obterAnagramasPares(anagramaBruto);
	}
	
	/*
	 * @method
	 * @param anagrama
	 * método utilizado para obter todos os anagramas possíveis
	 * */
	public static void obterAnagramasPares(String anagrama) {
		String impar, par;
		int anagramasPares = 0;
		int tamanhoIndividual = 1;
		int tamanhoTotal = anagrama.length();
		for(int x = 0; x < tamanhoTotal; x++){
			for(int i =0; i < tamanhoTotal; i++) {
				impar = anagrama.substring(i, i + tamanhoIndividual);
				System.out.println("Impar "+impar);
				for(int j = tamanhoTotal; j > tamanhoIndividual; j -= tamanhoIndividual) {
					par = anagrama.substring(j - tamanhoIndividual, j);
					System.out.println("Par "+par);
				}
				
				
				
			}
			tamanhoIndividual ++;
		}
		
		System.out.println(anagramasPares);
		sortAnagram(anagrama);
	}
	
	/*
	 * @method 
	 * @param substringAnagram
	 * método para ordenar a substring do anagrama
	 * */
	public static String sortAnagram(String substringAnagram) {
		String[] unsorted = substringAnagram.split("");
		Arrays.sort(unsorted);
		String sorted = String.join("", unsorted);
		return substringAnagram;
		
		
	}

}
