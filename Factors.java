package test1;

//java program to display factors of given number
public class Factors {
  public static void main(String[] args) {
      int n=20;
      for(int i=1;i<=n;i++){
          if(n%i==0){
              System.out.println("factor of 20: "+i);
          }
      }    
  }
}