package assingment3;

public class Assingment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// program rolls a 20 sided dice 1000 times and records the number
		// of occurrences of each result.
		// See:https://en.wikipedia.org/wiki/Dice#Common_variations
		// Math.random() returns 0.0 to 1.0 excluding 1.0
		// i.e. we could get 0.99999999999 etc. but not 1.0
		// so Math.random() times upper range of 20 is 0 to 19

		// Hint: it is easy to make a mistake with array indexes as people
		// (and dice) count from 1 upwards, while programmers using arrays
		// count from 0 upwards.
		int roll = 0;
		int[] diceRolls = new int[20];
		int totalRolls = 0;

		// sample the rolls
		for(int count = 0; count < 1000; count++) {
			roll = (int)(Math.random() * 20) + 1;
			diceRolls[roll - 1]++; // Adjust the index to avoid ArrayIndexOutOfBoundsException
        }
		
		// run a report
		for(int index = 0; index < diceRolls.length; index++) {
			System.out.printf("Count of %d is: %d%n", (index + 1), diceRolls[index]);
			totalRolls = totalRolls + diceRolls[index];
		}
		System.out.println("Total rolls were: " + totalRolls);
		System.out.println("Program by Prince");

	}

}
