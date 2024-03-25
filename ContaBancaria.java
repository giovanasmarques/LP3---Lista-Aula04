package br.edu.ifsp.cmp.tads.ex04;

public class ContaBancaria {
	
	public String numeroDaConta;
	public double saldo;
	
	public ContaBancaria(String numeroDaConta, double saldo) {
		this.numeroDaConta = numeroDaConta;
		this.saldo = saldo;
	}
	
	public void Depositar(double valor) {
		saldo = saldo + valor;
	}
	
	public void Sacar(double valor) {
		if(valor > saldo) {
			System.out.println("Saldo insuficiente!!");
		}else {
			saldo = saldo - valor;
		}
	}
	
	public void verSaldo() {
		System.out.println("Saldo atual: " + saldo);
	}

}
