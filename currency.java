import java.util.Scanner;


public class currency
{
      public void functionality()
      {
          double num;
          int choice;
          Scanner input = new Scanner(System.in);
            
        System.out.println("Press 1 for convert dollor to euro");
        System.out.println("Press 2 for convert dollor to pound");
        System.out.println("Press 3 for convert dollor to rial");
        System.out.println("Press 4 for convert dollor to rs");
        System.out.println("Press 5 for convert euro to dollor");
        System.out.println("Press 6 for convert euro to pound");
        System.out.println("Press 7 for convert euro to rial");
        System.out.println("Press 8 for convert euro to rs");
        System.out.println("Press 9 for convert pound to dollor");
        System.out.println("Press 10 for convert pound to euro");
        System.out.println("Press 11 for convert pound to rial");
        System.out.println("Press 12 for convert pound to rs");
        System.out.println("Press 13 for convert rial to dollor");
        System.out.println("Press 14 for convert rial to euro");
        System.out.println("Press 15 for convert rial to pound");
        System.out.println("Press 16 for convert rial to rs");
        System.out.println("Press 17 for convert rs to dollor");
        System.out.println("Press 18 for convert rs to euro");
        System.out.println("Press 19 for convert rs to pound");
        System.out.println("Press 20 for convert rs to rial");
           choice = input.nextInt();
           
            System.out.println("Enter amount for conversion");
            num = input.nextDouble();
           
           switch(choice)
           {
               case 1:
                   dol_eur(num);
                   break;
               case 2:
                   dol_pou(num);
                   break;
               case 3:
                   dol_ria(num);
                   break;
               case 4:
                   dol_rs(num);
                   break;
               case 5:
                   eur_dol(num);
                   break;
               case 6:
                   eur_pou(num);
                   break;
               case 7:
                   eur_ria(num);
                   break;
               case 8:
                   eur_rs(num);
                   break;
               case 9:
                   pou_dol(num);
                   break;
               case 10:
                   pou_eur(num);
                   break;
               case 11:
                  pou_ria(num);
                   break;
               case 12:
                   pou_rs(num);
                   break;
               case 13:
                   ria_dol(num);
                   break;
               case 14:
                   ria_eur(num);
                   break;
               case 15:
                   ria_pou(num);
                   break;
               case 16:
                   ria_rs(num);
                   break;
               case 17:
                   rs_dol(num);
                   break;
               case 18:
                   rs_eur(num);
                   break;
               case 19:
                   rs_pou(num);
                   break;
               case 20:
                   rs_ria(num);
                   break;
               default:
                   System.out.println("Invalid");
                   break;
           }
           
      }

                                    public double dol_eur(double dol)
                                    {
                                        System.out.println(dol*0.86);
                                         return dol*0.86;
                                    }

                                    public double dol_pou(double dol)
                                    {
                                        System.out.println(dol*0.77);
                                        return dol*0.77;
                                    }

                                    public double dol_ria(double dol)
                                    {
                                        System.out.println(dol*3.75);
                                         return dol*3.75;
                                    }

                                    public double dol_rs(double dol)
                                    {
                                        System.out.println(dol*105.33);
                                         return dol*105.33;
                                    }

                                    public double eur_dol(double eur)
                                    {
                                        System.out.println(eur*1.16);
                                         return eur*1.16;
                                    }

                                    public double eur_pou(double eur)
                                    {
                                        System.out.println(eur*0.89);
                                         return eur*0.89;
                                    }

                                    public double eur_ria(double eur)
                                    {
                                        System.out.println(eur*4.36);
                                         return eur*4.36;
                                    }

                                    public double eur_rs(double eur)
                                    {
                                        System.out.println(eur*122.55);
                                         return eur*122.55;
                                    }

                                    public double pou_dol(double pou)
                                    {
                                        System.out.println(pou*1.30);
                                         return pou*1.30;
                                    }

                                    public double pou_eur(double pou)
                                    {
                                        System.out.println(pou*1.12);
                                         return pou*1.12;
                                    }

                                    public double pou_ria(double pou)
                                    {
                                        System.out.println(pou*4.89);
                                         return pou*4.89;
                                    }

                                    public double pou_rs(double pou)
                                    {
                                        System.out.println(pou*137.47);
                                         return pou*137.47;
                                    }

                                    public double ria_dol(double ria)
                                    {
                                        System.out.println(ria*0.27);
                                         return ria*0.27;
                                    }

                                    public double ria_eur(double ria)
                                    {
                                        System.out.println(ria*0.23);
                                         return ria*0.23;
                                    }

                                    public double ria_pou(double ria)
                                    {
                                        System.out.println(ria*0.20);
                                         return ria*0.20;
                                    }

                                    public double ria_rs(double ria)
                                    {
                                        System.out.println(ria*28.9);
                                         return ria*28.9;
                                    }

                                    public double rs_dol(double rs)
                                    {
                                        System.out.println(rs*0.0095);
                                         return rs*0.0095;
                                    }

                                    public double rs_eur(double rs)
                                    {
                                        System.out.println(rs*0.0082);
                                         return rs*0.0082;
                                    }

                                    public double rs_pou(double rs)
                                    {
                                        System.out.println(rs*0.0073);
                                         return rs*0.0073;
                                    }

                                    public double rs_ria(double rs)
                                    {
                                        System.out.println(rs*0.036);
                                         return rs*0.036;
                                    }
        
}