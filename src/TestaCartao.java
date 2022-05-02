
public class TestaCartao {
	public static void main(String[] args) {
		Cliente cl1 = new Cliente();
		cl1.nome = "João";
		cl1.codigo = "4321";
		cl1.status = StatusClienteEnum.ATIVO;
		
		Cartao c1 = new Cartao();
		c1.cliente = cl1;
		c1.dataValidade = "10/07/2024";
		c1.numero = "4188";
		c1.tipo = TipoCartaoEnum.CREDITO;
		
		System.out.println("Nome: " + cl1.nome);
		System.out.println("Código: " + cl1.codigo);
		System.out.println("Status: " + cl1.status);
		
		System.out.println("Data de validade: " + c1.dataValidade);
		System.out.println("Número: " + c1.numero);
		System.out.println("Tipo: " + c1.tipo);
	}
}
