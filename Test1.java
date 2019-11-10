package by.htp.les08;

public class Test1 {

	private int a ;
	private int b ;

	public void setA(int A)	{
		a = A;

	}

	public void setB(int B)	{
		b = B;

	}

	public void PrintA()	{
		System.out.println("a = " +a);

	}

	public void PrintB()	{
		System.out.println("b = " +b);

	}

	 public int getSum(){
		 int sum;
		 sum = a+b;
		return sum;
	      
	    }
	 
	 public int getMax(){
	        if (a < b){
	            return b;
	        } else {
	            return a;
	        }
	    }

}
