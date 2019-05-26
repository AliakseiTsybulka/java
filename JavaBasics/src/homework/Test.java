package homework;

public class Test {
public static void main(String[] args) {
	File obj; 
	obj = new JavaFile();
	obj.open();
	obj = new WordFile();
	obj.open();
	obj = new PDFFile();
	obj.open();
}
}
