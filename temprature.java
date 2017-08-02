
import java.util.Scanner;


public class temprature {
    
     public void functionality(){

            double num;
            int choice;
            Scanner input = new Scanner(System.in);
            
            System.out.println("Enter a number");
            num = input.nextDouble();
            
            System.out.println("Press 1 for convert feh to cel");
            System.out.println("Press 2 for convert kel to cel");
            System.out.println("Press 3 for convert cel to feh");
            System.out.println("Press 4 for convert kel to feh");
            System.out.println("Press 5 for convert cel to kel");
            System.out.println("Press 6 for convert feh to kel");
            choice = input.nextInt();
            
            switch(choice)
            {
                case 1:
                    feh_cel(num);
                    break;
                case 2:
                    kel_cel(num);
                    break;
                case 3:
                    cel_feh(num);
                    break;
                case 4:
                    kel_feh(num);
                    break;
                case 5:
                    cel_kel(num);
                    break;
                case 6:
                    feh_kel(num);
                    break;
                default:
                    System.out.println("Invalid");
                    break;
            }
            
        }

                            public double feh_cel(double f)
                            {
                                System.out.println((f-32)*5/9);
                                   return (f-32)*5/9;
                            }

                            public double kel_cel(double k)
                            {
                                System.out.println(k-273.15);
                                   return k-273.15;
                            }

                            public double cel_feh(double c)
                            {
                                System.out.println((c*9/5)+32);
                                   return (c*9/5)+32;
                            }

                            public double kel_feh(double k)
                            {
                                System.out.println((k-273.15f)*9/5+32);
                                   return (k-273.15f)*9/5+32;
                            }

                            public double cel_kel(double c)
                            {
                                System.out.println((c+273.15));
                                   return c+273.15;
                            }

                            public double feh_kel(double f)
                            {
                                System.out.println((f-32)*5/9+273.15);
                                   return (f-32)*5/9+273.15;
                            }

}