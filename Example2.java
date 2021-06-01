package homework.conditionandloop;

public class Example2 {

	public static void main(String[] args) {
		String [] cars = new String[7];
		cars [0] = "Kia";
		cars [1] = "Dacia";
		cars [2] = "Opel";
		cars [3] = "Mercedez";
		cars [4] = "BMW";
		cars [5] = "Audi";
		cars [6] = "Fiat";
		
		System.out.println();
		//condition example 1
		
		if(cars[3].equals("Mercedez")) {
			System.out.println("it is a Mercedez");

		}else {
			System.out.println("it is not a Mercedez");
		}
		
		System.out.println();
		//example decision 2
		switch(cars[6]) {
		case "Audi":
			System.out.println("I love Audi");
			break;
		case "Opel":
			System.out.println("I love Opel");
			break;
		case "Kia":
			System.out.println("I love Kia");
			break;
		default:
			System.out.println("I love all these cars");
			break;
		
		}
		
		System.out.println();
		//example for loop
		for(int i = 0; i < cars.length; i++) {
			System.out.println("the car is: " + cars[i]);
		}
		
		System.out.println();
		//example forreach
		for(String car : cars) {
			System.out.println("the car is: " + car);
		}
		
		
		System.out.println();
		//example while
		
		int i = 0;
		while (i < cars.length) {
			System.out.println("the car is: " + cars[i]);
		i++;
		}
		
		System.out.println();
		//ecample dowhile
		int c = 0;
		do {
			System.out.println("the car is: " + cars[c]);
		c++;	
		}while (c < cars.length);
		
	
	}

}
