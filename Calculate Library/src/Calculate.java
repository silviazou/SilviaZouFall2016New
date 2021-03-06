/**
 * 
 */

/**
 * @author APCS1 Silvia Zou
 *
 */
public class Calculate {
	//This method accepts and integer and returns the square of the integer.
	public static int square(int integer){
		return integer * integer;
	}
	//This method accepts an integer and returns the cube of the integer.
	public static int cube(int integer){
		return integer * integer * integer;
	}
	//This method accepts two doubles and returns the average of the two numbers.
	public static double average(double numOne, double numTwo){
		return (numOne + numTwo)/ 2;
	}
	//This method accepts three doubles and returns the average of the three numbers.
	public static double average(double numOne, double numTwo, double numThree){
		return (numOne + numTwo + numThree)/ 3;
	}
	//This number accepts a radian(double) and returns the radian in degrees.
	public static double toDegrees(double radians){
		double pie = 3.14159;
		return (radians/pie) * 180;
	}
	//This code accepts a double and returns the double in radian form.
	public static double toRadians(double degrees){
		double pie = 3.14159;
		return (degrees * pie) / 180;
	}
	//This code accepts three doubles and returns the discriminant of the the three numbers.
	public static double discriminant(double a, double b, double c){
		double answer = (b*b) - 4*a*c;
	    return answer;
	}
	//This method accepts a mixed number and returns it in the form of an improper fraction.
	public static String toImproperFrac(int wholeNum, int numerator, int denominator){
		int newNumerator = wholeNum * denominator + numerator;
		return newNumerator + "/" + denominator;
	}
	//this method accepts an improper fraction and returns it in the form of a mixed number.
	public static String toMixedNum(int numerator, int denominator){
		int wholeNum = numerator/ denominator;
		int remainder = numerator % denominator;
		return wholeNum + " " + remainder + "/" + denominator; 
	}
	//This method accepts three integers and a variable and foils them.
	public static String foil(int intOne, int intTwo, int intThree, int intFour, String variable){
		int partOne = intOne * intThree;
		int partTwo = (intOne * intFour) + (intTwo * intThree);
		int partThree = intTwo * intFour;
		return partOne + variable + "^2 + " + partTwo + variable + " + " + partThree;
	}
	
	
	
	//Part Two 9/6/16
	
	
	
	//This method accept two integers and checks if the first number is divisible by the second.
	public static boolean isDivisibleBy(int numOne, int numTwo){
		if(numOne != 0 || numTwo != 0){
			if(numOne % numTwo == 0){
				return true;
			}else{
				return false;
			}
		}
		throw new IllegalArgumentException();
	}
	//this method accepts an integer and returns the absolute value of it.
	public static double absValue(double integer){
		if(integer < 0){
			return integer * -1;
		}else{
			return integer;
		}
	}
	//This method accepts two integers and returns the larger of the two.
	public static int max(int numOne, int numTwo){
		if(numOne > numTwo){
			return numOne;
		}else{
			return numTwo;
		}
	}
	//This method accepts three integer and returns the largest of the three.
	public static int max(int numOne, int numTwo, int numThree){
		if(numOne > numTwo && numOne > numThree){
			return numOne;
		}else if(numThree > numTwo && numThree > numOne) {
			return numTwo;
		}
		return numThree;
	}
	//This method accepts two intgers and returns the smallest of the two.
	public static int min(int numOne, int numTwo){
		if(numOne < numTwo){
			return numOne;
		}
		return numTwo;
	}
	//This method accepts a double and returns the number rounded to two digits.
	public static double round2(double integer){
		integer = integer * 1000;
		int asInt = (int) integer;
		if(asInt % 10 < 5){
			asInt = asInt / 10;
			return (double)asInt /100;
		}
		asInt = asInt / 10;
		return ((double)asInt/10 + 1) /100;

	}
	
	
	
	//Part Three
	
	
	
	//This method accepts a number and an exponent and returns the number to the power of the exponent.
	public static double exponent(double number, int exponent){
		double solution = number;
		if(exponent > 0){
			if(exponent != 0){
			for(int i = 1 ; i < exponent; i++ ){
				solution = solution * number; 
			}
				return solution;
			}
			return 1;
		}
		throw new IllegalArgumentException();
	}
	//This method accepts an integer and returns its factorial.
	public static int factorial(int number){
		if(number < 0){
			int factorial = number;
			for(int i = number - 1; i > 0; i--){
				factorial = factorial* i;
			}
			return factorial;
		}
		throw new IllegalArgumentException();
	}
	//This method accepts an integer and checks whether or not the number is prime.
	public static boolean isPrime(int number){
		for(int i = 2; i < number; i++){
			boolean divisible = isDivisibleBy(number, i);
			if(divisible){
				return false;
			}
		}
		return true;
	}
	//This method accepts two integers and returns the greatest common factor of the two.
	public static int gcf(int numOne,int numTwo){
		int gcfactor = 0;
		int largerNum = max(numOne, numTwo);
		for(int i = 2; i < largerNum; i++){
			if(numOne % i == 0 && numTwo % i == 0){
				gcfactor = i;
			}
		}
		if(numOne == numTwo){
			return numOne;
		}else if (numOne == 0 || numTwo == 0){
			return largerNum;
		}
		return gcfactor;
	}
	//This code accepts a double and returns the square root of the number.
	public static double sqrt(double number){
		if(number > 0){
			double t;
		 
			double squareRoot = number / 2;
		 
			do {
				t = squareRoot;
				squareRoot = (t + (number / t)) / 2;
			} while ((t - squareRoot) != 0);
		 
			return round2(squareRoot);
		}
		throw new IllegalArgumentException();
	}
	
	
	
	//Part 4
	
	
	
	//This method accepts three integers and returns the result of the quadratic equation.
	public static String quadForm(int a, int b, int c){
		double discriminant = discriminant(a, b, c);
		if (discriminant < 0){
			return("no real roots");
		}else{
			double solutionOne = round2((-b - sqrt(discriminant))/(2 * a));
			double solutionTwo = round2((-b + sqrt(discriminant))/(2 * a));
			if(solutionOne == solutionTwo){
				return(solutionOne + " ");
			}else{
				return(solutionOne + " " + solutionTwo);
			}
		}
	}
	
}

