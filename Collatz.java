package test1;

public class Collatz {
    public static void main(String[] args) {
        int n=5;
        System.out.print("CollatzSeries: "+n+" ");
        while (n>1) {
            if(n%2==0){
                n=n/2;
            }
            else{
                n=(n*3)+1;
            }
            System.out.print(n+" ");
            
        }
    }
    
}

