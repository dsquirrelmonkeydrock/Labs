import java.util.Scanner;

public class Week2 {

	public static void main(String[] args) {
		// Create an if / else if statement to determine how many digits are in the
		// variable num and then prints a message to the console indicating how many
		// digits are in num.
		// You only need to check for two digit numbers, three digit numbers, four digit
		// // numbers, and five digit numbers.
		// int num = 96513;
		// int num2 = num;
		// int count = 0;
		// while (num2 != 0) {
		// num2 = num2 / 10;
		// count++;
		// }
		// if (count <= 1 || count > 5) {
		// System.out.println("Your number is smaller than 10 or larger than 99999.");
		// } else if (count == 2) {
		// System.out.println(num + " is a two digit number");
		// } else if (count == 3) {
		// System.out.println(num + " is a three digit number");
		// } else if (count == 4) {
		// System.out.println(num + " is a four digit number");
		// } else if (count == 5) {
		// System.out.println(num + " is a five digit number");
		// }
		//
		// // Create an if/else statement that checks the value of x and the value of y
		// and
		// // determines what quadrant the point would be located in then prints the
		// // message "The point is in quadrant �"
		// // This problem assumes the normal graphing points of (x, y). So, if you have
		// // (-5, -10) as you x and y variables, the program should print that "The
		// point
		// // is in quadrant 3."
		// int x = 1;
		// int y = 4;
		//
		// if (x < 0 && y > 0) {
		// System.out.println("The point is in quadrant 2.");
		// } else if (x > 0 && y > 0) {
		// System.out.println("The point is in quadrant 1.");
		// } else if (x < 0 && y < 0) {
		// System.out.println("The point is in quadrant 3.");
		// } else if (x > 0 && y < 0) {
		// System.out.println("The point is in quadrant 4.");
		// } else {
		// System.out.println("The point is resting on the x or y axis.");
		// }
		//
		// // Create an if/else if statement that checks myNumber against num1 and based
		// on
		// // which condition evaluates to true, print the following messages:
		// //
		// // num1 + " is smaller than my number, " + myNumber num1 + " is larger than
		// my
		// // number, " + myNumber num1 + " is equal to my number, " + myNumber
		//
		// int num1 = 156;
		// int myNumber = 157;
		//
		// if (num1 < myNumber) {
		// System.out.println(num1 + " is smaller than my number, " + myNumber);
		// } else if (num1 > myNumber) {
		// System.out.println(num1 + " is larger than my number, " + myNumber);
		// } else if (num1 == myNumber) {
		// System.out.println(num1 + " is equal than my number, " + myNumber);
		// }
		//
		// // Create an if/else statement to check to see if the number in variable a is
		// // even or odd and then print "even" or "odd" based on whether the condition
		// // evaluates to true or false.
		// int a = 7;
		// if (a % 2 == 0) {
		// System.out.println("even");
		// } else {
		// System.out.println("odd");
		// }
		//
		// // Create an if/else statement that checks the length of a String in variable
		// // randomWord and if it contains 10 or more characters, print "That is a
		// really
		// // long word!". Otherwise, print "Your word is not that long."
		//
		// String randomWord = "aaaaaaaaa";
		// if (randomWord.length() >= 10) {
		// System.out.println("That is a really long word!");
		// } else {
		// System.out.println("Your word is not that long.");
		// }
		//
		// //
		// String word1 = "Hi there!";
		// String word2 = "Well, hello friend.";
		// if (word1.length() > word2.length()) {
		// System.out.println("word1 has more characters");
		// } else {
		// System.out.println("word2 has more characters");
		// }
		//
		// // Create a nested if statement (the second if statement will only run if the
		// // first one evaluates to true) that checks to see if num1 is greater than or
		// // equal to num2. If true then check to see if num3 is greater than or equal
		// to
		// // num4. If both conditions are true print "both statements are true". At the
		// // end of the main method, print "program ended".
		//
		// //int num1 = 5;
		// //int num2 = 5;
		// int num3 = 5;
		// int num4 = 5;
		//
		// if (num1 >= num2) {
		// if (num3 >= num4) {
		// System.out.println("both statements are true");
		// }
		// }
		//
		// System.out.println("program ended");
		//
		//
		//// Create a for loop that prints the numbers 0 to x to the console, where x is
		// a value that is provided by the user. Make sure that you check for the value
		// of x to be greater than zero (0).
		//// Use the System.out.println that is in the code to print to the console when
		// x is less than one (1).
		//
		// int x1 = 10;
		// if(x1 < 1) {
		// System.out.println("Please enter a number greater than 0.");
		// }else {
		// for (int i = 0; i <= x1; i++) {
		// System.out.println(i);
		// }
		// }

		// Create a do while loop that checks the length of userWord and if that word is
		// less than 5 characters, then print userWord to the console 1 time. If it is 5
		// or more
		// characters print userWord to the console userWord.length() number of times.
		// (i.e. if userWord = "Loops" - then "Loops" would print 5 times, if it is
		// "Java" then it would
		// only print 1 time)

		// Scanner in = new Scanner(System.in);
		// String userWord = in.nextLine();
		// int wordLength = userWord.length();
		// int counter = wordLength;

		// do {
		// System.out.println(userWord);
		// if (wordLength < 5) {
		// break;
		// }
		// counter--;
		// } while (counter > 0);

		// Create a for loop that prints out a multiplication table for num from 1
		// through 10 as follows (assuming num is 1):

		// int num = 10;

		// for (int i = 1; i <= 10; i++) {
		// System.out.println(num + " x " + i + " = " + (i * num));
		// }

		// for(int i=1; i<=10; i++) {
		// System.out.println(num +" x " + i + " = " + (num*i) );
		// }

		// The user is providing you with two (2) values. The first is stored in the
		// variable numToAdd. The second value is stored in the variable howManyTimes.
		// Create a do while loop that adds numToAdd to itself as many times as the loop
		// runs, which is set by howManyTimes.
		// You will want to set up your addition so that the value of numToAdd is always
		// changing through each iteration of the loop, like so: numToAdd += numToAdd
		// Once the loop has finished running, print the value of numToAdd to the
		// console.

		// int numToAdd = 4;
		// int howManyTimes = 7;

		// do {
		// numToAdd += numToAdd;
		// howManyTimes--;
		// } while (howManyTimes > 0);
		// System.out.println(numToAdd);

		// Check to see if userNumber is between 1 and 100. If it is, create a while
		// loop that prints all integer values starting with userNumber to 100. If not,
		// print (exactly) "Your number was not between 1 and 100." to the console.

		// int userNumber = 99;
		// int counter;

		// if (userNumber >= 1 && userNumber <= 100) {
		// counter = userNumber;
		// while (counter <= 100) {
		// System.out.println(counter);
		// counter++;
		// }
		// } else {
		// System.out.println("Your number was not between 1 and 100.");
		// }

		// Using a for loop, raise base to the power of power (i.e. base^power) and
		// print the result to the console.

		// int base = 12;
		// int power = 3;
		// int result = 1;

		// result = base;
		// for (int i = 1; i < power; i++) {
		// result = result * base;
		// }

		// System.out.println("Result: " + result);

		// Create a for loop that starts at 1 and goes to 100, but increments by the
		// value of userValue and prints the value of the counter to the console each
		// time the loop processes. Also, check to make sure that userValue is greater
		// than 0. If userValue is not greater than 0, print "Your number needs to be
		// greater than 0."

		// int userValue = 26;
		// if (userValue <= 0) {
		// System.out.println("Your number needs to be greater than 0.");
		// } else {
		// for (int i = 1; i < 100; i += userValue) {
		// System.out.println(i);
		// }
		// }

		// Write a for loop that starts at zero and loops the length of a user-entered
		// String saved in userWord. Every time the loop runs, the userWord is added to
		// the variable longString to make a repeating string. For example, if the
		// userWord was = "Hello", the loop would run 5 times and the word "Hello" to
		// longString 5 times. The String printed to the console would be
		// "HelloHelloHelloHelloHello"

		// String userWord = "Hello";
		// String longString = "";

		// for (int i = userWord.length(); i > 0; i--) {
		// longString += userWord;
		// }
		// System.out.println(longString);

		// Write a loop that does a countdown from the variable countDown. This number
		// represents the number that a user enters. Check to make sure the number is
		// not larger than 10, but greater than or equal to 3. Each time the loop runs,
		// print to the console the value of the counter followed by three periods (…).
		// Your console should print (10…, 9…, 8…, etc.) Once out of the loop, print to
		// the console "We have lift off!". If a number is less than 3 or greater than
		// 10, then the only message printed to the console is "We have lift off!"

		int countDown = 5;

		if (countDown < 3 || countDown > 10) {
			System.out.println("We have lift off!");
		} else {
			for (int i = countDown; i > 0; i--) {
				System.out.println(i + "...");
			}
			System.out.println("We have lift off!");
		}

	}

}
