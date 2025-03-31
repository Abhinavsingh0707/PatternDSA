import java.util.Scanner;

public class InsertionArray {
    public static void main(String[] args) {
        int n,p,m;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of the elements in array");
        n = s.nextInt();
        int a[] = new int[n];
        int b[] = new int[n+1];

        System.out.println("Enter the values");
        for(int i = 0; i < n; i++){
            a[i] = s.nextInt();  //a[0],a[1]
        }
        System.out.println("Enter the index value to be inserted");
        m = s.nextInt();// 3
        System.out.println("Enter the value to be inserted ");
        p = s.nextInt();// 80

        for (int i = 0; i < n+ 1; i++) // 10,20,30,40
         {
            {
                if(i < m){
                    b[i] = a[i]; // 10 20 30
                }else if (i == m) {
                    b[i] = p;   // insert hoga yaha 80
                }else{
                    b[i] = a[i-1]; //insert hoga 3 index se leke age ke elements
                }
            }
        }
        System.out.println("Element are: ");
        for (int i = 0; i < n+1; i++) {
            System.out.println(b[i]); //10,20,30,80,40
        }
    }
}
/// time complexity bhot bdh jaati hai
