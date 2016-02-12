/**
 *This is a program that remind user's birthday
 * @author Zhipeng Mei
 * CCSF ID: w10479122
 * Date: Sept 12, 2015
 */

import java.util.Scanner;
public class Birthday_Reminder {
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner in = new Scanner (System.in);
        //menu method

        boolean choice = false;
        while(!choice)
        {
            menu();
            if(in.hasNextInt())
            {
                int chose = in.nextInt();
                if(chose > 0 && chose < 3)
                {
                    switch(chose)
                    {
                        case 1: System.out.println("Birthday Reminder\n");
                                exercise1();
                                break;
                        case 2: System.out.println("Change Machine\n");
                                exercise2();
                                break;
                        default: exercise1();
                                break;
                    }

                }//if condition

                else{
                    System.out.println("Input Error, please enter a valid choice.\n");
                }
            }//if hasNextInt statement

            else
            {
              String input = in.next();

              if(input.equals("Q"))
              {
                  System.out.println("Quitting...");
                  choice = true;
              }
              else
              {
                  System.out.println("Input Error, please enter a valid choice.\n");
              }
            }
        }//while loop, !choice condition
    }

    public static void menu() {
        System.out.println("Menu:");
        System.out.println("1. Birthday Reminder");
        System.out.println("2. Change Machine");
        System.out.println("Q to quit");
        System.out.println("Enter 1 or 2 to continue.");
    }


     /************************
      *
      *This is exercise 1
      *************************
      */
    public static void exercise1()
    {
        Scanner in = new Scanner (System.in);

        System.out.println("\nWhat is your first name?");
        String firstName = in.next();

        System.out.println("\nWhat is your last name?");
        String lastName = in.next();

        String defaultMonth1 = "January";
        String defaultMonth2 = "February";
        String defaultMonth3 = "March";
        String defaultMonth4 = "April";
        String defaultMonth5 = "May";
        String defaultMonth6 = "June";
        String defaultMonth7 = "July";
        String defaultMonth8 = "August";
        String defaultMonth9 = "September";
        String defaultMonth10 = "October";
        String defaultMonth11 = "November";
        String defaultMonth12 = "December";

        boolean validMonth = false;
        while(!validMonth){

                System.out.println("\nEnter your biirthday\nMonth?");
                String month = in.next();

                if(month.equals(defaultMonth1) || month.equals(defaultMonth2)
                        || month.equals(defaultMonth3)|| month.equals(defaultMonth4)
                        || month.equals(defaultMonth5)|| month.equals(defaultMonth6)
                        || month.equals(defaultMonth7)|| month.equals(defaultMonth8)
                        || month.equals(defaultMonth9)|| month.equals(defaultMonth10)
                        || month.equals(defaultMonth11)|| month.equals(defaultMonth12))
                {
                    boolean dayRange = false;
                    while(!dayRange){
                        System.out.println("\nDay?");

                        //only integer input
                        if(in.hasNextInt()){
                            int day = in.nextInt();

                            if(day<32 && day>0)
                            {
                                dayRange = true;

                                boolean yearRange = false;
                                while(!yearRange)
                                {
                                    System.out.println("\nYear?");
                                    if(in.hasNextInt()){
                                      int year = in.nextInt();
                                      if(year<2020 && year>1500)
                                      {

                                        System.out.println("\n"+ firstName + " " + lastName +
                                                            "'s birthday is on: " +
                                                            month + " " + day + ", " +
                                                            year + ".\n");
                                        yearRange = true;
                                        }
                                      else
                                      {
                                          System.out.println("Input error, please enter a valid Month.");
                                      }
                                    }
                                    else
                                    {
                                        String input = in.next();
                                        if(input.equals("Q"))
                                        {
                                            System.out.println("Quitting...");
                                        }
                                        else
                                        {
                                            System.out.println("Input error, please enter a valid Month.");
                                        }
                                    }

                                }
                            }//if condidition
                            else
                            {
                                System.out.println("Input error, please enter a valid Month.");
                            }

                        }
                        else
                        {
                           String input = in.next();
                           if(input.equals("Q"))
                           {
                               System.out.println("Quitting...");
                           }
                           else
                           {
                               System.out.println("Input error, please enter a valid Month.");
                           }
                        }



                        validMonth=true;

                    }//while loop, booeal: dayRange
                }//if month.equal conditions
                else
                {
                    System.out.println("Input error, please enter a valid Month.");

                }
            }//while loop, boolean: done



    }




    public static void exercise2()
    {
        /************************
        *
        *This is exercise 2
        *************************
        */
        Scanner in = new Scanner (System.in);

        boolean donedone = false;

        while(!donedone){

            //obtain user input by using Scanner
            System.out.println("How many pennies do you have?");
            if(in.hasNextInt())
            {
               int totalPennies = in.nextInt();

            if(totalPennies < 5000 && totalPennies>0){

                //dollar in amount of ten
               int twentyDollar = totalPennies / 2000;

               System.out.println("\nYou should get back:");
               System.out.println("The number of $20 bills: " + twentyDollar);

               //dollar in amount of ten
               //tempTen is temporary to store the convertion
               int tempTen = totalPennies - (twentyDollar * 2000);
               int tenDollar = tempTen / 1000;

               System.out.println("The number of $10 bills: " + tenDollar);

               //dollar in amount of five
               int tempFive = tempTen - (tenDollar * 1000);
               int fiveDollar = tempFive / 500;

               System.out.println("The number of $5 bills: " + fiveDollar);

               //dollar amount in one
               int tempOne = tempFive - (fiveDollar * 500);
               int oneDollar = tempOne / 100;

               System.out.println("The number of $1 bills: " + oneDollar );

               //amount in quarter
               int tempQuarter = tempOne - (oneDollar * 100);
               int quarter = tempQuarter / 25;

               System.out.println("The number of quarters: " + quarter );

                //amount in dime
               int tempDime = tempQuarter - (quarter * 25);
               int dime = tempDime / 10;
               System.out.println("The number of dimes: " + dime );

                //amount in nickle
               int tempNickle = tempDime - (dime * 10);
               int nickle = tempNickle / 5;

               System.out.println("The number of nickles: " + nickle );


                //amount in cent
               int tempCent = tempNickle - (nickle * 5);
               int cent = tempCent / 1;

               System.out.println("The number of pennies: " + cent +"\n" );

               donedone = true;
            }
        else {
            System.out.println("The jar cannot hold more than $50 worth of pennies.\n");
            }
        }
            else
            {
               String input = in.next();
               if(input.equals("Q"))
               {
                   System.out.println("Quitting...");
               }
               else
               {
                   System.out.println("Input error, please enter a valid amount.\n");
               }
            }

       }
    }
}
