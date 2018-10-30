package decorator.exercicio2;

public class EntreParenteses implements ImprimirInterface {

	
	private NumeroUm numero;
	
	
	public EntreParenteses(NumeroUm numero) {
		super();
		this.numero = numero;
	}

	@Override
	public void imprimir() {
		System.out.print("(");
		numero.imprimir();
		System.out.print(")");
	}
	
}
