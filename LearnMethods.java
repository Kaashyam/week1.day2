package week1.day2;

public class LearnMethods {
	public static void main(String[] args) {
	    // ClassName objectName = new ClassName();
		LearnMethods objectName = new LearnMethods();
		// obj.methodName();
		objectName.printCarName();
		int regNumber = objectName.getCarRegNumber();
		System.out.println(regNumber);
		String Variant = objectName.getCarVariant();
		System.out.println(Variant);
		int multiply = objectName.multiplyTwoNumbers(4, 4);
		System.out.println(multiply);
	}

	public void printCarName() {
		System.out.println("Honda Jazz");
	}

	public int getCarRegNumber() {
		int regNumber = 5191;
		return regNumber;
	}

	public String getCarVariant() {
		return "Petrol";
	}

	public int multiplyTwoNumbers(int a, int b) {
		return a * b;
	}
}
