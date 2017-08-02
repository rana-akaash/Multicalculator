import java.util.Scanner;


public class MultiCalculator {
    
    
    public static void main(String[] args) {
        simpleCalculator simCal = new simpleCalculator();
        temprature Temp = new temprature();
        currency Cur = new currency();
        scientificCalculator sciCal = new scientificCalculator();
        
         int choice;
         boolean exit=false;
          Scanner input = new Scanner(System.in);
         while(exit != true)
         {
           
       System.out.println("Press 1 for simple calculator\n 2 for temperature converter\n 3 for currency converter\n"
               + " 4 for scientific calculator\n 0 for exit");
        choice = input.nextInt();
        
        switch(choice)
                {
                        case 1:
                             simCal.functionality();
                             break;
                             
                        case 2:
                             Temp.functionality();
                             break;
                             
                        case 3:
                             Cur.functionality();
                             break;
                             
                        case 4:
                            sciCal.functionality();
                            break;
                            
                        case 0:
                            exit=true;
                            break;
                            
                        default:
                            System.out.println("Invalid");
                            break;
                }
                        
         }
    }
}