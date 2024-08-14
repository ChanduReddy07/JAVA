//loop pattern
//8
//16 17
//32 33 34 35
//64 65 66 67 68 69 70 71

package test1;
import java.lang.Math;

public class fourPattern {
  public static void main(String[] args) {
      int start=8,temp=start;
      int rows=4;
      System.out.println(start);
      for(int i=1;i<=rows-1;i++){
          temp=temp*2;
          start=temp;
          for(int j=1;j<=Math.pow(2, i);j++){
              System.out.print(start++ +" ");
          }
          System.out.println();
      }
  }
}

