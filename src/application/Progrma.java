package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Progrma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner sc = new Scanner(System.in);
			
			try {
				String[] vect = sc.nextLine().split(" ");
				int position = sc.nextInt();	
				System.out.println(vect[position]);
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Invalid position!");
			}
			catch (InputMismatchException e) {
				System.out.println("Input error!" + e.getMessage());
			}
			
			System.out.println("End of programs");
			
			sc.close();
	}

}
