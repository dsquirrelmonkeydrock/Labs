import java.io.CharArrayReader;
import java.util.Arrays;

public class Week3 {

	public static void main(String[] args) {

		System.out.println(passwordChecker("thisshouldwork!"));
		fizzBuzz(2);
		sumOfDigits(1234);
		int[] mainArray = createArray(5, 4, 3, 2, 1);
		System.out.println(mainArray[2]);

		System.out.println(returnSum(1, 1, 1));

		charArray("Welcome");

		System.out.println(Arrays.toString(buildArray(5)));

		String[] arr = { "Astros", "Reds", "Phillies", "Dodgers", "Angels" };

		newArray2("word1", "word2", "word3", arr);

		int[] arr2 = { 3, 7, 0, 4, -6, 10, 55 };
		changeTwo(1, 1, arr2);

	}

	public static boolean passwordChecker(String password) {
		// Write a method called passwordChecker that accepts the String stored in
		// variable password. The method should check to make sure that password is at
		// least 8 characters in length and contains one of 4 special symbols (!, $, %,
		// &). The method should return true or false.
		if (password.length() >= 8 && (password.contains("!") || password.contains("$") || password.contains("%")
				|| password.contains("&"))) {
			return true;
		} else {
			return false;
		}
	}

	public static void fizzBuzz(int num1) {
		// Create a method called fizzBuzz that accepts the integer value stored in
		// num1. If the value is divisible by 3, print "Fizz" to the console. If the
		// value is divisible by 5 print "Buzz" to the console. If the value is
		// divisible by both 3 and 5 print "FizzBuzz" to the console. If the number is
		// not divisible by either 3 or 5, print "Hello world!" to the console.

		if (num1 % 3 == 0 && num1 % 5 == 0) {
			System.out.println("FizzBuzz");
		} else if (num1 % 3 == 0) {
			System.out.println("Fizz");
		} else if (num1 % 5 == 0) {
			System.out.println("Buzz");
		} else {
			System.out.println("Hello World!");
		}
	}

	public static int sumOfDigits(int digits) {
		// Write a method call sumOfDigits that takes an integer variable called digits.
		// Then return the sum of all the numbers in digits. For example, 245 would be 2
		// + 4 + 5 = 11
		int sum = 0;
		while (digits > 0) {
			sum = sum + digits % 10;
			digits = digits / 10;
		}
		return sum;

	}

	public static int[] createArray(int a, int b, int c, int d, int e) {
		// Write a method that accepts five integer values stored in the variables a, b,
		// c, d, e. In the method, you will create an array of integers that stores the
		// value of these five variables. Your return statement will return this newly
		// created array.

		int[] newArray = new int[] { a, b, c, d, e };
		return newArray;

	}

	public static int returnSum(int num1, int num2, int num3) {
		// Create a method named returnSum that accepts 3 integer variables named num1,
		// num2, and num3. Return the sum of the three variables.
		return (num1 + num2 + num3);
	}

	public static int avgNameLength(String[] names) {
		// Write a method call avgNameLength that takes in an array of Strings stored in
		// names. The names array will hold 5 names that are entered by the user. The
		// method avgNameLength will traverse the array and find the average length of
		// all the names that are part of names

		int average = 0;
		for (int i = 0; i < names.length; i++) {
			average += names[i].length();
		}
		average = average / names.length;

		return average;

	}

	public static void charArray(String userWord) {
		// Using a user provided word, create a new array that is made up of the
		// characters of the word stored in the variable userWord. Once you have created
		// that array, print to the console each element of the array.
		int l = userWord.length();
		for (int i = 0; i < l; i++) {
			System.out.println(userWord.charAt(i));
		}

	}

	public static int[] buildArray(int num) {
		// In the method buildArray you will take the integer value stored in the
		// variable num and build an array of that size called numArray. To fill the
		// array, you will write a for loop that checks to see if the iterator is less
		// than num and add each iteration to one of the slots in numArray. Return the
		// variable numArray.
		int[] numArray = new int[num];
		for (int i = 0; i < num; i++) {
			numArray[i] = i;
		}
		return numArray;

	}

	public static void newArray2(String word1, String word2, String word3, String[] arr) {
		// Given an array of words, create a new array that combines three (3) words
		// provided by the user and the original array. Loop through the new array and
		// print each element to the console.
		int length = 3 + arr.length;
		String[] newArray = new String[length];

		for (int i = 0; i < arr.length; i++) {
			newArray[i] = arr[i];
		}
		newArray[length - 3] = word1;
		newArray[length - 2] = word2;
		newArray[length - 1] = word3;

		for (String word : newArray) {
			System.out.println(word);
		}
	}

	public static void changeTwo(int a, int b, int[] arr) {
		// Given an array of integers, replace the first and last value stored in the
		// array with integer values provided by the user. Loop through the array and
		// print the changed array to the console.
		arr[0] = a;
		arr[arr.length - 1] = b;

		for (int ar : arr) {
			System.out.println(ar);
		}

	}
}
