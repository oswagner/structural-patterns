package composite.exercicio1;

import java.util.ArrayList;

public class FileComposite extends AbstractFile {

	ArrayList<AbstractFile> fileSystem = new ArrayList<AbstractFile>();
	
	public FileComposite(String filename) {
		this.filename = filename;
	}
	
	@Override
	public void printFilename() {
		for (AbstractFile concreteFile : fileSystem) {
			concreteFile.printFilename();
		}
	}
	
	@Override
	public void addFile(AbstractFile file) throws Exception {
		this.fileSystem.add(file);
	}
	
	@Override
	public void removeFile(String file) throws Exception {
		for (AbstractFile concreteFile : fileSystem) {
			if (concreteFile.getFilename().equalsIgnoreCase(filename)) {
				this.fileSystem.remove(concreteFile);
				return;
			}
		}
	}
	
	@Override
	public AbstractFile getFile(String filename) throws Exception {
		for (AbstractFile concreteFile : fileSystem) {
			if(concreteFile.getFilename().equalsIgnoreCase(filename)) {
				return concreteFile;
			}
		}
		throw new Exception("Não existe este arquivo");
	}
}
