package test1;

//loop patter
//2
//3 5
//7 11 13
//17 19 23 29

public class fivePattern {
  public static void main(String[] args) {
      int n=2;
      boolean value = true;
      for(int i=1;i<=4;i++) {
    	  for(int j=1;j<=i;j++) {
    		  while(true){
            	  value =true;
                  for(int k=2;k<=n/2;k++){
                      if(n%k==0){
                    	  value= false;
                      }
                  }
                  if(value==true){
                      System.out.print(n+" ");
                      n++;
                      break;
                  }
                  n++;
              }  
    	  }
    	  System.out.println();
      }
  }
}
