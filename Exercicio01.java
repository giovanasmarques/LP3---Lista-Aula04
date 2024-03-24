package ExerciciosBasicos;

public class Exercicio01 {
	
	public static void main(String[] args) {
	
		Calculadora calc = new Calculadora();
	
		System.out.println("Multiplicação: " + calc.Multiplicar(10, 5));
		System.out.println("Divisão: " + calc.Dividir(10, 5));
		System.out.println("Soma: " + calc.Somar(10, 5));
		System.out.println("Subtração: " + calc.Subtrai(10, 5));
	}
}
