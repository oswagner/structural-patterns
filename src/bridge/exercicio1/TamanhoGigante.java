package bridge.exercicio1;

public class TamanhoGigante extends AbstracaoTamanho {

	public TamanhoGigante(ImplementacaoRefrigerante refrigerante) {
		super(refrigerante);
	}

	@Override
	public void beber() {
		System.out.println("Toma um gole de " + refrigerante);
		System.out.println("Toma um gole de " + refrigerante);
		System.out.println("Toma um gole de " + refrigerante);
		System.out.println("Toma um gole de " + refrigerante);
		System.out.println("Toma um gole de " + refrigerante);
		System.out.println("Acabou o(a) " + refrigerante);
		System.out.println();
	}

}
