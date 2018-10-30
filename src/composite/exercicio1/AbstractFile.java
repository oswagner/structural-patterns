package composite.exercicio1;

public abstract class AbstractFile {

	String filename;

	public void printFilename() {
		System.out.println(this.filename);
	}

	public String getFilename() {
		return this.filename;
	}

	public void addFile(AbstractFile file) throws Exception {
		throw new Exception("Não pode inserir arquivos em:" + this.filename + " - Não é uma pasta");
	}

	public void removeFile(String filename) throws Exception {
		throw new Exception("Não pode remover arquivos de:" + filename + " - Não é uma pasta");
	}

	public AbstractFile getFile(String filename) throws Exception {
		throw new Exception("Não pode pesquisar arquivos em:" + filename + " - Não é uma pasta");
	}

}
