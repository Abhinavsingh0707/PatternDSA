public class Fibonacci {
   public static void main(String[] args) {
    System.out.println(fibbo(2));
   } 

   static int fibbo(int n){
    //base condition
    if (n < 2) {
        return n;
    }
    return fibbo(n-1) + (n-2);
}


}
