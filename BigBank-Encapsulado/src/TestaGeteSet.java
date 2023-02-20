
public class TestaGeteSet {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setNumero(1335);
		System.out.println(conta.getNumero());
		
		Cliente eduardo = new Cliente();
		conta.setTitular(eduardo);
		eduardo.setNome("Eduardo Lima");
		
		System.out.println(conta.getTitular().getNome()); 
		
		conta.getTitular().setProfissao("Programador");
		
		System.out.println(conta.getTitular().getProfissao());
		
		
	}
}
