import java.util.Scanner;
public class Conditions {
    public static void main(String[] args){
        
        final int x=10;
        try (Scanner sc = new Scanner(System.in)) {
            int a =sc.nextInt();
             int b = sc.nextInt();
             int c=a+b;
             System.out.println(c);
        }
          if(x>10){
            System.out.println("failed");
        }
        else{
            System.out.println("succesful");
        }
    }
    
}
