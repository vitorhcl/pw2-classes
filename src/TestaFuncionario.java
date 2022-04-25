
public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario func = new Funcionario();
		func.cargo = "Professor";
		func.salario = 3000.60;
		System.out.println("Cargo: " + func.cargo);
		System.out.println("Salario: " + func.salario);
	}

}
