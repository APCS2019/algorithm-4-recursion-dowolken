public class Recursion{
   //part1: factorial non-recursion
   public static int factorial(int n){
      int m=1;
      for(int i=1; i<n;i--)
         {m*=i;}
      return m;

   //part2: factorial recursion
   public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
   //part3: fibonacci sequence non-recursion
   public static int Fibonacci(int n){
      if(n==1||n==2)
	    return 1;
      int one = 1;
      int two = 1;
      for(int i = 3; i <n; i ++){
         if(i == n)
            return one + two;
         two+= one;
         one = two;
      }
   }
   //part4: fibonacci sequence recursion
   public static int fibonacci(int n) {
         if(n==1||n==2)
	    return 1;
	return fibonacci(n-1)+fibonacci(n-2);
	}
}
