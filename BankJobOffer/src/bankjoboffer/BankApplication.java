
package bankjoboffer;

import java.util.Scanner;


public class BankApplication {
    public static void main(String[] args) {
        Bankaccount obj1=new Bankaccount("Raihanul Islam","ab23dj2");
        obj1.showmenu();
    }
    
}
class Bankaccount{
    int balance;
    int previoustransiction;
    String customerName;
    String customerId;
    Bankaccount(String cName, String cId){
        customerName=cName;
        customerId=cId;
        
    
    }
    void deposit(int amount){
        if(amount!=0){
            balance=balance+amount;
            previoustransiction=amount;
        }
        
    }
    void withdraw(int amount){
        if(amount!=0){
            balance=balance-amount;
            previoustransiction=-amount;
            
        }
        
    }
    void getprevioustransiction(){
        if(previoustransiction > 0){
            System.out.println("Deposited :"+previoustransiction);
            
        }
        else if(previoustransiction<0){
            System.out.println("Withdraw : "+previoustransiction);
        }
        else{
            System.out.println("there is no transiction occurd");
        }
        
    }
       void showmenu(){
           char option='\0';
           Scanner scanner = new Scanner(System.in);
           System.out.println("Welcome to : "+customerName);
           System.out.println("Your Id is : "+customerId);
           System.out.println("\n");
           System.out.println("A. chack Balance :");
           System.out.println("B. Deposit");
           System.out.println("C. Withdraw");
           System.out.println("D. Previous transiction");
           System.out.println("E. Exit");
       
           
           
               
            
       do{
           System.out.println("====================================================");
           System.out.println("Enter an option :");
           System.out.println("\n");
           option=scanner.next().charAt(0);
           System.out.println("\n ");
           switch(option){
               case 'A':
                   System.out.println("=============================================");
                   System.out.println("Balance="+balance);
                   System.out.println("----------------------------------------------");
                   System.out.println("\n");
                   break;
               case 'B':
                   System.out.println("===============================================");
                   System.out.println("Enter an amount of deposit");
                   System.out.println("------------------------------------------------");
                   int amount =scanner.nextInt();
                  deposit(amount);
                   System.out.println("\n");
                   break;
               case 'C':
                   System.out.println("================================================");
                   System.out.println("Enter a withdrw amount ");
                   System.out.println("\n");
                   System.out.println("------------------------------------------------");
                   int amount2=scanner.nextInt();
                   deposit(amount2);
                   System.out.println("\n");
                   break;
               case 'D':
                   System.out.println("==================================================");
                   getprevioustransiction();
                   System.out.println("----------------------------------------------------");
                   System.out.println("\n");
                   break;
               case 'E':
                   
                   System.out.println("*****************************************************");
               default:
                   System.out.println("INVALID OPTION PLEASE TRY AGAIN");
                   break;
           }
           
       } 
       while(option!= 'E');
           System.out.println("Thank you for using our service");
                 
        
    
       
        
       }
}
   

    


