import java.util.*;
public class fibonacci{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=0;i<a;i++){
		System.out.println(fib(i) + " ");
		}	
	}
static int fib(int n){
	if(n==0)
	{
	return 0;
	}
	if(n==1){
		return 1;}
	return fib(n-1)+fib(n-2);
} 
}

