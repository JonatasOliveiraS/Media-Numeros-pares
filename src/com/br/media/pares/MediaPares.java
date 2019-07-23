package com.br.media.pares;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MediaPares {

	public static void main(String[] args) {
		Scanner scan = entrada();

		int total = 0;
		int controle = 1;
		int divisor = 0;

		List<Integer> numerosImpares = new ArrayList<Integer>();

		while (controle == 1) {
			
			System.out.println("#Digite um número para o cálculo\n"
					+ "#Digite 0 para sair ");
			int numero = scan.nextInt();

			if (numero == 0) {

				controle = 0;

			} else if (numero % 2 == 0) {
				divisor++;
				total += numero;
			} else {
				numerosImpares.add(numero);
			}

		}
		
		calculaMedia(divisor, total);
		System.out.println("\nNúmeros que não entraram na média\n");
		imprimirLista(numerosImpares);

	}

	public static Scanner entrada() {
		Scanner scan = new Scanner(System.in);
		return scan;
	}

	public static void calculaMedia(int divisor, int total) {
	//	double media =(total / divisor);
		System.out.println("Média entre os números pares : "+ (total / divisor));
	}
	
	public static void imprimirLista(List lista) {
		
		for (Object object : lista) {
			
			System.out.println(object);
		}
		
	}

	}
