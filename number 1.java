package Sirname;

import java.util.Scanner;


public class sir {
   public static void main(String[] args){
           // ask for users (sir name)
         //then
         //create variable to store user name. 
         //system to automatically set name as variable 
          
          
          try(Scanner xy = new Scanner(System.in)){
            //ASK FOR SIR NAME FROM USER
            System.out.println("Enter Your SIR Name");
            //variable declaration
            var sirname = xy.nextLine();
            //ASK FOR AGE FROM USER

            System.out.println("Enter Your Age");
            //variable declaration
            var age = xy.nextInt();
            //variable declaration

            var AB = sirname.length();
            //MODULUS IS 2 BY 0
            String Evoc;
            if((age%2)==0){
                Evoc = "EVEN";
            }
            else{
                Evoc = "ODD";
            }
            //GIVE
            System.out.println("Total Number of letters in the SIR Name:" + AB);
            System.out.println("Your AGE IS :" + EvOd);

          }
    }
}
     