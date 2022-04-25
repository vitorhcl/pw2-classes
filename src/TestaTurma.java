
public class TestaTurma {

	public static void main(String[] args) {
		Turma turm = new Turma();
		turm.periodo = "Manhã";
		turm.serie = 3;
		turm.sigla = "3A";
		turm.tipo = "Ensino Fundamental";
		System.out.println("Período: " + turm.periodo);
		System.out.println("Série: " + turm.serie);
		System.out.println("Sigla: " + turm.sigla);
		System.out.println("Tipo: " + turm.tipo);
	}

}
