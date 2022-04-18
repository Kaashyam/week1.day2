package week1.day2;

public class MyCalculator {
	public static void main(String[] args) {
		//Crearting Object
		Calculator objName = new Calculator();
		
		//Running the methods created in class **Calculator**
		
		int sum = objName.addThreeNumbers(5, 4, 3);
		System.out.println(sum);
		
		int sub = objName.subTwoNumbers(10, 5);
		System.out.println(sub);
		
		double mul = objName.mulTwoNumbers(5, 4);
		System.out.println(mul);
		
		float div = objName.divTwoNumbers(7, 2);
		System.out.println(div);
	}

}
