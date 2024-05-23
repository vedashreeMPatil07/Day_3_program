import java.util.*;
public class Two_d_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of Rows: ");
        int m=sc.nextInt();
        System.out.println("Enter number of cloums:");
        int n =sc.nextInt();

        int [][] a=new int [m][n]; //Initializing 2d array
        System.out.println("Enter elements of array:");
      for(int i=1;i<m;i++)
      {
        for(int j=0;j<m;j++)
        {
           a[i][j]=sc.nextInt();
        }
      }
      System.out.println(Arrays.deepToString(a));
/*Arrays.deepToString(a): string representation of a multi-dimensional array.[[1, 2], [3, 4]]. */




     System.out.println(Arrays.toString(a));
     /*Arrays.toString(a): Prints the default toString representation of the top-level array, showing memory addresses of nested arrays: [[I@15db9742, [I@6d06d69c].
 */
    }
}
