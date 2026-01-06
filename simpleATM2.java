 import java.util.Scanner; 
  public class SimpleATM2 {

    public static void main(String[] args)
    {
		Scanner scanner=new Scanner(System.in);
 
int balance=1000;
int pin=1234;
int enteredPin;
int amount;
int choice;

System.out.print("Enter the Your ATM Pin");
enteredPin=scanner.nextInt();
if (enteredPin!=pin){
    System.out.println("Incorrect Pin");
	return;

}

do{
	System.out.println("====ATM=====");
	System.out.println("\n 1.Check Balance");
	System.out.println("\n 2.Deposit");
	System.out.println("\n 3. Amount Widrawl");
	System.out.println("\n 4.exit");
	System.out.print("choose an option");
	choice=scanner.nextInt();
	
	switch(choice){
		
	case 1:
	System.out.println("Your Current Balance"+balance);
	break;	
	case 2:
	System.out.println("Enter Amount For Deposit" );
	amount=scanner.nextInt();
	if(amount>0)
	{
	balance+=amount;
	System.out.println("R"+amount+"Deposit Succsessfully");
	
	break;	
	}
	case 3:
	System.out.println("Widrawl amount" );
	amount=scanner.nextInt();
	if(amount>0 && amount<=0){
	amount-=balance;
	System.out.println("Widral amount successfully" );
	break;
	}else{
		
	System.out.println("Insufficient balance" );
	break;
	}
	case 4: 
System.out.println("Thank you for using the ATM. Goodbye!"); 
break;
	
	default:
		
System.out.println("Invalid Option"); 
	}
}
while(choice!=4);
 scanner.close();
	
}
	
}


