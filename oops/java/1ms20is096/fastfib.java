import java.util.*;
public class fastfib{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter value");
	int n = sc.nextInt();
	for(int i=0;i<n;i++){
	System.out.println(fasterFib(i) + " ");
	}
		
	
}
private static Map<Integer, Integer> results = new HashMap<>();

public static int fasterFib(int n) {
  if (n == 0) {
    return 0;
  } else if (n <= 2) { 
    return 1;
  }
  if (results.get(n) != null) {
    return results.get(n);
  } else {
    int v = fasterFib(n - 1) + fasterFib(n - 2);
    results.put(n, v);
    return v;
  }
}
}
