
public class TesteGerente {


	public static void main(String[] args) {
		
		Gerente g1 = new Gerente ();
		g1.setNome("Maycon Nunes");
		g1.setSalario(1000);
		g1.setSenha(111);
	
		System.out.println(g1.getNome());
		System.out.println(g1.getSalario());
		System.out.println(g1.autentica(111));
		System.out.println(g1.getBonificacao());
	}
}