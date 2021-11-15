import java.util.Scanner;
public class prime{
	public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	System.out.println("Enter number");
	int n = s.nextInt();
	System.out.println(isprime(n));
	}
        static boolean isprime(int n){
	for(int i=2;i*i<=n;i++){
		if((n%i)==0){
	         return false;}
	}
	return true;}
}
