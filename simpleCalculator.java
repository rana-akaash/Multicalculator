import java.util.Scanner;



        public class simpleCalculator {

        public void functionality(){

            double num1, num2;
            int choice;
            Scanner input = new Scanner(System.in);
            
            System.out.println("Enter a number");
            num1 = input.nextDouble();

             System.out.println("Press 1 for add");
             System.out.println("Press 2 for subtract");
             System.out.println("Press 3 for multiply");
             System.out.println("Press 4 for divide");
             System.out.println("Press 5 for square");
             System.out.println("Press 6 for factorial");
             choice = input.nextInt();
             if(choice==5)
             {
                 square(num1);
             }
             
             else if(choice==6)
             {
                 fact(num1);
             }
             
            else
             {
                 System.out.println("Enter a number");
                 num2 = input.nextDouble();
                switch(choice)
                {
                        case 1:
                             add(num1 , num2);
                             break;
                             
                        case 2:
                             sub(num1 , num2);
                             break;
                             
                        case 3:
                             mul(num1 , num2);
                             break;
                             
                        case 4:
                            div(num1 , num2);
                            break;
                            
                        default:
                            System.out.println("Invalid");
                            break;
                }
             }
        }
    
                                    public double add(double a, double b)
                                    {
                                         System.out.println("a+b");
                                          return a+b;
                                    }

                                    public double sub(double a, double b)
                                    {
                                         System.out.println("a-b");
                                          return a-b;
                                    }

                                    public double mul(double a, double b)
                                    {    
                                         System.out.println("a*b");
                                          return a*b;
                                    }

                                    public double div(double a, double b)
                                    {
                                          if(b>0)
                                        { 
                                          System.out.println("a/b");
                                          return a/b;
                                        }
                                         else
                                          {
                                              System.out.println("Undefined");
                                              return 0;
                                          }
                                    }
                                    public double square(double a)
                                    {
                                         System.out.println("a*a");
                                          return a*a;
                                    }

                                    public double fact(double a)
                                    {
                                          float f=1;
                                          for(int i=1; i<=a; i++)
                                            {
                                               f=f*i;
                                            }
                                          System.out.println("f");
                                          return f;
                                    }

}