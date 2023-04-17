package Demo1;
import java.util.Scanner;

public class bill_calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of units : ");
        float unit = sc.nextFloat();
        double charge = 1;
        if(unit<100)
        {
            charge = unit * 1.20;
        }
        else if((unit>=100)&&(unit<=300))
        {
            charge = unit * 2;
        }
        else
        {
            charge = unit * 3;
        }
        System.out.println("Electricity bill is : "+charge);
        sc.close();
    }
	

}
