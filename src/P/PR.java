package P;



import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class PR {

	public void PrintW(String next) {
		Scanner in = new Scanner(System.in);
		PrintWriter Writer = null;
		
		char answer;
		do {
			
			System.out.println("Enter the length of the array: ");
			
			if(in.hasNextInt()) 
			{
		
				try {

					next=next+".txt";
					Writer = new PrintWriter(next);
					int length = in.nextInt();
					String name[]=new String[length];
					
					in.skip(System.lineSeparator());
					
					for(int i=0; i < name.length;i++)
					{
						System.out.println("Enter the name: ");
						name[i]=in.nextLine();
					}
					int num[]=	new int[length];
					for(int i =0 ; i<num.length;i++)
					{
						num[i]=i+1;
					}
					for(int i=0; i < name.length;i++)
					{
						Arrays.sort(name);
						Writer.println(num[i]+". "+name[i]);
					}
					
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				Writer.close();
			}
			else {
				System.out.println("Error !!! : enter a number : ");
				answer = in.next().charAt(0);
			}
			
			
			System.out.println("Do you want to repeat the programe. (Y/N)");
			
			answer = in.next().charAt(0);
		}while(answer == 'y' || answer == 'Y');
		
		if(answer == 'n'||answer == 'N') {
			System.out.println("The program closed");
		}
		
		in.close();
	}
		
}
