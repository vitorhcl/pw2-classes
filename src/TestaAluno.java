
public class TestaAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Turma t3a = new Turma();
		t3a.periodo = "Manhã";
		t3a.serie = 3;
		t3a.sigla = "3A";
		t3a.tipo = "Ensino Fundamental";
		
		Aluno alu = new Aluno();
		alu.nome = "João";
		alu.rg = "123.456.789-00";
		alu.dataNasc = "10/07/2005";
		alu.turma = t3a;
		System.out.println("Nome: " + alu.nome);
		System.out.println("RG: " + alu.rg);
		System.out.println("Data de nascimento: " + alu.dataNasc);
		System.out.println("Turma: " + alu.turma);
	}

}
