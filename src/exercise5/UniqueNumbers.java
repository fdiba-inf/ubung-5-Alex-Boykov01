package exercise5;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueNumbers {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter number count: ");
    int numberCount = input.nextInt();

    int[] numbers = new int[numberCount];

    System.out.print("Enter numbers: ");
    for (int index = 0; index < numbers.length; index++) {
      numbers[index] = input.nextInt();
    }

    int[] uniqueNumbers = new int[numbers.length];
    for (int index = 0; index < numbers.length; index++) 
    {
      int a = numbers[index];
      for (int i = index + 1; i < numbers.length - index; i++) 
      {
        if (a == numbers[i] && numbers[i] != 0) 
        {
          numbers[i] = 0;
        }
      }
    }
    int counter = 0;
    for (int index = 0; index < numbers.length; index++) {
      if (numbers[index] != 0) 
      {
        uniqueNumbers[counter] = numbers[index];
        counter++;
      }

    }
    String uniqueNumbersAsString = Arrays.toString(uniqueNumbers);
    System.out.println("Unique numbers: " + uniqueNumbersAsString);
  }
}