import java.util.*;
public class MinMax {
	public static void main(String[] args){
		int max = 1; 
		int min = 1;
		int counter = 0;
		System.out.println("Enter a number: ");
		Scanner initialInput = new Scanner(System.in);
		for(int i = 0; i <= 10; i++){
			int userInput = initialInput.nextInt();
			System.out.println("Enter another number: ");
			if(userInput> max){
				max = userInput;
			}else if(userInput < min ){
				min = userInput;
			}
			if(userInput % 2 == 0){
				counter += userInput;
			}
		}
		System.out.println("The total of the numbers divisible by two is " + counter);
		System.out.println("The max number is " + max);
		System.out.println("The min number is " + min);
		initialInput.close();
	}
}
