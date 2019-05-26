package homework;

class Child extends Parent {
	Child() {
		super("please");
		System.out.println("Child Constructor in child class with zero argument");
	}
	Child(String s) {
		super("one more");
		System.out.println("Child Constructor in child class with one argument");
	}
}