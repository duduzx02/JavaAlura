
public class TesteConta {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);
		
		cp.transfere(10.0, cc);
		
		System.out.println("CC: " + cc.getSalgo());
		System.out.println("CP: " + cp.getSalgo());
		
	}

}
