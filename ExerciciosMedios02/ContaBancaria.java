package ExerciciosMedios02;

public class ContaBancaria {
	
	public String numeroDaConta;
	public double saldo;
	
	public ContaBancaria(String numeroDaConta, double saldo) {
		this.numeroDaConta = numeroDaConta;
		this.saldo = saldo;
	}
	
	public String getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(String numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void Depositar(double valor) {
		saldo = saldo + valor;
	}
	
	public void Sacar(double valor) throws Exception {
		if(valor > saldo) {
			throw new Exception("Saldo insuficiente!!");
		}else {
			saldo = saldo - valor;
		}
	}
	
	public void verSaldo() {
		System.out.println("Saldo atual: " + saldo);
	}


}
