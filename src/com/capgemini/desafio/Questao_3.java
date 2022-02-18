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
	 * @method método para obter os anagramas pares
	 * @param anagrama a string que contem os anagramas
	 * método utilizado para obter todos os anagramas possíveis
	 * */
	public static void obterAnagramasPares(String anagrama) {
		String impar, par;
		int anagramasPares = 0;
		int tamanhoIndividual = 0;
		int indiceHorario =0;
		int tamanhoTotal = anagrama.length();
		
		// for externo para o primeiro indice do anagrama
		for(int x= 0; x + tamanhoIndividual <= tamanhoTotal; x++){
			
			if(tamanhoIndividual == 0){
				++tamanhoIndividual;
			}
				impar = anagrama.substring(indiceHorario, indiceHorario + tamanhoIndividual);
				indiceHorario ++;
			for(int j = indiceHorario; j + tamanhoIndividual <= tamanhoTotal; j++){
				par = anagrama.substring(j, j + tamanhoIndividual);
				if(sortAnagram(par).equals(sortAnagram(impar))){
					anagramasPares++;
				}

			}
			
			// este if verifica se o tamanho do anagrama dentro da string deve aumentar
            if(x + tamanhoIndividual >= tamanhoTotal && tamanhoIndividual + 1 < tamanhoTotal){
            	x = 0;
            	tamanhoIndividual++;
            	indiceHorario =0;
            }

			}

		System.out.println(anagramasPares);

	}
	
	/*
	 * @method  este método é utilizado para ordenar a substring do anagrama
	 * @param substringAnagram
	 * @return retona a substring do anagrama ordenada
	 * */
	public static String sortAnagram(String substringAnagram) {
		String[] unsorted = substringAnagram.split("");
		Arrays.sort(unsorted);
		String sorted = String.join("", unsorted);
		return sorted;
		
		
	}

}
