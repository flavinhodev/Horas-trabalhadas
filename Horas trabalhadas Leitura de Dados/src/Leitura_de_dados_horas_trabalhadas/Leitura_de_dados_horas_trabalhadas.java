/*
 * 04 Crie um programa que leia o 
 * número de horas trabalhadas por um 
 * funcionário e o valor da hora de trabalho 
 * e escreva o salário bruto desse funcionário.
 * 
 */

package Leitura_de_dados_horas_trabalhadas;

import java.util.Scanner;

public class Leitura_de_dados_horas_trabalhadas {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);

			System.out.println("Entre com o número de horas trabalhadas:");
			int horasTrabalhadas = scan.nextInt();

			System.out.println("Entre com o valor por hora de trabalho:");
			double valorHora = scan.nextDouble();

			double salarioBruto = horasTrabalhadas * valorHora;

			System.out .printf("O salário bruto deste funcionário é R$ %.2f",
			salarioBruto);
	}

}
