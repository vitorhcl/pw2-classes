
public class TestaAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno alu = new Aluno();
		alu.nome = "João";
		alu.rg = "123.456.789-00";
		alu.data_nasc = "10/07/2005";
		System.out.println("Nome: " + alu.nome);
		System.out.println("RG: " + alu.rg);
		System.out.println("Data de nascimento: " + alu.data_nasc);
	}

}
