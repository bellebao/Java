package firstJavaProgram;

public class ClimbStairs {
	public void main(String [] args)
	{
		int n = 10;
		int results = climb(n);
		System.out.println(results);
		
		
	}
	public int climb(int n)
	{
	if (n==1||n==2)
		return n;
	else return climb(n-1) + climb(n-2);
	}
}
