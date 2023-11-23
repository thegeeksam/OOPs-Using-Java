package Abstraction;

abstract class CSE {
	int total;

	CSE() {
		System.out.println("Constructor is Invoked!\n");
	}

	void getDetails() {
		System.out.println("All Students are Good!\n");
	}

	abstract void student();
}

class CseC extends CSE { 
	void student() {
		System.out.println("This is II CSE C!\n");
	}
}

public class ConstructAbs {
	public static void main(String args[]) {
		CSE obj = new CseC();
		obj.student();
		obj.getDetails();
		obj.total = 64;
		System.out.println(obj.total);
	}

}