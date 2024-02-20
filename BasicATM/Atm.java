import java.util.*;

class Atm {
    float balance;
    int Pin = 5678;

public void Checkpin(){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the pin: ");
    int enteredpin=sc.nextInt();
    if(enteredpin==Pin){
        menu();
    }
    else{
        System.out.println("Enter a valid pin");
    }

    
}
public void Checkbalance(){
    System.out.println("Balance is: "+balance);

    menu();
}

public void Withdraw(){
    System.out.println("Enter the amount you want to withdraw: ");
    Scanner sc=new Scanner(System.in);
    int amount=sc.nextInt();
    if(amount>balance){
        System.out.println("Insufficient balance");
    }
    else{
        balance=balance-amount;
    }
    System.out.println("Amount withdrawn Successfully!");

    menu();
}

public void Deposit(){
    System.out.println("Enter the amount you want to deposit: ");
    Scanner sc=new Scanner(System.in);
    int amount=sc.nextInt();
    balance=balance+amount;

    System.out.println("Amount deposited successfully!");
    System.out.println();

    menu();

}

public void menu(){
    System.out.println("Enter your choice: ");
    System.out.println("1.Check Balance");
    System.out.println("2.Withdraw Money");
    System.out.println("3.Deposit Money");
    System.out.println("4.Exit");

    Scanner sc=new Scanner(System.in);
    int choice=sc.nextInt();
    if(choice==1){
        Checkbalance();
    }
    else if(choice==2){
        Withdraw();
    }
    else if(choice==3){
        Deposit();
    }
    else if(choice==4){
        return;
    }
    else{
        System.out.println("Enter a valid choice");
    }

}

public static void main(String[] args) {
    Atm obj=new Atm();
    obj.Checkpin();
}


}
