package bridge.exercicio2;

//Similar ao exercício anterior, utilizar o padrão Bridge para separar duas hierarquias que irão tratar aspectos
//diferentes de um objeto. Queremos, agora, implementar listas ordenadas e não ordenadas e que podem ser
//impressas como itens numerados, letras ou marcadores (“*”, “-”, etc.).
//Sugestão: defina a abstração (hierarquia da esquerda) como sendo uma interface de uma lista que declara
//métodos adicionar(String s) e imprimir() e suas implementações (abstrações refinadas) seriam a lista
//ordenada e não ordenada. Como implementador (hierarquia da direita), defina uma interface que imprime
//itens de lista, e suas implementações seriam responsáveis por imprimir com números, letras, marcadores,
//etc.

public class BridgeDemo {
	
	public static void main(String[] args) {
		
		ListaOrdenada ordenada = new ListaOrdenada();
		
		MyList listaNumerica = new ListaMarcadoresNumericos(ordenada);
		
		listaNumerica.adicionar("João");
		listaNumerica.adicionar("Maria");
		listaNumerica.adicionar("Ana");
		
		System.out.println(listaNumerica.imprimir());
	}
}
