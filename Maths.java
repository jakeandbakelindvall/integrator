//Intellectual property of Jake Lindvall, 2016
//Lol steal it I don't care

//package PACKAGE NAME HERE

public class Maths {

	//Hard-coded function to get a y value.
	//This is what is being integrated over.
	public static double functionOf(double x){
		return (Math.sin(Math.cos(x - 10)));
	}
	
	
	//Method that takes an end and start location as arguments
	//draws a mid-point riemann rectangle and computes the sum.
	//Is called in "riemann" iteratively with the total integration 
	//x distance divided by 1,000,000 as the delta x passed in
	//The hard-coded function will calculate the y values to be passed 
	//into this as heights.
	public static double midSum(double x1, double xNull, double height1, double heightNull){
		return ( (x1 - xNull) * ((heightNull + height1) / 2 ) );
	}
	
	
	//Method that calls midSum iteratively between the limits of integration
	//Delta x is always the distance between the limits divided by 1,000,000
	public static double riemann(double lowerBound, double upperBound){
		
		double dx = ((upperBound - lowerBound) / 1000000);
		double riemannSum = 0;
		double previous = lowerBound;
		
		for(double i = lowerBound + dx; i <= upperBound; i += dx){
			riemannSum += midSum(i, previous, functionOf(i), functionOf(previous));
			previous = i;
		}
		
		return riemannSum;
	}
	
	//A ridiculous ascii integrand. Get over it. It's appended and stuff line-by-line for people
	//who are not me to visualize it a little better!
	public static String ridiculousAsciiIntegralPrinter(double lowerLimit, double upperLimit){
		StringBuilder sb = new StringBuilder();
		
		sb.append("   " + upperLimit);
		sb.append("\n   -");
		sb.append("\n  / |");
		sb.append("\n  |");
		sb.append("\n  |");
		sb.append("\n  |  / LOL I    \\");
		sb.append("\n  |  | GOT THIS | dx =  (" + riemann(lowerLimit, upperLimit) + ")");
		sb.append("\n  |  |   BRUH   |");
		sb.append("\n  |  \\          /");
		sb.append("\n| /");
		sb.append("\n -");
		sb.append("\n " + lowerLimit);
		
		return sb.toString();
	}
		
}
