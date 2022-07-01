
public class Week2 {

	public static void main(String[] args) {
		// Create an if / else if statement to determine how many digits are in the variable num and then prints a message to the console indicating how many digits are in num.
		//You only need to check for two digit numbers, three digit numbers, four digit numbers, and five digit numbers.
		int num = 96513;
		int num2 = num;
		int count = 0;
		while(num2 != 0) {
			num2 = num2/10;
			count++;
		}
		if(count <= 1 || count>5) {
			System.out.println("Your number is smaller than 10 or larger than 99999.");
		}else if(count == 2){
			System.out.println(num + " is a two digit number");
		}else if(count == 3){
			System.out.println(num + " is a three digit number");
		}else if(count == 4){
			System.out.println(num + " is a four digit number");
		}else if(count == 5){
			System.out.println(num + " is a five digit number");
		}
		
		
		
		//Create an if/else statement that checks the value of x and the value of y and determines what quadrant the point would be located in then prints the message "The point is in quadrant …"
		//This problem assumes the normal graphing points of (x, y). So, if you have (-5, -10) as you x and y variables, the program should print that "The point is in quadrant 3."
		int x = 1;
		int y = 4;
		
		if(x < 0 && y > 0) {
			System.out.println("The point is in quadrant 2.");
	}else if(x > 0 && y > 0) {
		System.out.println("The point is in quadrant 1.");
	}else if(x < 0 && y < 0) {
		System.out.println("The point is in quadrant 3.");
	}else if(x > 0 && y < 0) {
		System.out.println("The point is in quadrant 4.");
	}else {
        System.out.println("The point is resting on the x or y axis.");
    }
}

}
