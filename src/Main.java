
public class Main {

	public static void main(String[] args) {
		
		// changeable variable value to calculate the nth smallest number
		int nth = 100;
		
		Numbers n = new Numbers();
		int k = n.smallestNumber(nth);
		
		System.out.print("the "+ nth +" smallest number is: "+ k);

	}

}
