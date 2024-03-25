package br.edu.ifsp.cmp.tads.ex04;

public class Exercicio04 {

	public static void main(String[] args) {
		
		ContaBancaria conta = new ContaBancaria("1234-g", 15000);
		
			conta.Depositar(150);
			conta.Sacar(1800);
			conta.verSaldo();
		
	}
}
