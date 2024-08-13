package test1;


abstract class BankAccount {
    abstract int deposit(int x);{
    	
    }
    abstract int withdraw(int y);{
    	
    }
    
}



class SavingsAccount extends BankAccount {
	int balance =100000;
    int deposit(int x){
        return balance+x;
    }
    int withdraw(int x){
        return balance-x;
    }
    
}

class CurrentAccount extends BankAccount {
	int balance =20000;
    int deposit(int x){
        return balance+x;
    }
    int withdraw(int x){
        return balance-x;
    }
    
}


public class BankAccountDemo {
    public static void main(String[] args) {
        SavingsAccount user1 = new SavingsAccount();
        System.out.println("available balance: "+user1.deposit(30000));
        System.out.println("available balance: "+user1.withdraw(30000));

        CurrentAccount user2= new CurrentAccount();
        System.out.println("available balance: "+user2.deposit(4000));
        System.out.println("available balance: "+user2.withdraw(3000));

    }
}
