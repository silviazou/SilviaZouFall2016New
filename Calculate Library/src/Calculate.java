/**
 * 
 */

/**
 * @author APCS1 Silvia Zou
 *
 */
public class Calculate {
	public static int square(int integer){
		return integer * integer;
	}
	public static int cube(int integer){
		return integer * integer * integer;
	}
	public static double average(double numOne, double numTwo){
		return (numOne + numTwo)/ 2;
	}
	public static double average(double numOne, double numTwo, double numThree){
		return (numOne + numTwo + numThree)/ 3;
	}
	public static double toDegrees(double radians){
		double pie = 3.14159;
		return (radians/pie) * 180;
	}
	public static double toRadians(double angle){
		double pie = 3.14159;
		return (angle * pie) / 180;
	}
	public static double discriminant(double a, double b, double c){
		double answer = (b*b) - 4*a*c;
	    return answer;
	}
	public static String toImproperFrac(int wholeNum, int numerator, int denominator){
		int newNumerator = wholeNum * denominator + numerator;
		return newNumerator + "/" + denominator;
	}
	public static String toMixedNum(int numerator, int denominator){
		int wholeNum = numerator/ denominator;
		int remainder = numerator % denominator;
		return wholeNum + " " + remainder + "/" + denominator; 
	}
	public static String foil(int intOne, int intTwo, int intThree, int intFour, String variable){
		int partOne = intOne * intThree;
		int partTwo = (intOne * intFour) + (intTwo * intThree);
		int partThree = intTwo * intFour;
		return partOne + variable + "^2 + " + partTwo + variable + " + " + partThree;
	}
	
	
	
	//Part Two 9/6/16
	
	
	
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
	public static double absValue(double integer){
		if(integer < 0){
			return integer * -1;
		}else{
			return integer;
		}
	}
	public static int max(int numOne, int numTwo){
		if(numOne > numTwo){
			return numOne;
		}else{
			return numTwo;
		}
	}
	public static int max(int numOne, int numTwo, int numThree){
		if(numOne > numTwo && numOne > numThree){
			return numOne;
		}else if(numThree > numTwo && numThree > numOne) {
			return numTwo;
		}
		return numThree;
	}
	public static int min(int numOne, int numTwo){
		if(numOne < numTwo){
			return numOne;
		}
		return numTwo;
	}
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
	public static boolean isPrime(int number){
		for(int i = 2; i < number; i++){
			boolean divisible = isDivisibleBy(number, i);
			if(divisible){
				return false;
			}
		}
		return true;
	}
	public static int gcf(int numOne,int numTwo){
		int gcfactor = 0;
		int largerNum = max(numOne, numTwo);
		for(int i = 2; i < largerNum; i++){
			if(numOne % i == 0 && numTwo % i == 0){
				gcfactor = i;
			}
		}
		return gcfactor;
	}
	public static double sqrt(double number){
		if(number >=
				0){
			double squareRoot = number / 2;
			double t = 0;
			 
			while ((t - squareRoot) != 0){
				t = squareRoot;
				squareRoot = (t + (number / t)) / 2;
			}
			double rounded = round2(squareRoot);
			return rounded;
		}
		throw new IllegalArgumentException();
	}
	
	
	
	//Part 4
	
	

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

