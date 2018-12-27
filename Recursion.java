public class Recursion{
   //part1: factorial non-recursion
   public static int factorial(int n){
      for(int i=0; i<n;i++)
         {

   //part2: factorial recursion
   public static void rec(int n) {
		if(n==0)
			return;
		rec(n-1);
	}
   //part3: fibonacci sequence non-recursion
   
   
   
   //part4: fibonacci sequence recursion
   public static int fibonacci(int n) {
		if(n==1||n==2)
			return 1;
		return fibonacci(n-1)+fibonacci(n-2);
	}
}
