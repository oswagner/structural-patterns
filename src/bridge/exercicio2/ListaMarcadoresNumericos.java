package bridge.exercicio2;

public class ListaMarcadoresNumericos extends MyList {

	public ListaMarcadoresNumericos(MyCustomListImpl list) {
		super(list);
	}
	
	@Override
	public String imprimir() {
		String superRes = super.imprimir();
		String res = "";
		String words[] = superRes.split("\n");
		for (int i = 0; i < words.length; i++) {
			res += i + " " + words[i] + "\n";
		}
		return res;
	}

}
