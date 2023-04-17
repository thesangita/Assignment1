package Demo1;
import java.util.Scanner;

public class group {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the roll number : ");
		        int roll = sc.nextInt();

		        int num = roll%4;
		        if(num == 1)
		             System.out.println("You are in Saphhire group.");
		        
		        if(num == 2)
		             System.out.println("You are in Pearl group.");
		        
		        if(num == 3)
		             System.out.println("You are in Ruby group.");
		        
		        if(num == 0)
		             System.out.println("You are in Emerald group.");
		        
		        
		           sc.close();
		           }
}
