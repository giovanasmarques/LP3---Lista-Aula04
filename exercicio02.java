package ExerciciosBasicos02;

public class exercicio02 {
    
    public static class Estudante {
        private String nome;
        private int idade;
        private double nota;

        public Estudante(String nome, int idade, double nota) {
            this.nome = nome;
            this.idade = idade;
            this.nota = nota;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }
        
        public double getNota() {
            return nota;
        }

        public void setNota(double nota) {
            this.nota = nota;
        }
        
        public boolean Aprovado(int nota) {
    		if (nota >= 7 && nota < 11) {
    			return true;
    		}else {
    			return false;
    		}
    	}
        
    }

    public static void main(String[] args) {

        Estudante estudante = new Estudante("Joca", 12, 8);

        System.out.println("Nome: " + estudante.getNome());
        System.out.println("Idade: " + estudante.getIdade());
        System.out.println("Aluno aprovado: " + estudante.Aprovado(8));

    }
}
