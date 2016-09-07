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
		//does x have a value?
		int x = 1;
		return  (c - (a*x))/b;
	}
	public static String toImproperFrac(int wholeNum, int numerator, int denominator){
		int newNumerator = wholeNum * denominator + numerator;
		String fraction = newNumerator + "/" + denominator;
		return (fraction);
	}
	public static String toMixedNum(int numerator, int denominator){
		int wholeNum = numerator/ denominator;
		int remainder = numerator % denominator;
		String mixedNum = wholeNum + " " + remainder + "/" + denominator; 
		return mixedNum;
	}
	public static String foil(int intOne, int intTwo, int intThree, int intFour, String variable){
		int partOne = intOne * intThree;
		int partTwo = (intOne * intFour) + (intTwo * intThree);
		int partThree = intTwo * intFour;
		String quadEq = partOne + variable + "^2 + " + partTwo + variable + " + " + partThree;
		return quadEq;
	}
	
	
	
	//Part Two 9/6/16
	
	
	
	public static boolean isDivisibleBy(int numOne, int numTwo){
		if(numOne % numTwo == 0){
			return true;
		}else{
			return false;
		}
	}
	public static double absValue(double integer){
		if(integer < 0){
			return integer * -1;
		}else{
			return integer;
		}
	}
	public static boolean max(int numOne, int numTwo){
		//Return a boolean?
		if(numOne > numTwo){
			return true;
		}else{
			return false;
		}
	}
	public static boolean max(int numOne, int numTwo, int numThree){
		//Return a boolean?
		if(numOne > numTwo && numOne > numThree){
			return true;
		}else if(numThree > numTwo && numThree > numOne) {
			return false;
		}else{
			return true;
		}
	}
	public static boolean min(int numOne, int numTwo){
		//return a boolean?
		if(numOne < numTwo){
			return true;
		}else{
			return false;
		}
	}
	public static double round2(double integer){
		//how to do D:
	}
}
