package com.capgemini.desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
// questão 2 do desafio capgemini 2022
public class Questao_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		StringTokenizer token = new StringTokenizer(s.next());
        String senha = token.nextToken();
        verificaForcaDeSenha(senha);
	}
	/*
	 * verifica a segurança da senha digitada
	 * 
	 * */
	public static void verificaForcaDeSenha(String senha) {
		Pattern	pattern;
		List<Integer> errors = new  ArrayList<Integer>();
		String regexLetrasAZ = "[A-Z]";
		String regexLetrasaz = "[a-z]";
		String regexNumeros = "[0-9]";
		String regexCaracteresEspeciais = "[^a-zA-Z0-9]";
		
		int tamanho = senha.length();
		Optional<Integer> totalCaracteresRestantes;
		pattern = Pattern.compile(regexLetrasAZ);
		boolean azMaiusculo = pattern.matcher(senha).find();
		pattern = Pattern.compile(regexLetrasaz);
		boolean azMinusculo = pattern.matcher(senha).find();
		pattern = Pattern.compile(regexNumeros);
		boolean numeros = pattern.matcher(senha).find();
		pattern = Pattern.compile(regexCaracteresEspeciais);
		boolean caracteresEspeciais = pattern.matcher(senha).find();

		
		if(azMaiusculo == false){
			errors.add(1);
		}
		if(azMinusculo == false){
			errors.add(1);
		}
		if(numeros == false){
			errors.add(1);
		}
		if(caracteresEspeciais == false){
			errors.add(1);
		}
		
		
		if(tamanho + errors.size() < 6){
			errors.add(6-(tamanho+errors.size()));
		} 
		totalCaracteresRestantes = errors.stream().reduce((a,b) -> a + b);
		if(!totalCaracteresRestantes.isEmpty()){
			System.out.println(totalCaracteresRestantes.get());
		} else {
			System.out.println("0");
		}
		
	}
	

}
