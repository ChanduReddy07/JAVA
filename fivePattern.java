package test1;

//loop patter
//2
//3 5
//7 11 13
//17 19 23 29

public class fivePattern {
  public static void main(String[] args) {
      int np=29;
      int n=2;
      boolean value = true;
      for(int i=1;i<=4;i++) {
    	  for(int j=1;j<=i;j++) {
    		  while(true){
            	  value =true;
                  for(int q=2;q<=n/2;q++){
                	  n++;
                      if(n%q==0){
                    	  value= false;
                      }
                  }
                  if(value==true){
                      System.out.print(n+" ");
                      break;
                  }
              }  
    	  }
    	  System.out.println();
      }
  }
}
