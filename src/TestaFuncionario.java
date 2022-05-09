
public class TestaFuncionario {

	public static void main(String[] args) {
		Endereco end = new Endereco();
		end.estado = "São Paulo";
		end.bairro = "Vila Madalena";
		end.logradouro = "Rua Lemos Conde";
		end.numero = 78;
		
		Funcionario func = new Funcionario();
		func.cargo = "Professor";
		func.salario = 3000.60;
		func.end = end;
		System.out.println("Cargo: " + func.cargo);
		System.out.println("Salario: " + func.salario);
		System.out.println("Endereço: " + func.end);
	}

}
