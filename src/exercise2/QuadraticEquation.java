package exercise2;
import java.util.Scanner;


public class  QuadraticEquation{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        double b = input.nextInt();
        double c = input.nextInt();
        
        double x1;
        double x2;
        
        if(a!=0){
          double disc= b*b - 4*a*c;
          if(disc>=0){

            x1= ((-b+Math.sqrt(disc))/2*a);
            x2= ((-b-Math.sqrt(disc))/2*a);
            System.out.println(x1+", "+ x2);

          }else{
              System.out.println("Imaginary values");
          }
        }else{
          if(b!=0){
              System.out.println(-c/b);

          }else{
            if(c!=0){
              System.out.println("No values ");
              
            }
            else{
              System.out.println("Many values ");
            }
          }
        }
    }

}