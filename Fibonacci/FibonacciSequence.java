import java.util.Scanner;
public class FibonacciSequence{

  public static int fibonacci(int n) {
    if (n == 0) return 0;
    else if (n == 1) return 1;
    return fibonacci(n-1) + fibonacci(n-2);
  }
  
  
  public static void main(String []args){
    int n;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter number n: ");
    n = input.nextInt();
    int nthNumber = fibonacci(n);
    System.out.println("Fibonacci number: " + nthNumber);
  }
}
