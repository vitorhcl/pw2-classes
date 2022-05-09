
public class TestaConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agencia age1 = new Agencia();
		age1.numero = "1234";
		
		Conta conta1 = new Conta();
		conta1.agencia = age1;
		conta1.limite = 1000;
		conta1.numero = "0123456789";
		
		System.out.println("Número da agência: " + age1.numero);
		
		System.out.println("Agência: " + conta1.agencia);
		System.out.println("Limite: " + conta1.limite);
		System.out.println("Número: " + conta1.numero);
	}

}
