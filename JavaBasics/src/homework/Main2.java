package homework;

public class Main2 {

	public static void main(String[] args) {
		SyntaxTechnologies obj1 = new SyntaxTechnologies();
		SyntaxTechnologies obj2 = new SyntaxTechnologies("Syntax", 4, "2019", "07/30/2019");
		output(obj1);
		output(obj2);
	}
	public static void output(SyntaxTechnologies obj) {
		System.out.println(obj.schoolName+" "+obj.batch+" "+obj.year+" "+obj.lastDayOfClass);
	}
}
