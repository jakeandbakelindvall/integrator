//Intellectual property of Jake Lindvall, 2016
//Lol steal it I don't care

//package PACKAGE NAME HERE

public class Main {

	public static void main(String[] args) {
		
		Maths.Function f = (x) -> 10;
		
		//Prints the result of the lambda function above
		//between these two limits of integration.
		System.out.println(Maths.ridiculousAsciiIntegralPrinter(0, 10, f));

	}

}
