package Demo1;
import java.util.Scanner;

public class flight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int total_number = 0;
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the number of rows : ");
		        int row = sc.nextInt();
		        for(int i = 1; i<=row; ++i)
		        {
		            System.out.println("Enter number of passenger in row number "+i+" : ");
		            int passenger = sc.nextInt();
		            total_number = total_number + passenger;
		        }
		        System.out.println("Total number of passenger is : "+total_number);
		    sc.close();

	}

}
