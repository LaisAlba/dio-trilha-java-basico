package br.com.contaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		
		System.out.println("Digite seu nome: ");
		String nomeCliente = scanner.next();
		
		System.out.println("Digite seu sobrenome: ");
		String sobrenomeCliente = scanner.next();
		
		System.out.println("Digite seu numero da conta: ");
		int numeroConta = scanner.nextInt();
		    
		System.out.println("Digite seu numero da agencia:  ");
		String agencia = scanner.next();
		
		
		System.out.println("Digite o saldo da sua conta: ");
		Double saldo = scanner.nextDouble();
		
		
		System.out.println("Ola " + nomeCliente + " " + sobrenomeCliente + "!" );
		System.out.println("Obrigado por criar uma conta em nosso banco!!");
		System.out.println("O numero da sua conta e: " + numeroConta);
		System.out.println("O numero da sua agencia e: " + agencia);
		System.out.println("Saldo disponivel: " + saldo);
	}

}
