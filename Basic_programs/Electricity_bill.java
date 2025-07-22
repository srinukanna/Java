package Basic_programs;
import java.util.Scanner;

public class Electricity_bill {
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in);){
            int units,bill;
            int rupees;
            
            units=sc.nextInt();
            rupees=sc.nextInt();
          if(units<100)
          {
            bill=units*rupees;
            System.out.println(bill); 
          }
          else if(units<=200)
          {
             bill=units*rupees;
             System.out.println(bill); 
        }
        else
        {
            bill=units*rupees;
            System.out.println(bill); 
        }
        }
    }
}
