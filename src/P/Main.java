package P;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		PR obj = new PR();
		
		System.out.println("Enter the file name: ");
		
		obj.PrintW(in.next());
		
		
	}

}
