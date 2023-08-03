import java.util.*;

class Main{
    
    public static void main(String args[]){
        
        Scanner input_num = new Scanner (System.in);
        
        System.out.println("Enter no 01 :");
        int num01 = input_num.nextInt();
        
        System.out.println("Enter no 02 :");
        int num02 = input_num.nextInt();
        
            System.out.println("");
             
        System.out.println("A.Addition :");
        System.out.println("B.Substraction :");
        System.out.println("C.Devision :");        
        System.out.println("D.Multipication :" );
        
        System.out.println("Enter the letter :");
        String letter = input_num.next();
        
 
         switch(letter){
            case "A" :
                Addition(num01,num02);
                break;
            case "B":
                Substraction(num01,num02);
                break;
            case "C":
                Devision(num01,num02);
                break;
            case "D":
               Multipication(num01,num02);
               break;
            default:
            System.out.println("invalid entry");
                
                
        }    
        
    }
    
    public static void Addition(int num01 , int num02){
        
        int result = num01 + num02;
        System.out.println("Addition is " + result);
    }
    
    public static void Substraction(int num01 , int num02){
    int result = 0;
        if (num01>num02)
        {
            result = num01 - num02;
            System.out.println(result);
        }
        else
        {
            result = num02 - num01;
            System.out.println("Substraction is " + result);
        }
    
    }
    public static void Devision(int num01 , int num02)
        {
            int result = num01 / num02;
            System.out.println("Devision is " + result);
        }
    
    public static void Multipication(int num01 , int num02){
         int result = num01 * num02;
            System.out.println("Multipication is " + result);
        
    }      
}
