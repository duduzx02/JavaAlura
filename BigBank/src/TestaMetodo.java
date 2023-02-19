
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoEduardo = new Conta();
		contaDoEduardo.deposita(50);
		
		System.out.println(contaDoEduardo.saldo);
		
		contaDoEduardo.saca(500);
		System.out.println(contaDoEduardo.saldo);
		
		Conta contaDaLivia = new Conta();
		contaDaLivia.deposita(500);
		
		
		if(contaDaLivia.tranfere(300, contaDoEduardo)) {
			System.out.println("Transferencia feita com sucesso!");
		} else {
			System.out.println("Saldo insuficiente!");
		}
		;
		System.out.println(contaDaLivia.saldo);
		System.out.println(contaDoEduardo.saldo);
		
	}

}
