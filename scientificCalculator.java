import static java.lang.Math.*;
import java.util.Scanner;


public class scientificCalculator extends simpleCalculator{
    public void functionality()
    {
        double num1, num2;
        int choice;
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Press 1 for log, 2 for sin");
        System.out.println("Press 2 for sin");
        System.out.println("Press 3 for cosec");
        System.out.println("Press 4 for cos");
        System.out.println("Press 5 for sec");
        System.out.println("Press 6 for tan");
        System.out.println("Press 7 for cot");
        System.out.println("Press 8 for power");
        System.out.println("Press 9 for square");
        choice = input.nextInt();
        
        switch(choice){
            case 1:
                System.out.println("Enter a number");
                num1 = input.nextDouble();
                Log(num1);
                break;
                
            case 2:
                System.out.println("Enter a number");
                num1 = input.nextDouble();
                Sin(num1);
                break;
            
            case 3:
                System.out.println("Enter a number");
                num1 = input.nextDouble();
                Cosec(num1);
                break;
                
            case 4:
                System.out.println("Enter a number");
                num1 = input.nextDouble();
                Cos(num1);
                break;
                
            case 5:
                System.out.println("Enter a number");
                num1 = input.nextDouble();
                Sec(num1);
                break;
                
            case 6:
                System.out.println("Enter a number");
                num1 = input.nextDouble();
                Tan(num1);
                break;
                
            case 7:
                System.out.println("Enter a number");
                num1 = input.nextDouble();
                Cot(num1);
                break;
                
            case 8:
                System.out.println("Enter a number");
                num1 = input.nextDouble();
                System.out.println("Enter power");
                num2 = input.nextDouble();
                Pow(num1, num2);
                break;
                
            case 9:
                System.out.println("Enter a number");
                num1 = input.nextDouble();
                Sqrt(num1);
                break;
                
            default:
                System.out.println("Invalid");
                break;
        }
    }
    
                        public double Log(double x)
                        {
                          System.out.println(log(x));
                            return log(x); 
                        }

                        public double Sin(double x)
                        {
                            System.out.println(sin(x));
                              return sin(x);
                        }

                        public double Cosec(double x)
                        {
                            System.out.println(1/sin(x));
                              return 1/sin(x);
                        }

                        public double Cos(double x)
                        {
                            System.out.println(cos(x));
                              return cos(x);
                        }

                        public double Sec(double x)
                        {
                            System.out.println(1/cos(x));
                              return 1/cos(x);
                        }

                        public double Tan(double x)
                        {
                            System.out.println(tan(x));
                              return tan(x);
                        }

                        public double Cot(double x)
                        {
                            System.out.println(1/tan(x));
                              return 1/tan(x);
                        }

                        public double Sqrt(double x)
                        {
                            System.out.println(sqrt(x));
                              return sqrt(x);
                        }

                        public double Pow(double x, double y)
                        {
                            System.out.println(pow (x , y));
                              return pow(x , y);
                        }
    
}
