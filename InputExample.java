/******************************************************************
*
*
*
*	An example of how to use the Input class to read from a file
*
*
*
******************************************************************/

public class InputExample {
	
	public static void main(String[] args) {
		Input.open("nbody/input_example.txt");
		
		System.out.println(Input.nextInt());
		System.out.println(Input.nextDouble());
		System.out.println(Input.nextDouble());
		System.out.println(Input.next());

		while (Input.hasNext()) {
			System.out.println(Input.nextInt());	
		}

		Input.close();
	}
}