package test1;

public class Fibonacci {
    public static void main(String[] args) {
    	int number=13;
        int n1=0,n2=1,n3=0;
    	System.out.println("Fibonacci series of "+number);
        while(n2<number){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(n3+" ");
        }
    }
}

