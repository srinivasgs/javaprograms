package programs;

public class Fibonacci {
	public static void main(String args[]){
		int n =10;
		System.out.println(fibo(n,new int[n+1]));
	}
	
	private static int fibo(int i,int[] mem){
		if(i == 0 || i == 1)
			return i;
		
		if(mem[i] == 0)
			mem[i] = fibo(i-1,mem)+fibo(i-2,mem);
		
		return mem[i];
	}
}
