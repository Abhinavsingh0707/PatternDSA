import java.util.Scanner;

public class DeletionArray {
    public static void main(String[] args) {
        int n, m ;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of the elements in array");
        n = s.nextInt();
        int a[] = new int[n];
        int b[] = new int[n-1];
        System.out.println("Enter the values");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt(); //a[0],a[1]
        }
        System.out.println("Enter the index value to be deleted");
        m = s.nextInt(); //2
        s.close();
        for (int i = 0; i < a.length; i++) {  //a[] = 10 20 30 40 50 m = 2
            if (i < m) {
                b[i] = a[i];
            }else if (i == m) {
                continue;
            }else {
                b[i-1] = a[i];
            }
            
        }
        System.out.println("Elements are: ");
        for (int i = 0; i < n-1; i++) {
            System.out.println(b[i]);
        }
    }
}
