package test1;


interface NumberPredicate{
	void numCheck(int x);
}

public class NumberPredicateDemo {
	public static void Main(String[] arr) {
		NumberPredicate obj=(int x)->{
			if(x%2==0)
			{
				System.out.println(x+"is a even number");
			}
			if(x>0) 
			{
				System.out.println(x+"is a positive number");
			}
			if(x<0)
			{
				System.out.println(x+"is a negative number");
			}
		};
		obj.numCheck(5);
	}
}
