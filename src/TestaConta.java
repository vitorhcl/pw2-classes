
public class TestaConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agencia age1 = new Agencia();
		age1.numero = "1234";
		
		Conta conta1 = new Conta();
		conta1.agencia = age1;
		conta1.limite = 1000;
		conta1.numero = "0123456789";
		
		System.out.println("N�mero da ag�ncia: " + age1.numero);
		
		System.out.println("Ag�ncia: " + conta1.agencia);
		System.out.println("Limite: " + conta1.limite);
		System.out.println("N�mero: " + conta1.numero);
	}

}
