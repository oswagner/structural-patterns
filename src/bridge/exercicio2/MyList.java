package bridge.exercicio2;

public class MyList {

	private MyCustomListImpl list;
	
	public MyList(MyCustomListImpl list) {
		super();
		this.list = list;
	}

	public void adicionar(String s) {
		list.adicionar(s);
	}

	public String imprimir() {
		return list.imprimir();
	}
}
