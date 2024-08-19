package ClasseObject;

public class TesteAluno {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno(1, "Matheus","Reis Costa", "Rua Barão de Petropolis");
		Aluno a2 = new Aluno(2, "Bernbardo","Martins Costa", "Rua Barão de Petropolis");

		System.out.println(a1);
		a1.equals(a2);
		
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		
	}

}
