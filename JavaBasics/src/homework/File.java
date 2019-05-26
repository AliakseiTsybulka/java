package homework;
/*
* Create a class File that will have the following behaviors: open, edit, close. Edit and close are implemented method while open is an abstract.
* Create 3 subclasses: JavaFile, WordFile, PDFFile that will provide specific implementation of open behaviour:
* Exmaple: to open .java file we need notepad++ or sublime tex, to open .doc file we need Microsoft word to be installed
*/
public abstract class File {
public abstract void open();
public  void edit() {
	System.out.println("File can be edited");
}
public void close() {
	System.out.println("File can be closed");
}
}
class JavaFile extends File {    @Override
   public void open() {
	System.out.println("to open .java file we need notepad++ or sublime tex");
	}
}
class WordFile extends File {    @Override
	public void open() {
	System.out.println("to open .doc file we need Microsoft word to be installed");
	}
}
class PDFFile extends File {    @Override
	public void open() {
	System.out.println("to open .PDF file please install Adobe Acrobat Reader");
	}
}