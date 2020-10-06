package exercise2;
import java.util.Scanner;


public class DayOfWeek{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int num = input.nextInt();

    if(num == 1){
      System.out.println("Day of week: Monday");

    }else if(num == 2){
    System.out.println("Day of week: Tuesday");
    }else if(num == 3){
      System.out.println("Day of week: Wednesday");
    }else if(num == 4){
      System.out.println("Day of week: Thursday");
    }else if(num == 5){
      System.out.println("Day of week: Friday");
    }else if(num == 6){
      System.out.println("Day of week: Saturday");
    }else if(num == 7){
      System.out.println("Day of week: Sunday");
    }else{
      System.out.println("Invalid day");
    }

    


  }
}