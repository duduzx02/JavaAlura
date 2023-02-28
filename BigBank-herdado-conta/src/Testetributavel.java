
public class Testetributavel {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(111, 222);
		cc.deposita(100.00);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadoraDeImposto calc = new CalculadoraDeImposto();
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());
	}
}
