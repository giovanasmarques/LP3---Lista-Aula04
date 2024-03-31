package ExerciciosMedios02;

public class Exercicio06 {
	
public static void main(String[] args) throws Exception {
		
		ContaBancaria conta = new ContaBancaria("1234-g", 1500);
		
			conta.Depositar(150);
			conta.Sacar(180);
			conta.verSaldo();
	}

}
