package decorator.exercicio2;

public class DecoratorDemo {

	public static void main(String[] args) {

		NumeroUm num = new NumeroUm();
		EntreParenteses numParenteses = new EntreParenteses(num);
		EntreColchetes numColchetes = new EntreColchetes(num);
		EntreChaves numChaves = new EntreChaves(num);

		num.imprimir();
		numParenteses.imprimir();
		numColchetes.imprimir();
		numChaves.imprimir();
	}
}
