package exercise2;
import java.util.Scanner;


public class Circle{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    double radius = input.nextInt();

    double circ = 2.0*Math.PI()*radius;
    double area = Math.PI* Math.pow(radius, 2);

    System.out.println("Circumference: "+ circ);
    System.out.println("Area: "+ area);


  }
}