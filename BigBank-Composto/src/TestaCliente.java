
public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente eduardo = new Cliente();
		
		eduardo.nome = "Eduardo Lima";
		eduardo.cpf = "222.222.222-22";
		eduardo.profissao = "Programador";
		
		Conta contaDoEduardo = new Conta();
		contaDoEduardo.deposita(200);
		
		contaDoEduardo.titular = eduardo;
		System.out.println(contaDoEduardo.titular.nome);
		System.out.println(eduardo.nome);
	}

}
