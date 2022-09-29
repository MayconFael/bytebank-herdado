
public class Testefuncionario {


	public static void main(String[] args) {
	
		Funcionario maycon =  new Funcionario();
		maycon.setNome("Maycon Nunes");
		maycon.setCpf("147785-26");
		maycon.setSalario(150);
	
		System.out.println("Salario"  + maycon.getNome());
		System.out.println(" Bonificacao" + maycon.getBonificacao());
	}
	
	
	

}
