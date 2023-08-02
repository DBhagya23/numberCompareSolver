/*cuple of number compare Solver */
import java.util.*;

class main{
    
        public static void main (String args[]){
            Scanner input = new Scanner(System.in);
            
            System.out.print("Enter no 1: ");
            int number1 = input.nextInt();
            
            System.out.print("Enter no 2: ");
            int number2 = input.nextInt();
            
            System.out.print("");
            
            System.out.println("A..Addition");
            System.out.println("B..Subtraction");
            System.out.println("C..Multification");
            System.out.println("D..Max value");
            
            System.out.print("");
            
            System.out.print("Enter a Letter :");
            String letter = input.next();
            
            System.out.print("");
            
            switch(letter){
                case "A":
                    System.out.print("Addition :" + (number1 + number2));
                    break;
                case "B":
                    int result = 0 ;
                    if(number1 > number2){
                         result = number1 - number2 ; 
                        
                    }else{
                         result = number2 - number1 ;
                    }
                    System.out.print("Substraction : " + result);
                    break;
                case "C":
                    System.out.print("Multification :" + (number1*number2));
                case "D":
                    int Max = 0;
                    if(number1 > number2){
                        Max = number1 ;
                    }else {
                        Max = number2 ; 
                    }
                    System.out.print(Max);
                    break;
                default:
                    System.out.print("Invalid  Entry");
            }
            
        }
    
    
    
    
}

